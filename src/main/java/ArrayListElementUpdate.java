package main.java;

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
