package com.finalproject.tasteoftheworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Fish extends AppCompatActivity {

    String ingredientsTitle = "INGREDIENTS:\n";

    String ingredients = "Bake\n" +
            "3 cups flour\n" +
            "4 tablespoon shortening or butter\n" +
            "2 1/2 teaspoon baking powder\n" +
            "\n" +
            "3 Tablespoon sugar\n" +
            "1 1/4 teaspoon salt\n" +
            "1 cup plus 2 tablespoon water or more\n" +
            "Sautee Salt fish\n" +
            "2 tablespoon cooking oil\n" +
            "½ pound salt fish\n" +
            "½ medium onion diced\n" +
            "2 teaspoons minced garlic\n" +
            "1 teaspoon thyme\n" +
            "½ teaspoon smoked paprika\n" +
            "½ teaspoon white pepper\n" +
            "1-2 green onions chopped\n" +
            "2-3 tablespoon parsley\n" +
            "2-3 to matoes diced\n" +
            "1/2 or teaspoons hot sauce or pepper adjust to taste\n" +
            "½ teaspoons or bouillon powder optional\n" +
            "Soak salt fish in water overnight or several days water changed several times. Drain and shred fish finely shred.\n";

    String instructionsTitle = "\nINSTRUCTIONS:\n";

    String instructions = "Salt fish\n" +
            "1. In a medium-large skillet, add oil, onions, garlic, thyme, paprika and sauté, for about 2-3 minutes, stirring constantly to prevent any burns. Followed by tomatoes continue cooking for about 3 minutes then add, hot pepper, white pepper, mix until ingredients have been thoroughly combined. Cook for about 5 minutes or more. Add water as needed\n" +
            "2. Finally throw in salt fish, cook for 5 minutes or more -adjust the seasoning, to taste. Remove from the heat and let it cool. You may prepare this a day in advance.\n" +
            "Bake\n" +
            "1. In a large bowl, whisk together flour, sugar, baking powder, and salt; add shortening or butter, and, using your fingers.\n" +
            "2. Gently stir in water into dry ingredients until all is moistened and holds together (like a ball).\n" +
            "3. Place on a floured board and knead for about a minute. Let it rest for about 15-20mins\n" +
            "Method 1\n" +
            "1. You may divide dough into about 10-12 pieces and roughly shape into ball.\n" +
            "2. When ready Flatten each ball to ½ inch thick, place on cookie sheet\n" +
            "Method 2\n" +
            "1. Turn dough on a floured surface,\n" +
            "2. Roll out dough in to 1 inch thick, cut into desired shapes or use 3 inch or larger cookie cutter to cut dough.\n" +
            "3. In a large, sauce pan pour vegetable oil, until it is at least 3 inches (or about 5 centimeters) high, place on medium heat until oil is 350 degrees.\n" +
            "Frying Method\n" +
            "1. Fry until golden brown about 3-5 minutes depending on size. Remove with a slotted spoon and drain on paper napkin. Let it cool\n" +
            "2. Split in half and fill with salt fish. Serve warm\n" +
            "Baking Method\n" +
            "1. Bake at 375° for 15-18 minutes or until lightly browned\n" +
            "2. Remove and serve warm";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fish);

        TextView SaltFishRecipe = findViewById(R.id.SaltFishRecipe);
        SaltFishRecipe.setText(ingredientsTitle);
        SaltFishRecipe.setTextSize(20f);
        SaltFishRecipe.append(ingredients);
        SaltFishRecipe.setTextSize(15f);

        SaltFishRecipe.append(instructionsTitle);
        SaltFishRecipe.setTextSize(20f);
        SaltFishRecipe.append(instructions);
        SaltFishRecipe.setTextSize(15f);

        SaltFishRecipe.setMovementMethod(new ScrollingMovementMethod());
    }
}