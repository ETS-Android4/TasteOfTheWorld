package com.finalproject.tasteoftheworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MexicoRecipes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mexico_recipes);
    }

    public void onClickChile(View view) {
        startActivity(new Intent(MexicoRecipes.this,Chile.class));
    }

    public void onClickSoup(View view) {
        startActivity(new Intent(MexicoRecipes.this,TortillaSoup.class));
    }

    public void onClickBeans(View view) {
        startActivity(new Intent(MexicoRecipes.this,Beans.class));
    }
}