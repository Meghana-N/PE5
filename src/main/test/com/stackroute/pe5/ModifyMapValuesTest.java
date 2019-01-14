package com.stackroute.pe5;

import main.java.com.stackroute.pe5.ModifyMapValues;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ModifyMapValuesTest {
    ModifyMapValues modifyValues;
    @Before
    public void setUp()  {
        modifyValues = new ModifyMapValues();
    }

    @After
    public void tearDown() throws Exception {
        modifyValues = null;
    }

    @Test
    public void testModifyMapValueSuccess() {
        LinkedHashMap<String,String> inputMap=new LinkedHashMap<String,String>();
        inputMap.put("val1","abc");
        inputMap.put("val2","xyz");
        Map<String, String> actualString = modifyValues.modifyValues(inputMap);
        LinkedHashMap<String,String> expectedString=new LinkedHashMap<String,String>();
        expectedString.put("val1"," ");
        expectedString.put("val2","abc");
        assertEquals(expectedString,actualString);
    }

    @Test
    public void testModifyMapValueFailure() {
        LinkedHashMap<String,String> inputMap=new LinkedHashMap<String,String>();
        inputMap.put("val1","abc");
        inputMap.put("val2","xyz");
        Map<String, String> actualString = modifyValues.modifyValues(inputMap);
        LinkedHashMap<String,String> expectedString=new LinkedHashMap<String,String>();
        expectedString.put("val1","hijk ");
        expectedString.put("val2","abc");
        assertNotEquals(expectedString,actualString);
    }

    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(modifyValues.modifyValues(null));
    }
}