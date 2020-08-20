package com.finalproject.tasteoftheworld;

import android.widget.Button;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class MexicoRecipesTest {
    @Rule
    public ActivityTestRule<MexicoRecipes> mytestRule = new ActivityTestRule<>(MexicoRecipes.class);

    private MexicoRecipes mActivity = null;

    @Before
    public void setUp() throws Exception {
        mActivity = mytestRule.getActivity();
    }

    @Test
    public void testLaunch() {
        //**************************Will be adding image test later on***************************

        //chile Button test
        Button dish1 = mActivity.findViewById(R.id.dish_Four);
        Assert.assertNotNull(dish1);
        Assert.assertEquals("Chile en Nogada",dish1.getText().toString());

        //Tortilla soup Button test
        Button dish2 = mActivity.findViewById(R.id.dish_Three);
        Assert.assertNotNull(dish2);
        Assert.assertEquals("Sopa de tortilla (Tortilla soup)", dish2.getText().toString());

        //Enfrijolada Button test
        Button dish3 = mActivity.findViewById(R.id.dish_Two);
        Assert.assertNotNull(dish3);
        Assert.assertEquals("Enfrijoladas (Bean Fold Tortilla)",dish3.getText().toString());
    }

    @After
    public void tearDown() throws Exception {
        mActivity = null;
    }

}