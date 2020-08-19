package com.finalproject.tasteoftheworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class BeaverTail extends AppCompatActivity {

    String ingredientsTitle = "INGREDIENTS:\n";

    String ingredients = "1/4 cup warm water\n" +
            "8g pkg or 2-1/2 tsp active dry yeast\n" +
            "1/2 cup milk, warmed\n" +
            "2 Tbsp butter, melted\n" +
            "2 Tbsp sugar\n" +
            "1/2 tsp salt\n" +
            "1/2 tsp vanilla\n" +
            "1 eggs\n" +
            "2-1/2 cups all purpose flour, plus extra for dusting\n" +
            "\n" +
            "1 L vegetable oil for deep-frying\n";

    String instructionsTitle = "\nINSTRUCTIONS:\n";

    String instructions = "1. In the bowl of a stand mixer combine the warm water, warm milk, yeast and 1 tsp sugar. Let stand until foamy, about 10 minutes.\n" +
            "\n" +
            "2. Add melted butter, sugar, salt, vanilla and eggs. Give everything a good mix together. Add flour and mix with the dough hook (or with a wooden spoon if you’re not using a mixer) and mix until the dough comes together and no longer sticks to the sides of the bowl. Knead for about 6 minutes in the mixer and 10 minutes by hand, until the dough is smooth, silky. Use extra flour if dough is sticky.\n" +
            "\n" +
            "3. Place dough in a lightly oiled bowl and cover with a damp towel. Leave to rise until doubled in size, about 1 hour.\n" +
            "\n" +
            "4. Punch down dough and place onto a lightly floured countertop. Shape into 8 equal sized pieces. Using a rolling pin, roll out each piece of dough into an oval shape. If you like, score a crisscross pattern in the top of dough.\n" +
            "\n" +
            "5. Place on a lightly floured baking sheet and leave to rise, covered, for 30 minutes or until doubled in size.\n" +
            "\n" +
            "6. Make cinnamon sugar by combining sugar and cinnamon in a large bowl.\n" +
            "\n" +
            "7. Heat a large wide pot with about two inches of oil. Heat to 350F/176C. If you don’t have a thermometer, check the oil’s temperature by tearing off a small piece of dough and see if it sizzles and floats to the surface. Keep a close eye on the oil, adjust temperature as needed to prevent it from getting too hot. If you see it smoking or crackling take off the heat to cool down before frying.\n" +
            "\n" +
            "8. Fry your doughnuts on each side for 30-60 seconds until they are golden brown. Dunk immediately in cinnamon sugar or top with lemon and sugar, Nutella, jam or my favourite, maple syrup!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beaver_tail);

        TextView beaverTailRecipe = findViewById(R.id.BeaverTailRecipe);
        beaverTailRecipe.setText(ingredientsTitle);
        beaverTailRecipe.setTextSize(20f);
        beaverTailRecipe.append(ingredients);
        beaverTailRecipe.setTextSize(15f);

        beaverTailRecipe.append(instructionsTitle);
        beaverTailRecipe.setTextSize(20f);
        beaverTailRecipe.append(instructions);
        beaverTailRecipe.setTextSize(15f);

        beaverTailRecipe.setMovementMethod(new ScrollingMovementMethod());
    }
}