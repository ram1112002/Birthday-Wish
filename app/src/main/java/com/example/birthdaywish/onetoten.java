package com.example.birthdaywish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

public class onetoten extends AppCompatActivity {

    private static final String BIRTHDAY_WISH_HASHTAG = " #BirthdayWish";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onetoten);

        ImageButton Button1 = (ImageButton) findViewById(R.id.imageButton35);
        ImageButton Button2 = (ImageButton) findViewById(R.id.imageButton36);
        ImageButton Button3 = (ImageButton) findViewById(R.id.imageButton37);
        ImageButton Button4 = (ImageButton) findViewById(R.id.imageButton38);

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(onetoten.this)
                        .setType("text/plain")
                        .setText("My little monkey, I love you and your naughty pranks more than anything in the world! Each day is happening and interesting with you around. Happy birthday, dude! " + BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);
            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(onetoten.this)
                        .setType("text/plain")
                        .setText("My speed racer, may you race through life’s troubles and enjoy life to the fullest. You are my brightest hope. Love you loads. Happy birthday. "
+ BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);
            }
        });

        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(onetoten.this)
                        .setType("text/plain")
                        .setText("You are such a beautiful soul. I admire your loving heart, pure spirit and affectionate ways. Thanks for enriching my life! Happy birthday, my precious one. "
+ BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);
            }
        });

        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(onetoten.this)
                        .setType("text/plain")
                        .setText("Simply know that I will always be there for you! I walk with pride because you are my child. Be blessed and happy birthday.  "
+ BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);
            }
        });
    }
}