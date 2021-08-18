package com.example.birthdaywish;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class twetofourty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twetofourty);

        ImageButton Button1 = (ImageButton) findViewById(R.id.imageButton47);
        ImageButton Button2 = (ImageButton) findViewById(R.id.imageButton48);
        ImageButton Button3 = (ImageButton) findViewById(R.id.imageButton49);
        ImageButton Button4 = (ImageButton) findViewById(R.id.imageButton50);

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });
    }
}