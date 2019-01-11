package main.java;

import java.util.LinkedHashMap;
import java.util.Map;

public class ModifyMapValues {
    public LinkedHashMap<String, String> modifyValues(LinkedHashMap<String, String> inputMap)
    {

        String key1 = inputMap.get(inputMap.values().toArray()[0]);
        String value1 = inputMap.get(inputMap.keySet().toArray()[0]);

        if(value1 != null)
        {
            inputMap.put("val1"," ");
            inputMap.put("val2",value1);
        }

        return inputMap;
    }
}
