package com.finalproject.tasteoftheworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class MisoSoup extends AppCompatActivity {

    String ingredientsTitle = "INGREDIENTS:\n";

    String ingredients = "1 tablespoon finely chopped wakame\n" +
            "4 cups water\n" +
            "2 teaspoons dashi granules\n" +
            "3 tablespoons miso paste\n" +
            "4 ounces silken tofu, cubed\n" +
            "2 eaches green onions, sliced on the bias\n";

    String instructionsTitle = "\nINSTRUCTIONS:\n";

    String instructions = "Step 1\n" +
            "Place wakame in a fine-mesh sieve and soak in some cold water for 10 minutes.\n" +
            "\n" +
            " Step 2\n" +
            "Combine 4 cups water and dashi granules in a saucepan and bring to a boil over medium heat. Add miso paste and whisk to dissolve. Add wakame and simmer for 3 minutes.\n" +
            "\n" +
            " Step 3\n" +
            "Divide tofu between 4 serving bowls. Ladle miso soup on top and garnish with green onions.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miso_soup);

        TextView misoSoupRecipe = findViewById(R.id.MisoSoupRecipe);
        misoSoupRecipe.setText(ingredientsTitle);
        misoSoupRecipe.setTextSize(20f);
        misoSoupRecipe.append(ingredients);
        misoSoupRecipe.setTextSize(15f);

        misoSoupRecipe.append(instructionsTitle);
        misoSoupRecipe.setTextSize(20f);
        misoSoupRecipe.append(instructions);
        misoSoupRecipe.setTextSize(15f);

        misoSoupRecipe.setMovementMethod(new ScrollingMovementMethod());
    }
}