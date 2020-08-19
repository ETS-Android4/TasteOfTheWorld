package com.finalproject.tasteoftheworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Chile extends AppCompatActivity {

    String ingredientsTitle = "INGREDIENTS:\n";

    String ingredients = "6 large poblano chiles about 6″ long\n" +
            "FILLING\n" +
            "10 ozs. beef\n" +
            "10 ozs. pork\n" +
            "1 medium carrot\n" +
            "1 medium white onion\n" +
            "1 medium waxy potato\n" +
            "1 medium zucchini squash\n" +
            "3 plum tomatoes Roma tomatoes\n" +
            "1/2 cup peas\n" +
            "8 ozs. biznaga or candied fruit or dried fruit\n" +
            "1/2 cup raisins\n" +
            "1/2 cup almonds\n" +
            "1/2 tsp. cinnamon\n" +
            "1 tbsp  brown sugar\n" +
            "1 tsp  salt + salt to taste\n" +
            "NOGADA\n" +
            "1 1/4 cup Mexican cream do not use sour cream\n" +
            "1/2 cup shelled walnuts\n" +
            "1/2 teaspoon cinnamon\n" +
            "1 tbsp  brown sugar\n" +
            "GARNISH\n" +
            "2 small pomegranates or 1 large\n" +
            "1 small bunch of parsley\n";

    String instructionsTitle = "\nINSTRUCTIONS:\n";

    String instructions = "1. PRECOOK THE MEAT\n" +
            "2. Place the meat in a pan and just cover with water. Bring to a simmer and cook the meat until just cooked through (about 20 minutes) turning once. When the meat is cooked remove it from the pan and allow it to cool to the touch. Reserve the cooking liquid.\n" +
            "3. CHOP THE INGREDIENTS\n" +
            "4. Chop the meat into cubes first then chop finely.\n" +
            "5. Chop the onion, carrot, zucchini, potato and candied fruit into 1/4\" cubes.\n" +
            "6. Chop the almond very fine.\n" +
            "7. PREPARE THE TOMATO BASE\n" +
            "8. Slice the tomatoes in half and add them to your blender with 1/2 cup of the cooking liquid from the meat.\n" +
            "9. Blend until smooth but not liquefied.\n" +
            "10. COOK THE FILLING\n" +
            "11. Fry the onions in 3 tablespoons of oil for 2 minutes.\n" +
            "12. Add the potatoes, stir and cook for 5 minutes.\n" +
            "13. Add the chopped meat and stir.\n" +
            "14. Add the pureed tomato.\n" +
            "15. Add the carrots, zucchini, and raisins and cook for 5 minutes until the tomato puree is starting to reduce.\n" +
            "16. Add the peas, biznaga or candied fruit and almonds. stir well.\n" +
            "17. Cook for 15 minutes until all of the vegetables are fully cooked and tender and the liquid is reduced.\n" +
            "18. Note: If the filling starts to get too dry before all of the ingredients are fully cooked add the cooking liquid from the meat a few tablespoons at a time as needed.\n" +
            "19. ROAST AND CLEAN THE POBLANO CHILES\n" +
            "20. Place the chiles over the open flame on the burner on your stove. Note: Do not leave chiles unattended.\n" +
            "21. Blacken and blister the skin on all sides.\n" +
            "22. When you have roasted all of the chiles place them in a plastic bag to sweat them.\n" +
            "23. Scrape the skin the chiles with the blade of a knife.\n" +
            "24. Using a small knife, gently split the chile down the side without cutting all the way through the tip of the chile.\n" +
            "25. Remove the seeds inside the chile with your fingers without tearing the chile.\n" +
            "26. PREPARE THE NOGADA\n" +
            "27. Place the cream, walnuts, and cinnamon in your blender.\n" +
            "28. Blend until the walnuts are completely incorporated into the sauce and the sauce is smooth.\n" +
            "29. PREPARE THE GARNISHES\n" +
            "30. Slice the pomegranates in half.\n" +
            "31. Remove the seeds from your pomegranates.\n" +
            "32. Chop the parsley very finely reserving a few leaves to use as decoration.\n" +
            "33. SERVE THE CHILES EN NOGADA\n" +
            "34. Fill each poblano chile with enough filling so that it will just close. Use toothpicks to keep each chile closed if needed.\n" +
            "35. Place 1 stuffed chile on each plate.\n" +
            "36. Spoon nogada over the stuffed chile until the chile is completely covered.\n" +
            "37. Sprinkle pomegranate seeds and chopped parsley over the chile covered in nogada.\n" +
            "38. Decorate with a 1 or 2 parsley leaves.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chile);

        TextView ChileRecipe = findViewById(R.id.ChileRecipe);
        ChileRecipe.setText(ingredientsTitle);
        ChileRecipe.setTextSize(20f);
        ChileRecipe.append(ingredients);
        ChileRecipe.setTextSize(15f);

        ChileRecipe.append(instructionsTitle);
        ChileRecipe.setTextSize(20f);
        ChileRecipe.append(instructions);
        ChileRecipe.setTextSize(15f);

        ChileRecipe.setMovementMethod(new ScrollingMovementMethod());
    }
}