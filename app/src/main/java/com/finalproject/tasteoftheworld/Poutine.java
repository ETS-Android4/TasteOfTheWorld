package com.finalproject.tasteoftheworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Poutine extends AppCompatActivity {

    String ingredientsTitle = "INGREDIENTS:\n";

    String ingredients = "1 quart vegetable oil for frying\n" +
            "1 (10.25 ounce) can beef gravy\n" +
            "5 medium potatoes, cut into fries\n" +
            "2 cups cheese curds\n";

    String instructionsTitle = "\nINSTRUCTIONS:\n";

    String instructions = "Step 1\n" +
            "Heat oil in a deep fryer or deep heavy skillet to 365 degrees F (185 degrees C). While the oil is heating, you can begin to warm your gravy.\n" +
            "\n" +
            " Step 2\n" +
            "Place the fries into the hot oil, and cook until light brown, about 5 minutes. Make the fries in batches if necessary to allow them room to move a little in the oil. Remove to a paper towel lined plate to drain.\n" +
            "\n" +
            " Step 3\n" +
            "Place the fries on a serving platter, and sprinkle the cheese over them. Ladle gravy over the fries and cheese, and serve immediately.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poutine);

        TextView poutineRecipe = findViewById(R.id.PoutineRecipe);
        poutineRecipe.setText(ingredientsTitle);
        poutineRecipe.setTextSize(20f);
        poutineRecipe.append(ingredients);
        poutineRecipe.setTextSize(15f);

        poutineRecipe.append(instructionsTitle);
        poutineRecipe.setTextSize(20f);
        poutineRecipe.append(instructions);
        poutineRecipe.setTextSize(15f);

        poutineRecipe.setMovementMethod(new ScrollingMovementMethod());
    }
}