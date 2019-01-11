import main.java.ModifyMapValues;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ModifyMapValuesTest {
    ModifyMapValues obj;
    @Before
    public void setUp()  {
        obj = new ModifyMapValues();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void testModifyMapValesSuccess() {
        LinkedHashMap<String,String> inpMap=new LinkedHashMap<String,String>();
        inpMap.put("val1","abc");
        inpMap.put("val2","xyz");
        Map<String, String> actualStr = obj.modifyValues(inpMap);
        LinkedHashMap<String,String> expectedStr=new LinkedHashMap<String,String>();
        expectedStr.put("val1"," ");
        expectedStr.put("val2","abc");
        assertEquals(expectedStr,actualStr);
    }

    @Test
    public void testModifyMapValesFailure() {
        LinkedHashMap<String,String> inpMap=new LinkedHashMap<String,String>();
        inpMap.put("val1","abc");
        inpMap.put("val2","xyz");
        Map<String, String> actualStr = obj.modifyValues(inpMap);
        LinkedHashMap<String,String> expectedStr=new LinkedHashMap<String,String>();
        expectedStr.put("val1","hijk ");
        expectedStr.put("val2","abc");
        assertNotEquals(expectedStr,actualStr);
    }
}