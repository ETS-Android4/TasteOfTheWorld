package com.finalproject.tasteoftheworld;

import android.graphics.drawable.Drawable;
import android.widget.ImageButton;

import androidx.annotation.DrawableRes;
import androidx.test.rule.ActivityTestRule;

import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mytestRule = new ActivityTestRule<>(MainActivity.class);

    private MainActivity mActivity = null;

    @Before
    public void setUp() throws Exception {
         mActivity = mytestRule.getActivity();
    }

    @Test
    public void testLaunch() {
        ImageButton canadaImage = mActivity.findViewById(R.id.canada_button);
        Assert.assertNotNull(canadaImage);

        /*
        Drawable canadaPicActual = canadaImage.getBackground();
        Drawable canadaPicExpected = new Resources
        Assert.assertEquals(image1);
         */

        ImageButton guyanaImage = mActivity.findViewById(R.id.guyana_button);
        Assert.assertNotNull(guyanaImage);

        /*
        Test to compare images goes here
         */

        ImageButton mexicoImage = mActivity.findViewById(R.id.mexico_button);
        Assert.assertNotNull(mexicoImage);

        /*
        Test to compare image goes here
         */

        ImageButton japanImage = mActivity.findViewById(R.id.japan_button);
        Assert.assertNotNull(japanImage);

        /*
        Test to compare image goes here
         */

    }

    @After
    public void tearDown() throws Exception {

        mActivity = null;
    }
}