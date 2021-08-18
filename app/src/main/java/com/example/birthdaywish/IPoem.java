package com.example.birthdaywish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

public class IPoem extends AppCompatActivity {

    private static final String BIRTHDAY_WISH_HASHTAG = " #BirthdayWish";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_poem);

        ImageButton Button1 = (ImageButton) findViewById(R.id.imageButton25);
        ImageButton Button2 = (ImageButton) findViewById(R.id.imageButton26);


        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(IPoem.this)
                        .setType("text/plain")
                        .setText("A new way\n\n  A new day and a new chapter of life,\n There would be many ways to strive,\n Birthdays are like new beginnings,\n When everything is good,\n May your this birthday be awesome like you,\n It's my prayer 'touchwood',\n Have a fabulous day,\n Coz it's your birthday! Happy birthday!" + BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);
            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(IPoem.this)
                        .setType("text/plain")
                        .setText("All the years\n\n All these years of joy,\n All the years of happiness,\n May you get what you truly deserve!\n May all the moments get preserved!\n On this special day of yours,\n As I wish you today,\n A real great birthday,\n Happy birthday! Have a nice day!" + BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);
            }
        });

    }
}