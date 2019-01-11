package main.java.com.stackroute.pe5;

import java.util.*;

public class WordOccurenceCheck {
    public Map<String, Boolean> wordOccurence(String inputString){
            Map<String, Integer> occurrences = new HashMap<String, Integer>();
            Map<String, Boolean> wordOccurence = new HashMap<String, Boolean>();

            List<String> inputList = Arrays.asList(inputString.split(" "));


            for ( String word : inputList ) {
                Integer oldCount = occurrences.get(word);
                if ( oldCount == null ) {
                    oldCount = 0;
                }
                occurrences.put(word, oldCount + 1);
                if((oldCount + 1) == 1)
                {
                    wordOccurence.put(word, false);
                }
                else
                {
                    wordOccurence.put(word, true);
                }
            }
            return wordOccurence;
    }
}

