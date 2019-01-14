package com.stackroute.pe5;

import main.java.com.stackroute.pe5.ArrayListElementUpdate;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArrayListElementUpdateTest {
    ArrayListElementUpdate elementUpdate;
    @Before
    public void setUp()  {
        elementUpdate = new ArrayListElementUpdate();
    }

    @After
    public void tearDown() throws Exception {
        elementUpdate = null;
    }

    @Test
    public void testUpdateElementSuccess() {
        ArrayList<String> inputList = new ArrayList<>();
        inputList.add("apple");
        inputList.add("mango");
        inputList.add("potato");
        inputList.add("cucumber");
        ArrayList<String> searchString = new ArrayList<>();
        searchString.add("cucumber");
        searchString.add("apple");
        ArrayList<String> replaceString = new ArrayList<>();
        replaceString.add("abc");
        replaceString.add("xyz");
        ArrayList<String> actualString = elementUpdate.updateElement(inputList,searchString,replaceString);
        ArrayList<String> output = new ArrayList<>();
        output.add("xyz");
        output.add("mango");
        output.add("potato");
        output.add("abc");
        ArrayList<String> expectedString = output;
        assertEquals(expectedString,actualString);
    }

    @Test
    public void testUpdateElementFailure() {
        ArrayList<String> inputList = new ArrayList<>();
        inputList.add("apple");
        inputList.add("mango");
        inputList.add("potato");
        inputList.add("cucumber");
        ArrayList<String> searchString = new ArrayList<>();
        searchString.add("cucumber");
        searchString.add("apple");
        ArrayList<String> replaceString = new ArrayList<>();
        replaceString.add("abc");
        replaceString.add("xyz");
        ArrayList<String> actualString = elementUpdate.updateElement(inputList,searchString,replaceString);
        ArrayList<String> output = new ArrayList<>();
        output.add("xyz");
        output.add("mango");
        ArrayList<String> expectedString = output;
        assertNotEquals(expectedString,actualString);
    }

    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(elementUpdate.updateElement(null,null,null));
    }
}