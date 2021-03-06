package com.example19.quotes;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import xyz.hanks.library.bang.SmallBangView;

public class Activitymar extends AppCompatActivity {

    TextView q1,q2,q3,q4,q5,q6;
    ImageView whatsapp,instagram,share,w2,i2,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_quotes);

        final SmallBangView like_heart = findViewById(R.id.h1);
        like_heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (like_heart.isSelected()) {
                    like_heart.setSelected(false);
                } else {
                    like_heart.setSelected(true);
                    like_heart.likeAnimation(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animation) {
                            super.onAnimationEnd(animation);

                        }
                    });
                }
            }
        });

        final String m1 = "\"Setting goals is the first step in turning the invisible into the visible.\"";
        q1 = findViewById(R.id.q1);
        q1.setText(m1);
        whatsapp = findViewById(R.id.w1);
        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.setPackage("com.whatsapp");
                //i.putExtra(Intent.EXTRA_TEXT, m1);
                i.putExtra(Intent.EXTRA_TEXT, m1);

                startActivity(i);

            }
        });

        instagram = findViewById(R.id.i1);
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.setPackage("com.instagram.android");
                i.putExtra(Intent.EXTRA_TEXT, m1);

                startActivity(i);

            }
        });
        share = findViewById(R.id.s1);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_TEXT, m1);

                startActivity(i);

            }
        });

        // second quotes

        final SmallBangView like_heart2 = findViewById(R.id.h2);
        like_heart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (like_heart2.isSelected()) {
                    like_heart2.setSelected(false);
                } else {
                    like_heart2.setSelected(true);
                    like_heart2.likeAnimation(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animation) {
                            super.onAnimationEnd(animation);

                        }
                    });
                }
            }
        });

        final String m2 = "\"The will to win, the desire to succeed, the urge to reach your full potential... " +
                "these are the keys that will unlock the door to personal excellence.\"";
        q2 = findViewById(R.id.q2);
        q2.setText(m2);
        w2 = findViewById(R.id.w2);
        w2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.setPackage("com.whatsapp");
                i.putExtra(Intent.EXTRA_TEXT, m2);

                startActivity(i);

            }
        });

        i2 = findViewById(R.id.i2);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.setPackage("com.instagram.android");
                i.putExtra(Intent.EXTRA_TEXT, m1);

                startActivity(i);

            }
        });
        s2 = findViewById(R.id.s2);
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_TEXT, m1);

                startActivity(i);

            }
        });
    }
}
