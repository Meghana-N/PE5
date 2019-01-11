/*Exercise-1 Write a Java program to update specific array element by given element and empty the array list .
        Input: [Apple, Grape, Melon, Berry]
        Output: [Kiwi, Grape, Mango, Berry]*/
package main.java.com.stackroute.pe5;

import java.util.ArrayList;

public class ArrayListElementUpdate {
    public ArrayList<String>  updateElement(ArrayList<String> inputArray,ArrayList<String> searchString,ArrayList<String> strToReplace)
    {
        int ind=0;
        for(int i=0;i<searchString.size();i++)
        {
            if(inputArray.contains(searchString.get(ind)))
            {
                int index = inputArray.indexOf(searchString.get(ind));
                inputArray.set(index,strToReplace.get(ind));
                ind++;
            }
        }
        return inputArray;
    }
}
