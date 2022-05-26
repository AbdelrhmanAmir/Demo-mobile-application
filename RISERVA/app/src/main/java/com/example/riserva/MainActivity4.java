package com.example.riserva;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity4 extends AppCompatActivity {
    EditText email,password;
    Button up;
    FirebaseAuth auth=FirebaseAuth.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        email=findViewById(R.id.editTextTextPersonName2);
        password=findViewById(R.id.editTextTextPassword2);
        up=findViewById(R.id.button4);
        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity4.this,MainActivity5.class));
               /* auth.createUserWithEmailAndPassword(email.getText().toString(),password.getText().toString())
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if(task.isSuccessful())
                                {
                                    Toast.makeText(MainActivity4.this, "Signed Up Successfully", Toast.LENGTH_SHORT).show();
                                    startActivity(new Intent(MainActivity4.this,MainActivity5.class));
                                    finish();
                                }
                                else
                                {
                                    Toast.makeText(MainActivity4.this, "Something Wrong Happened", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });*/
            }
        });
    }
}