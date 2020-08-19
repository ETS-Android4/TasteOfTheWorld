package com.finalproject.tasteoftheworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class ButterTart extends AppCompatActivity {

    String ingredientsTitle = "INGREDIENTS:\n";

    String ingredients = "⅓ cup butter\n" +
            "⅓ cup margarine\n" +
            "1 cup packed brown sugar\n" +
            "1 cup shredded coconut\n" +
            "½ teaspoon ground cinnamon\n" +
            "½ teaspoon ground nutmeg\n" +
            "⅛ teaspoon ground allspice\n" +
            "½ cup chopped walnuts\n" +
            "½ teaspoon salt\n" +
            "2 large eggs eggs, beaten\n" +
            "2 teaspoons fresh lemon juice\n" +
            "⅔ cup dark corn syrup\n" +
            "1 (9 inch) pastry for a 9 inch single crust pie\n";

    String instructionsTitle = "\nINSTRUCTIONS:\n";

    String instructions = "Step 1\n" +
            "Roll pie dough out to 1/4 inch thickness. Cut out circles of dough to fit cups of standard muffin tin. Gently place into muffin cups.\n" +
            "\n" +
            " Step 2\n" +
            "In a saucepan, melt butter and margarine over low heat just until melted. Stir in brown sugar, coconut, spices, nuts, salt, eggs, lemon juice, and corn syrup. Mix well. Fill prepared muffin cups halfway with this mixture.\n" +
            "\n" +
            " Step 3\n" +
            "Bake at 375 degrees F (190 degrees C) for 12 to 15 minutes, or until golden and bubbly.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butter_tart);

        TextView butterTartRecipe = findViewById(R.id.ButterTartRecipe);
        butterTartRecipe.setText(ingredientsTitle);
        butterTartRecipe.setTextSize(20f);
        butterTartRecipe.append(ingredients);
        butterTartRecipe.setTextSize(15f);

        butterTartRecipe.append(instructionsTitle);
        butterTartRecipe.setTextSize(20f);
        butterTartRecipe.append(instructions);
        butterTartRecipe.setTextSize(15f);

        butterTartRecipe.setMovementMethod(new ScrollingMovementMethod());
    }
}