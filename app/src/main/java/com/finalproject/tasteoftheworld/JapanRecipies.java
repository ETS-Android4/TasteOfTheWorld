package com.finalproject.tasteoftheworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class JapanRecipies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_japan_recipies);
    }

    public void onClickFriedRice(View view) {
        startActivity(new Intent(JapanRecipies.this,ShrimpFriedRice.class));
    }

    public void onClickMiso(View view) {
        startActivity(new Intent(JapanRecipies.this,MisoSoup.class));

    }

    public void onClickTempuraIce(View view) {
        startActivity(new Intent(JapanRecipies.this,TempuraIceCream.class));

    }
}