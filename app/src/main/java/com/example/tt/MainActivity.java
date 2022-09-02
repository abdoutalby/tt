package com.example.tt;

import android.content.Intent;
import android.os.Handler;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static int delay = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

         new Handler().postDelayed(new Runnable() {
             @Override
             public void run() {
                 Intent intent = new Intent(getApplicationContext(), Login.class);
                 startActivity(intent);
                 finish();
             }
         }, delay);
    }
}