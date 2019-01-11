package com.stackroute.pe5;

import main.java.com.stackroute.pe5.WordSortSet;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class WordSortSetTest {
    WordSortSet obj;
    @Before
    public void setUp()  {
        obj = new WordSortSet();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void testSortWordsSuccess() {
        ArrayList<String> expectedStr = new ArrayList<>();
        expectedStr.add("Delhi");
        expectedStr.add("Goa");
        expectedStr.add("Karnataka");
        expectedStr.add("Rajasthan");
        ArrayList<String> actualStr = obj.sortWords("Karnataka Goa Rajasthan Delhi");
        assertEquals(expectedStr,actualStr);
    }

    @Test
    public void testSortWordsFailure() {
        ArrayList<String> expectedStr = new ArrayList<>();
        expectedStr.add("Delhi");
        expectedStr.add("Karnataka");
        expectedStr.add("Goa");
        expectedStr.add("Rajasthan");
        ArrayList<String> actualStr = obj.sortWords("Karnataka Goa Rajasthan Delhi");
        assertNotEquals(expectedStr,actualStr);
    }
}