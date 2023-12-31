package com.example.myapplication.tuan2;

import static com.example.myapplication.R.id.tuan222ls;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.myapplication.R;

public class Tuan222MainActivity extends AppCompatActivity {
    ListView ls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan222_main);
        ls=findViewById(R.id.tuan222ls);
        String[] arr=new String[]{"Bo mon 1","Bo mon 2","Bo mon 3","Bo mon 4","Bo mon 5"};
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arr);
        ls.setAdapter(adapter);
    }
}