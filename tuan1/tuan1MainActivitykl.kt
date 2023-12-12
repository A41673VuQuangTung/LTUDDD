package com.example.myapplication.tuan1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.myapplication.R

class tuan1MainActivitykl : AppCompatActivity() {
    var txt1:EditText? = null
    var txt2:EditText? = null
    var btn:Button? = null
    var tv:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan1_main)
        txt1=findViewById(R.id.number1)
        txt2=findViewById(R.id.number2)
        btn=findViewById(R.id.button)
        tv=findViewById(R.id.sum)
        btn!!.setOnClickListener(View.OnClickListener {
            tinhTong()
        }

        )
    }

    private fun tinhTong() {
        val str1=txt1!!.text.toString()
        val so1=str1.toFloat()
        val str2=txt2!!.text.toString()
        val so2=str2.toFloat()
        val tong=so1+so2
        tv!!.text=tong.toString()
    }

}