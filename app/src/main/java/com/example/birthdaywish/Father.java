package com.example.birthdaywish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

public class Father extends AppCompatActivity {

    private static final String BIRTHDAY_WISH_HASHTAG = " #BirthdayWish";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_father);

        ImageButton Button1 = (ImageButton) findViewById(R.id.imageButton17);
        ImageButton Button2 = (ImageButton) findViewById(R.id.imageButton18);
        ImageButton Button3 = (ImageButton) findViewById(R.id.imageButton19);
        ImageButton Button4 = (ImageButton) findViewById(R.id.imageButton20);

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(Father.this)
                        .setType("text/plain")
                        .setText("With every memory I own, I realize the love and care you showered on me. What saddens me, is that no matter what I do, I can never thank you enough. You are my true Super-hero. My dad, I love you for everything. You are the real star of my life. Happy Birthday." + BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);
                startActivity(shareIntent);
            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(Father.this)
                        .setType("text/plain")
                        .setText("All those years, when you carried me through every hurdle I faced. For the times, you stood by me and made me a stronger person, I wish to salute you on this beautiful day. Happy birthday Dad. You are still the best." + BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);
                startActivity(shareIntent);
            }
        });

        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent shareIntent = ShareCompat.IntentBuilder.from(Father.this)
                        .setType("text/plain")
                        .setText("Every time I look back on the times we spent together, I feel blessed. Those sweet memorable little walks in gardens, beaches, and parks, where we wandered hand in hand, helped me learn a lot in life. You are my hero, my idol. I wish you a very Happy Birthday. " + BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);
                startActivity(shareIntent);
            }


        });

        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(Father.this)
                        .setType("text/plain")
                        .setText("You are the best friend I ever had. You mean more than just father to me, you are my ultimate teacher and the sweetest dad. I wish you a very happy Birthday.  " + BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);
                startActivity(shareIntent);

            }
        });
    }
}