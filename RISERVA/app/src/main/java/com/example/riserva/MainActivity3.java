package com.example.riserva;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity3 extends AppCompatActivity {
EditText email;
EditText password;
Button in;
Button up;
FirebaseAuth auth=FirebaseAuth.getInstance();
    /*@Override
    protected void onStart() {

        if(auth.getCurrentUser() !=null)
        {
            finish();
            startActivity(new Intent(MainActivity3.this,MainActivity5.class));
        }

        super.onStart();
    }*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        email=findViewById(R.id.editTextTextPersonName);
        password=findViewById(R.id.editTextTextPassword2);
        in=findViewById(R.id.button2);
        up=findViewById(R.id.button3);
        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity3.this,MainActivity4.class));
            }
        });
        in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity3.this,MainActivity5.class));
               /* auth.signInWithEmailAndPassword(email.getText().toString(),password.getText().toString())
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if(task.isSuccessful())
                                {
                                    finish();
                                    startActivity(new Intent(MainActivity3.this,MainActivity5.class));
                                }
                                else
                                {
                                    Toast.makeText(MainActivity3.this, "Wrong Email or Password", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });*/
            }
        });



    }
}