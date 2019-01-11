package main.java.com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCountMap {
    public Map<String,Integer> numberOfCounts(String str){
        Map<String,Integer> map = new HashMap<>();
        String[] nums = {"one","two","three"};
        for(int i=0;i<nums.length;i++) {
            Matcher matcher = Pattern.compile(nums[i]).matcher(str);
            int counter = 0;
            while (matcher.find()) {
                counter++;
            }
            map.put(nums[i],counter);
        }
        return map;
    }
}
