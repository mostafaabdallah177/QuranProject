package com.andorid.holy_quran

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_tasbeh.*

class TasbehFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tasbeh, container, false)
    }

    var count = 1

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navgtion_tabe7.selectedItemId = R.id.tasbe7
        refrach.setOnClickListener(View.OnClickListener {
            count++
            tasb7nmber.setText("" + count).toString()
            val totalcount = count
            if (count == 10) {
                val hasnatcount = count * 693
                Toast.makeText(context, "" + hasnatcount + "حسنة", Toast.LENGTH_LONG).show()
            } else if (count == 100) {
                val hasnatcount = count * 693
                Toast.makeText(context, "" + hasnatcount + "حسنة", Toast.LENGTH_LONG).show()
            } else if (count == 500) {
                Toast.makeText(context, "اقتربت من المليون حسنه استمر", Toast.LENGTH_LONG).show()
            } else if (count == 1000) {
                val hasnatcount = count * 693
                Toast.makeText(context, "" + hasnatcount + "حسنة", Toast.LENGTH_LONG).show()
            }

            totalNumber.setText("" + totalcount).toString()
            if (totalcount == 1500) {
                val hasnatcount = count * 693
                Toast.makeText(
                    context,
                    "" + hasnatcount + "مبروك لقد وصلت اي عدد كبير جدا",
                    Toast.LENGTH_LONG
                ).show()
            }

        })
    navgtion_tabe7.setOnNavigationItemSelectedListener { items ->
        if (items.itemId == R.id.ahsayat) {
            clickFragment2(AlarmFragment())
        }

        true
    }
}

fun clickFragment2(fragment:Fragment){
    childFragmentManager.beginTransaction()
            .replace(R.id.fragment_Continer_Alarm,fragment)
            .commit()
}
}




