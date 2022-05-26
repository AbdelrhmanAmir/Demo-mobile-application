package com.example.riserva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity5 extends AppCompatActivity {
    ArrayList<String> cities=new ArrayList<>();
    Spinner spinner;
    Button next;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        cities.add("alexnadria");
        cities.add("cairo");
        spinner=findViewById(R.id.spinner);
        next=findViewById(R.id.button5);
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,cities);
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                s= adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (s=="alexnadria")
                {
                    startActivity(new Intent(MainActivity5.this,MainActivity6.class));
                }
                else if (s=="cairo")
                {
                    startActivity(new Intent(MainActivity5.this,MainActivity7.class));
                }
            }
        });
    }
}