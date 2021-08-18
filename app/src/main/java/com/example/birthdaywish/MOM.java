package com.example.birthdaywish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

public class MOM extends AppCompatActivity {

    private static final String BIRTHDAY_WISH_HASHTAG = " #BirthdayWish";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_o_m);

        ImageButton Button1 = (ImageButton) findViewById(R.id.imageButton31);
        ImageButton Button2 = (ImageButton) findViewById(R.id.imageButton32);
        ImageButton Button3 = (ImageButton) findViewById(R.id.imageButton33);
        ImageButton Button4 = (ImageButton) findViewById(R.id.imageButton34);

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(MOM.this)
                        .setType("text/plain")
                        .setText("You are the reason I am. You are the reason, I smile. You make me believe, in me. I wish to have you as my mother, every time I rebirth. My soul, my sweet mom, I love you. And with all of my emotions, I wish you a super happy Birthday."
 + BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                startActivity(shareIntent);
            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(MOM.this)
                        .setType("text/plain")
                        .setText("You are my angel, my soul and the ultimate heavenly gift to me. With you, Mom, am always at peace. Wish you a very Happy Birthday. I love you, My sweet mother. "
 + BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);
            }
        });

        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent shareIntent = ShareCompat.IntentBuilder.from(MOM.this)
                        .setType("text/plain")
                        .setText("My respect for you is no different than your love for me, without boundaries. You are my crowning support and the best thing that I own. I love you and wish you a very Happy Birthday. "
+ BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);
            }
        });

        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = ShareCompat.IntentBuilder.from(MOM.this)
                        .setType("text/plain")
                        .setText("I might not know the pains you went through to make us what we are. But, what I know is that we all love you. May God bless you with love, care and warmth. Happy Birthday, Mom.  "
+ BIRTHDAY_WISH_HASHTAG)
                        .getIntent();

                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);

                startActivity(shareIntent);
            }
        });
    }

}