package main.java.com.stackroute.pe5;

import java.util.*;

public class WordSortSet {
    public ArrayList<String> sortWords(String inputStr)
    {
        TreeSet<String> words = new TreeSet<>(Arrays.asList(inputStr.split(" ")));
        ArrayList<String> outputList = new ArrayList<>(words);
        return outputList;
    }
}