package com.stackroute.pe5;

import main.java.com.stackroute.pe5.WordSortSet;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class WordSortSetTest {
    WordSortSet wordSort;
    @Before
    public void setUp()  {
        wordSort = new WordSortSet();
    }

    @After
    public void tearDown() throws Exception {
        wordSort = null;
    }

    @Test
    public void testSortWordsSuccess() {
        ArrayList<String> expectedString= new ArrayList<>();
        expectedString.add("Delhi");
        expectedString.add("Goa");
        expectedString.add("Karnataka");
        expectedString.add("Rajasthan");
        ArrayList<String> actualString = wordSort.sortWords("Karnataka Goa Rajasthan Delhi");
        assertEquals(expectedString,actualString);
    }

    @Test
    public void testSortWordsFailure() {
        ArrayList<String> expectedString = new ArrayList<>();
        expectedString.add("Delhi");
        expectedString.add("Karnataka");
        expectedString.add("Goa");
        expectedString.add("Rajasthan");
        ArrayList<String> actualString = wordSort.sortWords("Karnataka Goa Rajasthan Delhi");
        assertNotEquals(expectedString,actualString);
    }

    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(wordSort.sortWords(null));
    }
}