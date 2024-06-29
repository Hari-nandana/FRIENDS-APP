package com.example.friendsapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2,e3,e4;
    AppCompatButton b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.name);
        e2=(EditText) findViewById(R.id.fname);
        e3=(EditText) findViewById(R.id.nickname);
        e4=(EditText) findViewById(R.id.desc);
        b1=(AppCompatButton) findViewById(R.id.submit);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String namee=e1.getText().toString();
                String friendname=e2.getText().toString();
                String nickname=e3.getText().toString();
                String description=e4.getText().toString();

                Toast.makeText(getApplicationContext(),namee+" "+friendname+" "+" "+nickname+" "+description,Toast.LENGTH_LONG).show();
            }
        });

    }
}