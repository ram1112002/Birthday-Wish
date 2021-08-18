package com.example.birthdaywish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

public class Sis extends AppCompatActivity {
    private static final String BIRTHDAY_WISH_HASHTAG = " #BirthdayWish";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sis);

        ImageButton Button1 = (ImageButton) findViewById(R.id.imageButton39);
        ImageButton Button2 = (ImageButton) findViewById(R.id.imageButton40);
        ImageButton Button3 = (ImageButton) findViewById(R.id.imageButton41);
        ImageButton Button4 = (ImageButton) findViewById(R.id.imageButton42);

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(Sis.this)
                        .setType("text/plain")
                        .setText("You are the best gift our parents could ever give me. You are the one who made my childhood unforgettable. Wish you a very sweet and warm birthday. My friend, my support, I love you my sister. "
+ BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);
            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(Sis.this)
                        .setType("text/plain")
                        .setText("My dearest sister, you are the sweetest person I have ever known. I love you for everything you are and everything that you've done for me. I wish you a very Happy Birthday. "
+ BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);

            }
        });

        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(Sis.this)
                        .setType("text/plain")
                        .setText("May God bless you with all his warmth and care. May your birthday bring loads of joy and fun to your world. Happy Birthday, to my sweet sister." + BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);
            }
        });

        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(Sis.this)
                        .setType("text/plain")
                        .setText("May God bless you with all his warmth and care. May your birthday bring loads of joy and fun to your world. Happy Birthday, to my sweet sister.  "
 + BIRTHDAY_WISH_HASHTAG)
                        .getIntent();
                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);
            }
        });
    }
}