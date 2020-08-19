package com.finalproject.tasteoftheworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class TempuraIceCream extends AppCompatActivity {

    String ingredientsTitle = "INGREDIENTS:\n";

    String ingredients = "2 scoops vanilla ice cream\n" +
            "4 piece (1/10 of cake)s slices pound cake (1/2 inch thick)\n" +
            "1 quart vegetable oil for frying\n" +
            "1 egg, beaten\n" +
            "¾ cup water\n" +
            "1 ½ cups all-purpose flour\n";

    String instructionsTitle = "\nINSTRUCTIONS:\n";

    String instructions = "Step 1\n" +
            "Place each scoop of ice cream between two pieces of pound cake like a sandwich. Wrap each tightly in plastic wrap, pressing on the sandwich to squeeze the corners around the ice cream. Place into the freezer, and freeze until solid, 1 to 2 hours.\n" +
            "\n" +
            " Step 2\n" +
            "Heat oil in deep-fryer to 375 degrees F (190 degrees C).\n" +
            "\n" +
            " Step 3\n" +
            "Whisk together the egg and water, then whisk in the flour until no lumps remain. Unwrap the frozen sandwiches, and dip into the tempura batter. Allow the excess batter to drip off, then place the sandwiches into the hot oil. Fry 20 to 30 seconds until golden brown. Drain briefly on a paper towel-lined plate before cutting in half to serve.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempura_ice_cream);

        TextView tempuraIceRecipe = findViewById(R.id.TempuraIceRecipe);
        tempuraIceRecipe.setText(ingredientsTitle);
        tempuraIceRecipe.setTextSize(20f);
        tempuraIceRecipe.append(ingredients);
        tempuraIceRecipe.setTextSize(15f);

        tempuraIceRecipe.append(instructionsTitle);
        tempuraIceRecipe.setTextSize(20f);
        tempuraIceRecipe.append(instructions);
        tempuraIceRecipe.setTextSize(15f);

        tempuraIceRecipe.setMovementMethod(new ScrollingMovementMethod());
    }
}