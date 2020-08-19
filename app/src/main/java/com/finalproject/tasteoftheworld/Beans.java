package com.finalproject.tasteoftheworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Beans extends AppCompatActivity {

    String ingredientsTitle = "INGREDIENTS:\n";

    String ingredients = "2 15-ounce cans black beans\n" +
            "1 chipotle peppers in adobo sauce (add more or less depending on how spicy you like it - I used 3 peppers with sauce)\n" +
            "1/2 cup chopped onions\n" +
            "1 1/2 teaspoon minced garlic (about 3 cloves)\n" +
            "1/4 teaspoon oregano\n" +
            "1 tablespoon olive oil\n" +
            "12 corn tortillas\n" +
            "8 ounces queso fresco (feta, cotija or monterey jack cheese would also work)\n" +
            "for topping: chopped cilantro, sour cream, red salsa\n";

    String instructionsTitle = "\nINSTRUCTIONS:\n";

    String instructions = "1. In a large blender, add the black beans (undrained), chipotle peppers, onions, garlic and oregano. Blend until the black bean sauce is silky smooth.\n" +
            "2. Heat a medium pot or skillet over medium-high heat. Add the olive oil and pour in the black bean sauce. Cook, stirring frequently, until the mixture is hot and bubbly. (If the sauce ever gets too thick, simply add some water or broth and mix it in.)\n" +
            "3. Heat up the corn tortillas on a skillet or in the microwave for 1 minute, until warm and pliable.\n" +
            "4. To assemble the enfrijoladas, dip each tortilla into the black bean sauce. Transfer tortilla to a plate and fill with cheese. Roll it up like an enchilada or fold it over like a taco. \n" +
            "5. Serve immediately with  fresh cilantro, sour cream and red salsa.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beans);

        TextView BeansRecipe = findViewById(R.id.BeansRecipe);
        BeansRecipe.setText(ingredientsTitle);
        BeansRecipe.setTextSize(20f);
        BeansRecipe.append(ingredients);
        BeansRecipe.setTextSize(15f);

        BeansRecipe.append(instructionsTitle);
        BeansRecipe.setTextSize(20f);
        BeansRecipe.append(instructions);
        BeansRecipe.setTextSize(15f);

        BeansRecipe.setMovementMethod(new ScrollingMovementMethod());
    }

}