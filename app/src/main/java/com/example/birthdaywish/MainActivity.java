package com.example.birthdaywish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abc(View view) {
        Intent i = new Intent(this, Family.class);
        startActivity(i);
    }
    public void d(View view){
        Intent i = new Intent(this, FriendsActivity.class);
        startActivity(i);
    }
    public void c(View view){
        Intent i = new Intent(this, InspirationalActivity.class);
        startActivity(i);
    }
    public void e(View view){
        Intent i = new Intent(this, FunnyActivity.class);
        startActivity(i);
    }
    public void q(View view){
        Intent i = new Intent(this, ByAgeActivity.class);
        startActivity(i);
    }


}