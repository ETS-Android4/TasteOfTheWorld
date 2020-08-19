package com.finalproject.tasteoftheworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Pepper extends AppCompatActivity {

    String ingredientsTitle = "INGREDIENTS:\n";

    String ingredients = "3 lbs boneless stewing beef cube , such as chuck, brisket, or bottom round\n" +
            "1 tsp salt\n" +
            "1/2 tsp black pepper\n" +
            "1 tbsp vegetable oil\n" +
            "1 large onion , chopped\n" +
            "4 garlic cloves , chopped\n" +
            "1/2 cup cassareep , (see tips)\n" +
            "2 habanero peppers , or 3 to 4 wiri wiri peppers, left whole, or seeded and chopped\n" +
            "2-in. piece ginger , peeled and minced\n" +
            "3 tbsp brown sugar\n" +
            "2 3-inch strips orange , zest, removed with a vegetable peeler\n" +
            "4 sprigs thyme\n" +
            "1 2-to 3-in. cinnamon sticks\n" +
            "1/4 tsp allspice , (optional)\n" +
            "3 whole cloves\n";

    String instructionsTitle = "\nINSTRUCTIONS:\n";

    String instructions = "1. Pat beef dry and cut into 1 ½-inch pieces. Season with salt and pepper.\n" +
            "\n" +
            "2. Heat oil in a large pot or Dutch oven over medium heat.\n" +
            "\n" +
            "3. Add the meat in batches and brown on all sides. Transfer to a plate. Drain all but 1 tablespoon of fat from the pot (if necessary, add more fat) and add onion and garlic. Cook, stirring, until softened, about 6 minutes.\n" +
            "\n" +
            "4. Return the meat to the pot along with cassareep, habaneros or wiri wiri peppers, ginger, brown sugar, orange zest, thyme, cinnamon stick, allspice and cloves.\n" +
            "\n" +
            "5. Add enough water to the pot to just cover the meat. Bring to a boil, then reduce the heat, cover, and simmer gently over medium-low heat until the meat is completely tender, about 3 hours. Remove the cinnamon stick, herb sprigs, and orange zest (and peppers, if left whole).\n" +
            "\n" +
            "6. Serve as a stew with crusty white bread. Or, to serve over rice, transfer the meat to a plate with a slotted spoon. Reduce the liquid in the pot over medium-high heat until it has thickened into a sauce. Return the meat to the pot, let stand for a few minutes, and serve with cooked rice, Coconut Rice, or Jamaican Rice and Peas. Garnish with chopped cilantro.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pepper);

        TextView PepperPotRecipe = findViewById(R.id.PepperPotRecipe);
        PepperPotRecipe.setText(ingredientsTitle);
        PepperPotRecipe.setTextSize(20f);
        PepperPotRecipe.append(ingredients);
        PepperPotRecipe.setTextSize(15f);

        PepperPotRecipe.append(instructionsTitle);
        PepperPotRecipe.setTextSize(20f);
        PepperPotRecipe.append(instructions);
        PepperPotRecipe.setTextSize(15f);

        PepperPotRecipe.setMovementMethod(new ScrollingMovementMethod());
    }
}