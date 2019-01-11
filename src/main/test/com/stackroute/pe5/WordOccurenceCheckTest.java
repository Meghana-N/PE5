package com.stackroute.pe5;

import main.java.com.stackroute.pe5.WordOccurenceCheck;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class WordOccurenceCheckTest {
    WordOccurenceCheck obj;
    @Before
    public void setUp()  {
        obj = new WordOccurenceCheck();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void testwordOccurenceSuccess() {
        String inputStr = "b w z w";
        Map<String, Boolean> expectedStr = new HashMap<String, Boolean>();
        expectedStr.put("z", false );
        expectedStr.put("b", false );
        expectedStr.put("w", true );
        Map<String, Boolean> actualStr = obj.wordOccurence(inputStr);
        assertEquals(expectedStr,actualStr);
    }

    @Test
    public void testwordOccurenceFailure() {
        String inputStr = "b w z w b";
        Map<String, Boolean> expectedStr = new HashMap<String, Boolean>();
        expectedStr.put("z", false );
        expectedStr.put("b", false );
        expectedStr.put("w", true );
        Map<String, Boolean> actualStr = obj.wordOccurence(inputStr);
        assertNotEquals(expectedStr,actualStr);
    }

}