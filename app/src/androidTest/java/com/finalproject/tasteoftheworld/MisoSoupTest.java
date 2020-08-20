package com.finalproject.tasteoftheworld;

import android.widget.TextView;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class MisoSoupTest {

    @Rule
    public ActivityTestRule<MisoSoup> mytestRule = new ActivityTestRule<>(MisoSoup.class);

    private MisoSoup mActivity = null;

    @Before
    public void setUp() throws Exception {
        mActivity = mytestRule.getActivity();
    }

    @Test
    public void testLaunch() {

        //Null check on text
        TextView recipeText = mActivity.findViewById(R.id.MisoSoupRecipe);
        Assert.assertNotNull(recipeText);

    }

    @After
    public void tearDown() throws Exception {
        mActivity = null;
    }


}