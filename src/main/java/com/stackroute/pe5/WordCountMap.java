/*Exercise-2 Write a program to find the number of counts in the following String . Store the output in
Map< String ,Integer> as key value pair.
Input : String str = “one one -one___two,,three,one @three*one?two”;
Output : {"one":5 , "two":2, "three" :2}*/

package main.java.com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCountMap {
    //Method to find the word frequency in a string
    public Map<String,Integer> numberOfCounts(String inputString){
        Map<String,Integer> map = new HashMap<>();
        String[] searchString = {"one","two","three"};
        for(int i=0;i<searchString.length;i++) {
            Matcher matcher = Pattern.compile(searchString[i]).matcher(inputString);
            int counter = 0;
            while (matcher.find()) {
                counter++; //word count
            }
            map.put(searchString[i],counter); //to add count to the map
        }
        return map;
    }
}
