package com.example.myapplication.Tuan32

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.myapplication.R

class Tuan32MainActivitykl : AppCompatActivity() {
    var adap:Tuan32Adapterkl? =null
    var ls:ArrayList<Tuan32Contactkl> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan32_main_activitykl)
        val lv=findViewById<ListView>(R.id.Tuan32lv)
        ls.add(Tuan32Contactkl("Nguyen Van A","18",R.drawable.android))
        ls.add(Tuan32Contactkl("Tran Thi B","20",R.drawable.apple))
        ls.add(Tuan32Contactkl("Le Hoang C","16",R.drawable.blogger))
        ls.add(Tuan32Contactkl("Nguyen Thi Ngoc D","17",R.drawable.dell))
        ls.add(Tuan32Contactkl("Tran Trung E","19",R.drawable.facebook))
        ls.add(Tuan32Contactkl("Le Thi Huyen G","18",R.drawable.firefox))
        adap= Tuan32Adapterkl(this,ls)
        lv.adapter=adap
    }
}