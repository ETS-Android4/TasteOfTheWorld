package com.finalproject.tasteoftheworld;

import android.widget.Button;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class JapanRecipiesTest {

    @Rule
    public ActivityTestRule<JapanRecipies> mytestRule = new ActivityTestRule<>(JapanRecipies.class);

    private JapanRecipies mActivity = null;

    @Before
    public void setUp() throws Exception {
        mActivity = mytestRule.getActivity();
    }

    @Test
    public void testLaunch() {
        //**************************Will be adding image test later on***************************

        //Ice cream Button test
        Button dish1 = mActivity.findViewById(R.id.dish_Four);
        Assert.assertNotNull(dish1);
        Assert.assertEquals("Tempura \nIce Cream",dish1.getText().toString());

        //Miso Soup Button test
        Button dish2 = mActivity.findViewById(R.id.dish_Three);
        Assert.assertNotNull(dish2);
        Assert.assertEquals("Miso Soup", dish2.getText().toString());

        //Fried Rice Button test
        Button dish3 = mActivity.findViewById(R.id.dish_Two);
        Assert.assertNotNull(dish3);
        Assert.assertEquals("Fried Rice \nw/ Shrimp",dish3.getText().toString());
    }

    @After
    public void tearDown() throws Exception {
        mActivity = null;
    }

}