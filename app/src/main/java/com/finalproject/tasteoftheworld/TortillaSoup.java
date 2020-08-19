package com.finalproject.tasteoftheworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class TortillaSoup extends AppCompatActivity {

    String ingredientsTitle = "INGREDIENTS:\n";

    String ingredients = "1 can (14-1/2 ounces) diced tomatoes, drained\n" +
            "1 serrano pepper, seeded and chopped\n" +
            "1/2 cup plus 1 tablespoon canola oil, divided\n" +
            "6 corn tortillas (6 inches), halved and cut into 1/4-inch strips\n" +
            "2 dried pasilla chilies, stems removed, seeded and cut into 1/2-inch pieces\n" +
            "1/2 cup finely chopped onion\n" +
            "2 garlic cloves, minced\n" +
            "6 cups chicken broth\n" +
            "1-1/2 cups fresh or frozen corn\n" +
            "3/4 cup shredded cooked chicken\n" +
            "1 tablespoon minced fresh epazote or 1 teaspoon dried epazote\n" +
            "1 tablespoon lime juice\n" +
            "Cubed avocado and lime wedges, optional\n";

    String instructionsTitle = "\nINSTRUCTIONS:\n";

    String instructions = "1. In a blender, combine tomatoes and serrano pepper. Cover and process until smooth; set aside. In a large skillet, heat 1/2 cup oil over medium heat. Add tortilla strips; cook and stir until golden brown and crisp.\n" +
            "2. Remove to paper towels; pat dry. Drain, reserving 2 tablespoons oil in skillet. Add pasilla chilies; cook and stir for 1 minute or until lightly toasted. With a slotted spoon, remove to paper towels to drain.\n" +
            "3. In a large saucepan, saute onion and garlic in remaining oil until tender. Add tomato mixture; cook and stir over medium heat for 10 minutes or until very thick. Add the broth, corn, chicken and epazote; bring to a boil. Reduce heat; cover and simmer for 30 minutes. Stir in lime juice.\n" +
            "4. Ladle soup into bowls; top with tortilla strips. Sprinkle with pasilla chilies. Garnish with avocado and lime if desired.";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tortilla_soup);

        TextView TortillaSoupRecipe = findViewById(R.id.TortillaSoupRecipe);
        TortillaSoupRecipe.setText(ingredientsTitle);
        TortillaSoupRecipe.setTextSize(20f);
        TortillaSoupRecipe.append(ingredients);
        TortillaSoupRecipe.setTextSize(15f);

        TortillaSoupRecipe.append(instructionsTitle);
        TortillaSoupRecipe.setTextSize(20f);
        TortillaSoupRecipe.append(instructions);
        TortillaSoupRecipe.setTextSize(15f);

        TortillaSoupRecipe.setMovementMethod(new ScrollingMovementMethod());
    }
}