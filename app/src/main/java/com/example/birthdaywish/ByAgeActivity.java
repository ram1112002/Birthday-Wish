package com.example.birthdaywish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ByAgeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_by_age);
    }
    public void oneto10(View view){
        Intent i=new Intent(this,onetoten.class);
        startActivity(i);
    }
    public void Eleto20(View view){
        Intent i=new Intent(this,tentotwn.class);
        startActivity(i);
    }
    public void tweto40(View view){
        Intent i=new Intent(this,twetofourty.class);
        startActivity(i);
    }
    public void fourtyto60(View view){
        Intent i=new Intent(this,fourtytosix.class);
        startActivity(i);
    }
}