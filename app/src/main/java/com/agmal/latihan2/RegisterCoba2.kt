package com.agmal.latihan2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.register.*

class RegisterCoba2 :  AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)
        //Tanggal :16/4/2020
        //Nim : 10117189
        //nama : Agung Maulana
        //IF-5


        buton10.setOnClickListener{


            val intent = Intent(this, Verify::class.java)

            startActivity(intent)



        }

    }
    fun onCheckboxClicked(view: View) {
        if (view is CheckBox) {
            val checked: Boolean = view.isChecked

            when (view.id) {
                R.id.checkbox1 -> {
                    if (checked) {
                        buton10.isClickable = true
                    } else {
                        buton10.isClickable = false
                    }
                }
            }
        }
    }

}
