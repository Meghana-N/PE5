/*Write a program where an array of strings is input and output is a Map< String ,boolean> where
each different string is a key and its value is true if that string appears 2 or more times in the array
Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
Output - {“a” : true,”b” :false ,”c” :true,”d” : false}*/

package main.java.com.stackroute.pe5;

import java.util.*;

public class WordOccurenceCheck {
    //method to check the word or character occurence
    public Map<String, Boolean> wordOccurenceCheck(String inputString){
            Map<String, Integer> occurrences = new HashMap<String, Integer>();
            Map<String, Boolean> wordOccurence = new HashMap<String, Boolean>();
            List<String> inputList = Arrays.asList(inputString.split(" "));
            for ( String word : inputList ) {
                Integer oldCount = occurrences.get(word);
                if (oldCount == null) {
                    oldCount = 0;
                }
                occurrences.put(word, oldCount + 1);
                if((oldCount + 1) == 1)
                {
                    wordOccurence.put(word, false); //insert false if the word occurs only once
                }
                else
                {
                    wordOccurence.put(word, true); //insert true if the word occurs multiple times
                }
            }
            return wordOccurence;
    }
}

