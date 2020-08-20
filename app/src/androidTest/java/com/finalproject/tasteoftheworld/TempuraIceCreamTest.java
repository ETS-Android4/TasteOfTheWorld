package com.finalproject.tasteoftheworld;

import android.widget.TextView;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class TempuraIceCreamTest {

    @Rule
    public ActivityTestRule<TempuraIceCream> mytestRule = new ActivityTestRule<>(TempuraIceCream.class);

    private TempuraIceCream mActivity = null;

    @Before
    public void setUp() throws Exception {
        mActivity = mytestRule.getActivity();
    }

    @Test
    public void testLaunch() {

        //Null check on text
        TextView recipeText = mActivity.findViewById(R.id.TempuraIceRecipe);
        Assert.assertNotNull(recipeText);

    }

    @After
    public void tearDown() throws Exception {
        mActivity = null;
    }

}