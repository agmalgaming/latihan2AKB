package com.agmal.latihan2

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.AlarmClock.EXTRA_MESSAGE
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.register.*
import kotlinx.android.synthetic.main.verify2.*

class Verify2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.verify2)
        //Tanggal :16/4/2020
        //Nim : 10117189
        //nama : Agung Maulana
        //IF-5
    button5.setOnClickListener {



        val intent = Intent(this, Home1::class.java)

        startActivity(intent)
    }
    }
}