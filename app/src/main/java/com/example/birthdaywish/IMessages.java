package com.example.birthdaywish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

public class IMessages extends AppCompatActivity {

    private static final String BIRTHDAY_WISH_HASHTAG = " #BirthdayWish";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_messages);

        ImageButton Button1 = (ImageButton) findViewById(R.id.imageButton9);
        ImageButton Button2 = (ImageButton) findViewById(R.id.imageButton10);
        ImageButton Button3 = (ImageButton) findViewById(R.id.imageButton11);
        ImageButton Button4 = (ImageButton) findViewById(R.id.imageButton12);

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(IMessages.this)
                        .setType("text/plain")
                        .setText("On your Birthday, I wish you a year full of success and glory. With faith, courage and dedication, no dream is too big. Keep up with your efforts, staying oblivious to the results and you will certainly get what you desire. I wish you a very Happy Birthday. "
 + BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);
            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(IMessages.this)
                        .setType("text/plain")
                        .setText("I wish you a very happy birthday, and wish to tell you the secret to success on your special day. People achieve only what they deserve, and deserve only what they achieve. Always remember, your success depends on you and you alone. Enjoy your day. "
 + BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);
            }
        });

        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(IMessages.this)
                        .setType("text/plain")
                        .setText("With every passing day, comes a change. A change alone, however, is not good enough because, a change can be either good or bad. Change is an obligation that comes with life, so always make good change. Since, only a good change is called an improvement, the rest is only an illusion of improvement. I wish you a very Happy Birthday. "
+ BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);
            }
        });

        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent shareIntent = ShareCompat.IntentBuilder.from(IMessages.this)
                        .setType("text/plain")
                        .setText("Under and behind and inside, everything you ever take for granted, always remember that something horrible is been growing. Never turn a blind eye towards your responsibilities, and you will always walk on the happy lanes of life. I wish you a very happy birthday. May God bless you with faith and courage. "
+ BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);
                startActivity(shareIntent);
            }
        });
    }
}