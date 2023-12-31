package com.example.myapplication.tuan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.myapplication.R

class Tuan222MainActivitykl : AppCompatActivity() {
    var ls:ListView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan222_main)
        ls=findViewById(R.id.tuan222ls);
        val arr= arrayOf("item 1","item 2","item 3","item 4","item 5")
        val adapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,arr)
        ls!!.adapter=adapter
    }
}