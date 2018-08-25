package com.dev.hacknit.Activities;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.dev.hacknit.Database.Database;
import com.dev.hacknit.R;

import org.json.JSONException;

public class SplashScreen extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();



        int TEMPO = 3000; //Milissegundos

        Handler handle = new Handler();
        handle.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent TelaPrincipal = new Intent(SplashScreen.this, LoginActivity.class);
                startActivity(TelaPrincipal);
                finish();
            }
        }, TEMPO);
    }
}