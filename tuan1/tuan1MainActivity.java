package com.example.myapplication.tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;

public class tuan1MainActivity extends AppCompatActivity {
    EditText txt1, txt2;
    Button btn;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan1_main);
        txt1=findViewById(R.id.number1);
        txt2=findViewById(R.id.number2);
        btn=findViewById(R.id.button);
        tv=findViewById(R.id.sum);
        btn.setOnClickListener(v -> {
            tinhTong();
        });
    }

    private void tinhTong() {
        String str1=txt1.getText().toString();
        Float so1=Float.parseFloat(str1);
        String str2=txt2.getText().toString();
        Float so2=Float.parseFloat(str2);
        Float tong=so1+so2;
        tv.setText(String.valueOf(tong));
    }
}