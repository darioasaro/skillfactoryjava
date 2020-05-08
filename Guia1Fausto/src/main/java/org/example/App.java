package org.example;

import org.example.utils.Utils;

/**
 * Hello world!
 *
 */
public class App
{
    public static boolean isPalindrome(String word){
        StringBuilder reverse = new StringBuilder(word.replace(" ","")).reverse();
        return (reverse.toString()).equalsIgnoreCase(word.replace(" ",""));
    }
    public static void main( String[] args )
    {

        Utils.lastToFirst("hola soy la cadena que, hay que  dividir ");
    }
}
