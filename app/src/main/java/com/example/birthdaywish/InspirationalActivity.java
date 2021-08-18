package com.example.birthdaywish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class InspirationalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inspirational);
    }
    public void m(View view){
        Intent i =new Intent(this, IMessages.class);
        startActivity(i);
    }
    public void Q(View view){
        Intent i =new Intent(this, Iquotes.class);
        startActivity(i);
    }
    public void p(View view){
        Intent i =new Intent(this, IPoem.class);
        startActivity(i);
    }
}