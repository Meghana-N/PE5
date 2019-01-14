/*Exercise - 5 : Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2.
Modify and return the given map as follows:
a. If the key `val1` has a value, set the key `val2` to have that value, and
b. Set the key `val1` to have the value `" "` (empty string ).*/

package main.java.com.stackroute.pe5;

import java.util.LinkedHashMap;

public class ModifyMapValues {
    //Method to modify the map values as needed
    public LinkedHashMap<String, String> modifyValues(LinkedHashMap<String, String> inputMap)
    {
        String key1 = inputMap.get(inputMap.values().toArray()[0]); //retrieves the first Map key
        String value1 = inputMap.get(inputMap.keySet().toArray()[0]); //retrieves the first Map value
        if(value1 != null)
        {
            inputMap.put("val1"," "); // Assigning the Map key value pairs
            inputMap.put("val2",value1);
        }
        return inputMap;
    }
}
