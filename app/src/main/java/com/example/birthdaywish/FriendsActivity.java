package com.example.birthdaywish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

public class FriendsActivity extends AppCompatActivity {

    private static final String BIRTHDAY_WISH_HASHTAG = " #BirthdayWish";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

        ImageButton Button1 = (ImageButton) findViewById(R.id.imageButton);
        ImageButton Button2 = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton Button3 = (ImageButton) findViewById(R.id.imageButton3);
        ImageButton Button4 = (ImageButton) findViewById(R.id.imageButton4);


        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent shareIntent= ShareCompat.IntentBuilder.from(FriendsActivity.this)
                        .setType("text/plain")
                        .setText("Chocolates and cake, balloons and whistles. Celebrations and joy, with family and friends. This all I wish for you my dear friend on your birthday." + BIRTHDAY_WISH_HASHTAG)
                        .getIntent();
                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);

            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(FriendsActivity.this)
                        .setType("text/plain")
                        .setText("And the day has arrived, when a sweet angel was sent into this world in disguise of my friend. Happy Birthday! " + BIRTHDAY_WISH_HASHTAG)
                        .getIntent();
                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);

            }
        });

        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(FriendsActivity.this)
                        .setType("text/plain")
                        .setText("May you celebrate this day till you blow hundreds of candles and still hop, skip and jump all the time. Happy Birthday. " + BIRTHDAY_WISH_HASHTAG)
                        .getIntent();
                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);
            }
        });

        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(FriendsActivity.this)
                        .setType("text/plain")
                        .setText("You, my friend are the reason for my happiness and on this birthday I wish you a joyful ride 365 days long, filled with fun and frolic. Wish you many happy returns of the day. " + BIRTHDAY_WISH_HASHTAG)
                        .getIntent();
                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);
            }
        });

    }


}