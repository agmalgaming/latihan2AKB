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
