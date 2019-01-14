/*Exercise-1 Write a Java program to update specific array element by given element and empty the array list .
  Input: [Apple, Grape, Melon, Berry]
  Output: [Kiwi, Grape, Mango, Berry]*/
package main.java.com.stackroute.pe5;

import java.util.ArrayList;

public class ArrayListElementUpdate {
    public ArrayList<String>  updateElement(ArrayList<String> inputArray,ArrayList<String> searchString,ArrayList<String> strToReplace)
    {
        int index=0;
        //loop to find the search string in an input string
        for(int i=0;i<searchString.size();i++)
        {
            if(inputArray.contains(searchString.get(index)))
            {
                int index1 = inputArray.indexOf(searchString.get(index));
                inputArray.set(index1,strToReplace.get(index)); // To replace the search string with needed string
                index++;
            }
        }
        return inputArray;
    }
}
