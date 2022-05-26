package com.example.riserva;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;

public class MainActivity6 extends AppCompatActivity {
String s1[],s2[];
    int images[]={R.drawable.capture1,R.drawable.capture2,R.drawable.capture3,R.drawable.capture4,R.drawable.capture5,
            R.drawable.capture6,R.drawable.capture7,R.drawable.capture8,R.drawable.capture9};

RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        recyclerView=findViewById(R.id.recycleview);
        s1=getResources().getStringArray(R.array.cwomen);
        s2=getResources().getStringArray(R.array.crating);
        Adapter Adapter = new Adapter(this,s1,s2,images);
        recyclerView.setAdapter(Adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}