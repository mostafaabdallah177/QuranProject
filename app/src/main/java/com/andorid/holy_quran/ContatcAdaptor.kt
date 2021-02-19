    package com.andorid.holy_quran

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContatcAdaptor ( val items :List<String>)
    : RecyclerView.Adapter<ContatcAdaptor.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.items_actitiy,parent,false)
        return ViewHolder(view)
     }
    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val soraName=items.get(position)
        holder.souraName.setText(soraName)

        if (onitemsclick!=null){
            holder.itemView.setOnClickListener {
                onitemsclick?.onItemsClick(position, soraName)
            }
        }
    }

        var onitemsclick:OnItemClickLeanar ?=null
    interface  OnItemClickLeanar{
        fun onItemsClick(position: Int,souraName:String)
    }

    class ViewHolder(itemview: View):RecyclerView.ViewHolder(itemview){
        val souraName:TextView = itemview.findViewById(R.id.souraName)
    }
}