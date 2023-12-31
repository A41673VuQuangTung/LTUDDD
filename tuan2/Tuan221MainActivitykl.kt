package com.example.myapplication.tuan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.myapplication.R

class Tuan221MainActivitykl : AppCompatActivity() {
    var txt1:EditText? = null;
    var txt2:EditText? = null;
    var bt:Button? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan221_main)
        txt1=findViewById(R.id.num1);
        txt2=findViewById(R.id.num2);
        bt=findViewById(R.id.button2);
        bt!!.setOnClickListener(View.OnClickListener{
            var i=Intent(this@Tuan221MainActivitykl,Tuan221SecondActivitykl::class.java);
            i.putExtra("so1",txt1!!.text.toString());
            i.putExtra("so2",txt2!!.text.toString());
            startActivity(i);
        })
    }
}