package com.finalproject.tasteoftheworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Chicken extends AppCompatActivity {

    String ingredientsTitle = "INGREDIENTS:\n";

    String ingredients = "1-1/4 pounds boneless, skinless chicken breasts, cut into 1/4-inch strips\n" +
            "Salt and freshly ground black pepper\n" +
            "2-1/2 teaspoons curry powder, divided\n" +
            "3 tablespoons vegetable oil, divided\n" +
            "1 medium yellow onion, finely chopped\n" +
            "4 garlic cloves, minced\n" +
            "1 tablespoon grated fresh ginger\n" +
            "2 cups low sodium chicken broth, best quality such as Swanson\n" +
            "1 tablespoon cornstarch\n" +
            "2 teaspoons sugar\n" +
            "1 cup frozen peas (no need to thaw)\n" +
            "1/4 cup plain low fat (2%) or whole Greek yogurt (do not use nonfat)\n" +
            "1/4 cup chopped fresh cilantro\n";

    String instructionsTitle = "\nINSTRUCTIONS:\n";

    String instructions = "1. Sprinkle the chicken evenly with 3/4 teaspoon salt, 1/4 teaspoon pepper and 1 teaspoon curry powder.\n" +
            "2. Heat 1-1/2 tablespoons of oil in a 12-inch skillet over high heat until just smoking. Add the chicken in a single layer and cook, stirring occasionally, until lightly browned but still pink in spots, about 3 minutes. Transfer the partially cooked chicken to a clean bowl and set aside.\n" +
            "3. Add the remaining 1-1/2 tablespoons oil to the skillet and set heat to medium. Add the onions and cook, stirring occasionally, until softened, about 5 minutes. Stir in the garlic, ginger and remaining 1-1/2 teaspoons curry powder and cook until fragrant, about a minute more.\n" +
            "4. Whisk the chicken broth and cornstarch together to dissolve the cornstarch, then add to the skillet along with the sugar and 1/8 teaspoon salt. Bring to a boil, then reduce the heat to medium and cook until the sauce is nicely thickened, about 5 minutes.\n" +
            "\n" +
            "5. Add the peas and partially cooked chicken to the skillet, turn the heat down to low and simmer until the chicken is cooked through, a few minutes. Off the heat, stir in the yogurt and cilantro; then season with salt and pepper, to taste. Serve with basmati rice.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicken);

        TextView ChickenCurryRecipe = findViewById(R.id.ChickenCurryRecipe);
        ChickenCurryRecipe.setText(ingredientsTitle);
        ChickenCurryRecipe.setTextSize(20f);
        ChickenCurryRecipe.append(ingredients);
        ChickenCurryRecipe.setTextSize(15f);

        ChickenCurryRecipe.append(instructionsTitle);
        ChickenCurryRecipe.setTextSize(20f);
        ChickenCurryRecipe.append(instructions);
        ChickenCurryRecipe.setTextSize(15f);

        ChickenCurryRecipe.setMovementMethod(new ScrollingMovementMethod());
    }
}