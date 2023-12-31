package com.example.myapplication.tuan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myapplication.R

class Tuan221SecondActivitykl : AppCompatActivity() {
    var tv:TextView? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan221_second);
        tv=findViewById(R.id.tv221);
        var i1=intent;
        val chuoi1=i1.extras!!.getString("so1");
        val chuoi2=i1.extras!!.getString("so2");
        val so1=chuoi1!!.toFloat();
        val so2=chuoi2!!.toFloat();
        val tong=so1+so2;
        tv!!.text=tong.toString();
    }
}