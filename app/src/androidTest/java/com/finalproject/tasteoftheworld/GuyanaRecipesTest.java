package com.finalproject.tasteoftheworld;

import android.widget.Button;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuyanaRecipesTest {

    @Rule
    public ActivityTestRule<GuyanaRecipes> mytestRule = new ActivityTestRule<>(GuyanaRecipes.class);

    private GuyanaRecipes mActivity = null;

    @Before
    public void setUp() throws Exception {
        mActivity = mytestRule.getActivity();
    }

    @Test
    public void testLaunch() {
        //**************************Will be adding image test later on***************************

        //Pepperpot Button test
        Button dish1 = mActivity.findViewById(R.id.dish_Four);
        Assert.assertNotNull(dish1);
        Assert.assertEquals("Pepperpot \nSoup",dish1.getText().toString());

        //Chicken Curry Button test
        Button dish2 = mActivity.findViewById(R.id.dish_Three);
        Assert.assertNotNull(dish2);
        Assert.assertEquals("Chicken Curry", dish2.getText().toString());

        //Saltfish Button test
        Button dish3 = mActivity.findViewById(R.id.dish_Two);
        Assert.assertNotNull(dish3);
        Assert.assertEquals("Saltfish \nand Bake",dish3.getText().toString());
    }

    @After
    public void tearDown() throws Exception {
        mActivity = null;
    }
}