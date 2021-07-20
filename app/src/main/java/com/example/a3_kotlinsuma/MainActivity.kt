package com.example.a3_kotlinsuma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

        fun sumarNumeros(view: View?) {
            val numero1 = Integer.parseInt(et_Numero1.text.toString())
            val numero2 = Integer.parseInt(et_Numero1.text.toString())
            var suma = numero1 + numero2

            this.tv_Resultado.setText(suma.toString())
        }



}