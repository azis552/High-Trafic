package com.example.hss2;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class Splash2 extends AppCompatActivity {
    Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // do something
                Intent intent = new Intent(Splash2.this, MainActivity.class);
                // If you just use this that is not a valid context. Use ActivityName.this
                startActivity(intent);
            }
        }, 2000);
        setContentView(R.layout.activity_splash2);
    }


}