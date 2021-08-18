package com.example.birthdaywish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

public class fourtytosix extends AppCompatActivity {

    private static final String BIRTHDAY_WISH_HASHTAG = " #BirthdayWish";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourtytosix);

        ImageButton Button1 = (ImageButton) findViewById(R.id.imageButton21);
        ImageButton Button2 = (ImageButton) findViewById(R.id.imageButton22);
        ImageButton Button3 = (ImageButton) findViewById(R.id.imageButton23);
        ImageButton Button4 = (ImageButton) findViewById(R.id.imageButton24);

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(fourtytosix.this)
                        .setType("text/plain")
                        .setText("Everything gets harder when you get older… except for your brain, of course. Happy Birthday, you old softy. " + BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);
            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(fourtytosix.this)
                        .setType("text/plain")
                        .setText("I was going to make fun of you on your birthday. Fortunately for you, I was taught to respect my elders. " + BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);
            }
        });

        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(fourtytosix.this)
                        .setType("text/plain")
                        .setText("Happy Birthday, old man. Hope you have an exciting birthday celebration… followed by a nice, long nap.  " + BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);
            }
        });

        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(fourtytosix.this)
                        .setType("text/plain")
                        .setText("Happy Birthday to someone who deserves to be treasured. After all, fossils of your era are hard to find. " + BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);
            }
        });
    }


}