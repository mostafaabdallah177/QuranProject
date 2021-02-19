package com.andorid.holy_quran

import android.content.Context
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.ayat_activity.*
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import kotlin.math.log

lateinit var ayatAdaptor: AyatAdaptor
class QuranActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ayat_activity)
        val souraName: String =  intent.getStringExtra(Contact.EXTRA_SURAN_NAME) ?:""
        val FileName: String = intent.getStringExtra(Contact.EXTRA_FILE_NAME) ?:""
        soraNameQuran.setText(souraName)
        val ayat = readQuran(FileName)
        ayatAdaptor = AyatAdaptor(ayat)
        recyalView2.adapter = ayatAdaptor
    }

    private fun readQuran(FileName: String): List<String> {
        var suraline = mutableListOf<String>()
        var reader: BufferedReader

        try {
            val file: InputStream = assets.open(FileName)
            reader = BufferedReader(InputStreamReader(file))
            var lines: String? = reader.readLine()
            while (lines != null) {
                suraline.add(lines)
                lines = reader.readLine()
            }
        } catch (ieo: IOException) {
            ieo.printStackTrace()
        }
        return suraline
    }
}