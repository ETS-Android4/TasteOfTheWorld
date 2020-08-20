package com.finalproject.tasteoftheworld;

import android.widget.TextView;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class TortillaSoupTest {

    @Rule
    public ActivityTestRule<TortillaSoup> mytestRule = new ActivityTestRule<>(TortillaSoup.class);

    private TortillaSoup mActivity = null;

    @Before
    public void setUp() throws Exception {
        mActivity = mytestRule.getActivity();
    }

    @Test
    public void testLaunch() {

        //Null check on text
        TextView recipeText = mActivity.findViewById(R.id.TortillaSoupRecipe);
        Assert.assertNotNull(recipeText);

    }

    @After
    public void tearDown() throws Exception {
        mActivity = null;
    }

}