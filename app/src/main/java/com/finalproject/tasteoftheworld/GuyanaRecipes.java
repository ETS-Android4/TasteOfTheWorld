package com.finalproject.tasteoftheworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GuyanaRecipes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guyana_recipes);
    }

    public void onClickFish(View view) {
        startActivity(new Intent(GuyanaRecipes.this,Fish.class));
    }

    public void onClickChicken(View view) {
        startActivity(new Intent(GuyanaRecipes.this,Chicken.class));
    }

    public void onClickPepper(View view) {
        startActivity(new Intent(GuyanaRecipes.this,Pepper.class));
    }
}