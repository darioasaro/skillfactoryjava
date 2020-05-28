package org.example.utils;

import java.util.*;

public class Utils {
    public static boolean isPalindrome(String word){
        StringBuilder reverse = new StringBuilder(word.replace(" ","")).reverse();
        return (reverse.toString()).equalsIgnoreCase(word.replace(" ",""));
    }
    //***Refactor with StringBuilder and Collections.reverse ***
    public static String lastToFirst(String word){
        List<String> arrayWord = Arrays.asList(word.split(" "));
        Collections.reverse(arrayWord);
        StringBuilder result= new StringBuilder();
        for(String wordN : arrayWord){
            result.append(" "+wordN);
        }
        return result.toString();
    }
    public static String countCharacters(String phrase){
        int spaceQuantity = 0;
        int charQuantity = 0;
        int numberQuantity = 0;

        for(int i = 0;i<phrase.length();i++){
            if(Character.isLetter(phrase.charAt(i))){
                charQuantity++;
            }
            if(Character.isDigit(phrase.charAt(i))){
                numberQuantity++;
            }
            if(Character.isSpaceChar(phrase.charAt(i))){
                spaceQuantity ++;
            }

        }
        return "Digitos: " + numberQuantity + " Letras: " + charQuantity + " Espacios: " + spaceQuantity ;
    }

    public static String cesarEncryption(String toEncrypt){
        int length = toEncrypt.length();
        String encrypted = "Incorrect Characters in String";
        if(toEncrypt.matches("[a-zA-Z]+")){
            encrypted = "";
            for (int i = 0;i<length;i++){
                int ascii = (int)toEncrypt.charAt(i) + 1;
                if(ascii == 91){
                    ascii = 65;
                }
                if(ascii == 123){
                    ascii = 97;
                }
                encrypted = encrypted + (char)ascii;
            }
        }
        return encrypted;
    }

    //need to fix it, allow underscore on first character.//
    public static boolean checkString ( String check){
       return check.matches(" (^[a-zA-z0-9])((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[?\\_\\w]{8,30})");
    }
    /*
                    ***In Progress***
                    * try to find an algorithm to get correct convertion.

      public static Integer romanToInteger(String romanNumber){

        Map<String,Integer> romanTable = new HashMap<String, Integer>();
        {
            romanTable.put("I",1);1985

            romanTable.put("V",5);
            romanTable.put("X",10);
            romanTable.put("L",50);
            romanTable.put("C",100);
            romanTable.put("D",500);
            romanTable.put("L",50);
            romanTable.put("M",1000);
        }

        int quantity = romanNumber.length();
        
    }*/
}

