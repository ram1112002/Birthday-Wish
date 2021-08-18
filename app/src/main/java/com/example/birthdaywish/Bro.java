package com.example.birthdaywish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

public class Bro extends AppCompatActivity {

    private static final String BIRTHDAY_WISH_HASHTAG = " #BirthdayWish";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bro);

        ImageButton Button1 = (ImageButton) findViewById(R.id.imageButton13);
        ImageButton Button2 = (ImageButton) findViewById(R.id.imageButton14);
        ImageButton Button3 = (ImageButton) findViewById(R.id.imageButton15);
        ImageButton Button4 = (ImageButton) findViewById(R.id.imageButton16);

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(Bro.this)
                        .setType("text/plain")
                        .setText("You are the one, who made my childhood special. And although the times have gone, the sweet memories shall never fade. May you have a great life ahead. Wish you a very happy and warm birthday. Love you brother. " + BIRTHDAY_WISH_HASHTAG)
                        .getIntent();
                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);
            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(Bro.this)
                        .setType("text/plain")
                        .setText("You stood with me every time I snapped. You made my every childhood experience, a memorable one. You are my best friend since all these years. You are the reason, I believe in myself. Thank you for all the awesome times we shared. I Wish you a very happy birthday. " + BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);
            }
        });

        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(Bro.this)
                        .setType("text/plain")
                        .setText("My dearest Brother, I wish you a very warm and happy birthday. You are not only a sweet brother but a true friend. I feel blessed to have a brother like you. May you achieve and get, all you ever wish for. " + BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);
            }
        });

        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(Bro.this)
                        .setType("text/plain")
                        .setText("Thank you protecting me and always being there where it meant watching my back or simply listening to me. I love you bro. Happy Birthday. May God bless you with everything that you have always wanted. Have a blast. " + BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);
            }
        });


    }

}