package com.example.hss2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void notif(View view) {
        Intent intent = new Intent(MainActivity.this, SplashActivity.class);
        startActivity(intent);
    }
    public void notif2(View view){
        Intent i;
        i = new Intent(getApplicationContext(), Splash2.class);
        startActivity(i);
        finish();
    }
}