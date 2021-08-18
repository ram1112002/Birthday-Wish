package com.example.birthdaywish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

public class tentotwn extends AppCompatActivity {

    private static final String BIRTHDAY_WISH_HASHTAG = " #BirthdayWish";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentotwn);

        ImageButton Button1 = (ImageButton) findViewById(R.id.imageButton43);
        ImageButton Button2 = (ImageButton) findViewById(R.id.imageButton44);
        ImageButton Button3 = (ImageButton) findViewById(R.id.imageButton45);
        ImageButton Button4 = (ImageButton) findViewById(R.id.imageButton46);

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(tentotwn.this)
                        .setType("text/plain")
                        .setText("Wishing you a fabulous birthday. As you take your first steps into the teenage world, may only the good things in life come your way. May love and happiness accompany you throughout this journey of life. Happy birthday. "
+ BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);
            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(tentotwn.this)
                        .setType("text/plain")
                        .setText("Yay! You’re officially a teenager now! As you celebrate this great milestone in your life, my number one wish for you is that you never stop having faith in yourself. You have so much potential. Keep believing in yourself and you shall achieve remarkable things. Happy 13th birthday. "
+ BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);
            }
        });

        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(tentotwn.this)
                        .setType("text/plain")
                        .setText("Wishing the newest member of the teen club a fabulous birthday celebration. May every second of this day fill your heart with happiness. Enjoy every single moment of your teenage life. Happy 13th birthday! "
+ BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);
            }
        });

        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(tentotwn.this)
                        .setType("text/plain")
                        .setText("We have graciously been waiting for this special day of yours. And now that it’s finally here, it is our wish that you increase in wisdom till you are as wise as King Solomon.  "
+ BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);
            }
        });
    }
}