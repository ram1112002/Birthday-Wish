package com.example.birthdaywish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Family extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
    }
    public void M(View view){
        Intent i=new Intent(this, MOM.class);
        startActivity(i);
    }
    public void F(View view){
        Intent i=new Intent(this, Father.class);
        startActivity(i);
    }
    public void S(View view){
        Intent i=new Intent(this, Sis.class);
        startActivity(i);
    }
    public void B(View view){
        Intent i=new Intent(this, Bro.class);
        startActivity(i);
    }

}