package com.example19.quotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Button;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    ImageView btn;
    ImageView marathi;
    ImageView btnh;
    ImageView english;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        english = (ImageView) findViewById(R.id.btnEng);
        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Activity2.this, EnglishQuotes.class);
                startActivity(it);

            }
        });
        marathi = (ImageView) findViewById(R.id.btnm);
        marathi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Activity2.this, Activitymar.class);
                startActivity(it);
            }
        });
    }
}