package org.example.utils;

import java.util.HashMap;
import java.util.Map;

public class Utils {
    public static boolean isPalindrome(String word){
        StringBuilder reverse = new StringBuilder(word.replace(" ","")).reverse();
        return (reverse.toString()).equalsIgnoreCase(word.replace(" ",""));
    }
    public static Integer romanToInteger(String romanNumber){

        Map<String,Integer> romanTable = new HashMap<String, Integer>();
        {
            romanTable.put("I",1);
            romanTable.put("V",5);
            romanTable.put("X",10);
            romanTable.put("L",50);
            romanTable.put("C",100);
            romanTable.put("D",500);
            romanTable.put("L",50);
            romanTable.put("M",1000);
        }

        int quantity = romanNumber.length();
        
    }
}

