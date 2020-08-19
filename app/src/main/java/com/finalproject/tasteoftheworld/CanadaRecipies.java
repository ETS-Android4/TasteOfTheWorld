package com.finalproject.tasteoftheworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CanadaRecipies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canada_recipies);
    }

    public void onClickPoutine(View view) {
        startActivity(new Intent(CanadaRecipies.this,Poutine.class));
    }

    public void onClickBeaverTail(View view) {
        startActivity(new Intent(CanadaRecipies.this,BeaverTail.class));
    }

    public void onClickButterTart(View view) {
        startActivity(new Intent(CanadaRecipies.this,ButterTart.class));
    }
}