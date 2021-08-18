package com.example.birthdaywish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

public class FunnyActivity extends AppCompatActivity {

    private static final String BIRTHDAY_WISH_HASHTAG = " #BirthdayWish";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funny);

        ImageButton Button1 = (ImageButton) findViewById(R.id.imageButton5);
        ImageButton Button2 = (ImageButton) findViewById(R.id.imageButton6);
        ImageButton Button3 = (ImageButton) findViewById(R.id.imageButton7);
        ImageButton Button4 = (ImageButton) findViewById(R.id.imageButton8);

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(FunnyActivity.this)
                        .setType("text/plain")
                        .setText("One of the things I learned growing up with you, is that if you have a dream, you should always chase it. I mean, you still can run in your age right? Nevertheless, happy birthday! " + BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);
            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent shareIntent = ShareCompat.IntentBuilder.from(FunnyActivity.this)
                        .setType("text/plain")
                        .setText("For your birthday, I wanted to get you something to remind you of your youth, but they were sold out of cave art and dinosaur bones. " + BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);
            }
        });

        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(FunnyActivity.this)
                        .setType("text/plain")
                        .setText("I always limit my budget on buying birthday gifts according to what that person gave me as a gift on my birthday. Enjoy your gift of nothing! " + BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);
            }
        });

        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(FunnyActivity.this)
                        .setType("text/plain")
                        .setText("I always limit my budget on buying birthday gifts according to what that person gave me as a gift on my birthday. Enjoy your gift of nothing! " + BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);
            }
        });

    }


}