package com.stackroute.pe5;

import main.java.com.stackroute.pe5.WordCountMap;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

public class WordCountMapTest {
    WordCountMap wordCount;

    @Before
    public void setUp() throws Exception {
        wordCount = new WordCountMap();
    }

    @After
    public void tearDown() throws Exception {
        wordCount = null;
    }
    @Test
    public void numberOfCountsSuccess(){
        Map<String,Integer> expectedMap = new HashMap<>();
        expectedMap.put("one",5);
        expectedMap.put("two",2);
        expectedMap.put("three",2);
        Map<String,Integer> resultMap = wordCount.numberOfCounts("one one -one___two,,three,one @three*one?two");
        assertEquals(expectedMap,resultMap);
    }

    @Test
    public void numberOfCountsFailure(){
        Map<String,Integer> expectedMap = new HashMap<>();
        expectedMap.put("one",60);
        expectedMap.put("two",21);
        expectedMap.put("three",2);
        Map<String,Integer> resultMap = wordCount.numberOfCounts("one one -one___two,,three,one @three*one?two");
        assertNotEquals(expectedMap,resultMap);
    }

    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(wordCount.numberOfCounts(null));
    }
}
