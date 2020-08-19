package com.finalproject.tasteoftheworld;

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

    public void onClickCanada(View view) {
        startActivity(new Intent(MainActivity.this,CanadaRecipies.class));
    }

    public void onClickJapan(View view) {
        startActivity(new Intent(MainActivity.this,JapanRecipies.class));
    }

    public void onClickMexico(View view) {
        startActivity(new Intent(MainActivity.this,MexicoRecipes.class));
    }

    public void onClickGuyana(View view) {
        startActivity(new Intent(MainActivity.this,GuyanaRecipes.class));
    }
}