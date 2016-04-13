package com.android.test2.Junit;

import android.test.ActivityInstrumentationTestCase2;

import com.android.test2.MainActivity;

/**
 * Created by Zhuyupei on 4/13/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;
    public JUnit_test(){
        super(MainActivity.class);
    }

    public void test_sum(){
        mainActivity = getActivity();
        assertEquals(mainActivity.sum(1, 3), 4);
        assertEquals(mainActivity.sum(3, 3), 6);
        assertEquals(mainActivity.sum(7, 3), 10);
        assertEquals(mainActivity.sum(1, 10), 11);
        assertEquals(mainActivity.sum(32, 3), 35);
    }
}
