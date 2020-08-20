package com.finalproject.tasteoftheworld;

import android.widget.Button;
import android.widget.ImageButton;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class CanadaRecipiesTest {

    @Rule
    public ActivityTestRule<CanadaRecipies> mytestRule = new ActivityTestRule<>(CanadaRecipies.class);

    private CanadaRecipies mActivity = null;

    @Before
    public void setUp() throws Exception {
        mActivity = mytestRule.getActivity();
    }

    @Test
    public void testLaunch() {
        //Butter Tart Button test
       Button dish1 = mActivity.findViewById(R.id.dish_Four);
       Assert.assertNotNull(dish1);
       Assert.assertEquals("Butter Tart",dish1.getText().toString());

       //Beaver Tail Button test
        Button dish2 = mActivity.findViewById(R.id.dish_Three);
        Assert.assertNotNull(dish2);
        Assert.assertEquals("Beaver Tail", dish2.getText().toString());

        //Poutine Button test
        Button dish3 = mActivity.findViewById(R.id.dish_Two);
        Assert.assertNotNull(dish3);
        Assert.assertEquals("Poutine",dish3.getText().toString());
    }

    @After
    public void tearDown() throws Exception {

        mActivity = null;
    }
}