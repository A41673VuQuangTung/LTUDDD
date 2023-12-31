package com.example.myapplication.tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.R;

public class Tuan221MainActivity extends AppCompatActivity {
    EditText txt1,txt2;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan221_main);
        txt1=findViewById(R.id.num1);
        txt2=findViewById(R.id.num2);
        bt=findViewById(R.id.button2);
        bt.setOnClickListener(v -> {
            Intent i=new Intent(Tuan221MainActivity.this,Tuan221SecondActivity.class);
            i.putExtra("so1",txt1.getText().toString());
            i.putExtra("so2",txt2.getText().toString());
            startActivity(i);
        });
    }
}