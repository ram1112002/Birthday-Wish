package com.example.birthdaywish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

public class Iquotes extends AppCompatActivity {

    private static final String BIRTHDAY_WISH_HASHTAG = " #BirthdayWish";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iquotes);

        ImageButton Button1 = (ImageButton) findViewById(R.id.imageButton27);
        ImageButton Button2 = (ImageButton) findViewById(R.id.imageButton28);
        ImageButton Button3 = (ImageButton) findViewById(R.id.imageButton29);
        ImageButton Button4 = (ImageButton) findViewById(R.id.imageButton30);

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(Iquotes.this)
                        .setType("text/plain")
                        .setText("And in the end, it's not the years in your life that count. It's the life in your years. - Abraham Lincoln " + BIRTHDAY_WISH_HASHTAG)
                        .getIntent();
                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);
            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(Iquotes.this)
                        .setType("text/plain")
                        .setText("To know how to grow old is the master work of wisdom, and one of the most difficult chapters in the great art of living. - Henri Frederic Amiel " + BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);
            }
        });

        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent shareIntent = ShareCompat.IntentBuilder.from(Iquotes.this)
                        .setType("text/plain")
                        .setText("Everyday is a birthday; every moment of it is new to us; we are born again, renewed for fresh work and endeavor. - Issac Watts" + BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);

            }
        });

        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(Iquotes.this)
                        .setType("text/plain")
                        .setText("Because time itself is like a spiral, something special happens on your birthday each year: The same energy that God invested in you at birth is present once again. - Menachem M Schneerso" + BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);
            }
        });
    }
}