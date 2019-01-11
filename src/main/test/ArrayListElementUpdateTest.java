import main.java.ArrayListElementUpdate;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArrayListElementUpdateTest {
    ArrayListElementUpdate obj;
    @Before
    public void setUp()  {
        obj = new ArrayListElementUpdate();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void testupdateElementSuccess() {
        ArrayList<String> inp = new ArrayList<>();
        inp.add("apple");
        inp.add("mango");
        inp.add("potato");
        inp.add("cucumber");
        ArrayList<String> searchStr = new ArrayList<>();
        searchStr.add("cucumber");
        searchStr.add("apple");
        ArrayList<String> replaceStr = new ArrayList<>();
        replaceStr.add("abc");
        replaceStr.add("xyz");
        ArrayList<String> actualStr = obj.updateElement(inp,searchStr,replaceStr);
        ArrayList<String> output = new ArrayList<>();
        output.add("xyz");
        output.add("mango");
        output.add("potato");
        output.add("abc");
        ArrayList<String> expectedStr = output;
        assertEquals(expectedStr,actualStr);
    }

    @Test
    public void testupdateElementFailure() {
        ArrayList<String> inp = new ArrayList<>();
        inp.add("apple");
        inp.add("mango");
        inp.add("potato");
        inp.add("cucumber");
        ArrayList<String> searchStr = new ArrayList<>();
        searchStr.add("cucumber");
        searchStr.add("apple");
        ArrayList<String> replaceStr = new ArrayList<>();
        replaceStr.add("abc");
        replaceStr.add("xyz");
        ArrayList<String> actualStr = obj.updateElement(inp,searchStr,replaceStr);
        ArrayList<String> output = new ArrayList<>();
        output.add("xyz");
        output.add("mango");
        ArrayList<String> expectedStr = output;
        assertNotEquals(expectedStr,actualStr);
    }

}