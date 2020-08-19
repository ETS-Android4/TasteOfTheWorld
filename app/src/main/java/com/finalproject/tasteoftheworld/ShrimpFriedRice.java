package com.finalproject.tasteoftheworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class ShrimpFriedRice extends AppCompatActivity {

    String ingredientsTitle = "INGREDIENTS:\n";

    String ingredients = "2 tablespoons sesame oil\n" +
            "2 tablespoons olive oil\n" +
            "1 pound uncooked medium shrimp, peeled and deveined\n" +
            "1 cup frozen peas and carrots\n" +
            "½ cup frozen corn\n" +
            "2 cloves garlic, finely minced, or more to taste\n" +
            "3 large eggs, lightly beaten\n" +
            "4 cups cooked rice\n" +
            "3 tablespoons thinly sliced green onions\n" +
            "3 tablespoons low-sodium soy sauce, or more to taste\n" +
            "½ teaspoon salt, or to taste\n" +
            "½ teaspoon freshly ground black pepper, or to taste\n";

    String instructionsTitle = "\nINSTRUCTIONS:\n";

    String instructions = "Step 1\n" +
            "Heat sesame oil and olive oil in a large nonstick skillet or wok over medium-high heat. Add shrimp and cook until they are bright pink on the outside and the meat is opaque, about 3 minutes, flipping halfway through.\n" +
            "\n" +
            " Step 2\n" +
            "Remove shrimp from the skillet using a slotted spoon, allowing oils and cooking juices to remain in the skillet. Place shrimp on a plate and set aside.\n" +
            "\n" +
            " Step 3\n" +
            "Add peas and carrots and corn to the skillet and cook, stirring intermittently, until vegetables begin to soften, about 2 minutes. Add garlic; cook and stir for 1 minute. Push vegetables to the side of the skillet, pour eggs into the other side, and cook to scramble, stirring as necessary, 3 to 4 minutes.\n" +
            "\n" +
            " Step 4\n" +
            "Stir shrimp, rice, and green onions into the skillet. Drizzle evenly with soy sauce, season with salt and pepper, and stir to combine. Cook until shrimp is reheated through, about 2 minutes.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shrimp_fried_rice);

        TextView shrimpFriedRecipe = findViewById(R.id.ShrimpFriedRiceRecipe);
        shrimpFriedRecipe.setText(ingredientsTitle);
        shrimpFriedRecipe.setTextSize(20f);
        shrimpFriedRecipe.append(ingredients);
        shrimpFriedRecipe.setTextSize(15f);

        shrimpFriedRecipe.append(instructionsTitle);
        shrimpFriedRecipe.setTextSize(20f);
        shrimpFriedRecipe.append(instructions);
        shrimpFriedRecipe.setTextSize(15f);

        shrimpFriedRecipe.setMovementMethod(new ScrollingMovementMethod());
    }
}