package com.andorid.holy_quran

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activityhomescreen.*
import kotlinx.android.synthetic.main.fragment_tasbeh.*

class HomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activityhomescreen)
        Navigation_Bar.setOnNavigationItemSelectedListener { item ->
            if (item.itemId == R.id.Navigation_Quran) {
                clickFragment(QuranFragment())
            } else if (item.itemId == R.id.Navigation_hadeth) {
                clickFragment(HadethFragment())
            } else if (item.itemId == R.id.Navigation_tasbe7) {
                clickFragment(TasbehFragment())
            }
            true
        }
        Navigation_Bar.selectedItemId=R.id.Navigation_Quran
    }

    fun clickFragment(fragment:Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_Continer,fragment)
            .commit()
    }
}


