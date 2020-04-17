package com.agmal.latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Tanggal :16/4/2020
        //Nim : 10117189
        //nama : Agung Maulana
        //IF-5

        val button : Button = findViewById(R.id.button)
        button.setOnClickListener{

            val intent = Intent (this, RegisterCoba2::class.java)
            startActivity(intent)

        }



    }
}
