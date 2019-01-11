package main.test;

import main.java.WordCountMap;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class WordCountMapTest {
    WordCountMap test;

    @Before
    public void setUp() throws Exception {
        test = new WordCountMap();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }
    @Test
    public void numberOfCountsSuccess(){
        Map<String,Integer> expectedmap = new HashMap<>();
        expectedmap.put("one",5);
        expectedmap.put("two",2);
        expectedmap.put("three",2);

        Map<String,Integer> resultmap = test.numberOfCounts("one one -one___two,,three,one @three*one?two");
        assertEquals(expectedmap,resultmap);
    }

    @Test
    public void numberOfCountsFailure(){
        Map<String,Integer> expectedmap = new HashMap<>();
        expectedmap.put("one",1);
        expectedmap.put("two",1);
        expectedmap.put("three",2);

        Map<String,Integer> resultmap = test.numberOfCounts("one one -one___two,,three,one @three*one?two");
        assertNotEquals(expectedmap,resultmap);
    }
}
