package com.example.myapplication.tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class Tuan32MainActivity extends AppCompatActivity {
    ListView lv;
    T32Adapter adapter;
    ArrayList<T32Contact> ls=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan32_main);
        lv=findViewById(R.id.tuan32ls);
        ls.add(new T32Contact("Nguyen Van A","18",R.drawable.ic_launcher_background));
        ls.add(new T32Contact("Le Thi B","20",R.drawable.ic_launcher_background));
        ls.add(new T32Contact("Tran Trung C","17",R.drawable.ic_launcher_background));
        ls.add(new T32Contact("Nguyen Thi Hong D","16",R.drawable.ic_launcher_background));
        ls.add(new T32Contact("Le Hoang E","19",R.drawable.ic_launcher_background));
        ls.add(new T32Contact("Tran Thi Huyen G","18",R.drawable.ic_launcher_background));
        adapter=new T32Adapter(ls,this);
        lv.setAdapter(adapter);
    }
}