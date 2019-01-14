/*Exercise-6 Write a program to implement set interface which sorts the given randomly ordered names in
ascending order. Convert the sorted set in to an array list*/

package main.java.com.stackroute.pe5;

import java.util.*;

public class WordSortSet {
    //method to sort the words
    public ArrayList<String> sortWords(String inputString)
    {
        TreeSet<String> words = new TreeSet<>(Arrays.asList(inputString.split(" "))); //TreeSet to sort the words
        ArrayList<String> outputList = new ArrayList<>(words); // converting TreeSet to ArrayList
        return outputList;
    }
}
