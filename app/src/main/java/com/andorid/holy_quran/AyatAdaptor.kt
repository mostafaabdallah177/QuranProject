    package com.andorid.holy_quran

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.andorid.holy_quran.R.id.psmala
import kotlinx.android.synthetic.main.activity_quran.view.*

    class AyatAdaptor (var items :List<String>)
    : RecyclerView.Adapter<AyatAdaptor.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_quran,parent,false)
        return ViewHolder(view)
     }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val aya = items.get(position)
        holder.aya.setText(aya + "{"+(position+1) +"}")
    }

    class ViewHolder(itemview: View):RecyclerView.ViewHolder(itemview){
                val aya =itemview.aya
    }
}