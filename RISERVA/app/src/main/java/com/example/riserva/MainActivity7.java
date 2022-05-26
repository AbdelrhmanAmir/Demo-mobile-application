package com.example.riserva;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity7 extends AppCompatActivity {
    String s1[],s2[];

    int images[]={R.drawable.capture10,R.drawable.capture11,R.drawable.capture12,R.drawable.capture13};
    RecyclerView recyclerView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        recyclerView2=findViewById(R.id.recycleview2);
        s1=getResources().getStringArray(R.array.awomen);
        s2=getResources().getStringArray(R.array.arating);
        Adapter Adapter = new Adapter(this,s1,s2,images);
        recyclerView2.setAdapter(Adapter);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));

    }
}