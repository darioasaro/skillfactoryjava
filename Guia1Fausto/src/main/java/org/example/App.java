package org.example;

import org.example.utils.Utils;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {   //***Test Last to first String ***
        //System.out.println(Utils.lastToFirst(" hola soy la cadena que, hay que dividir "));

        //*** Test isPalindrome String***
        // System.out.println(Utils.isPalindrome("MenEm"));
        // System.out.println(Utils.isPalindrome("Dario"));

        //*** Test countCharacters ***
        //String result = Utils.countCharacters("Soy Independiente, aunque no gano la libertadores desde 1985, sigo siendo el máximo campeón con 7 copas");
        //System.out.println(result);

       //*** Test cesarEncryption ***
        //System.out.println(Utils.cesarEncryption("AbCcZ123"));
        //System.out.println(Utils.cesarEncryption("AbCcZ"));

        //***Test checkString***
        boolean isCorrect = Utils.checkString("A1ass_Adr3eggfd");
        System.out.println(isCorrect);
    }
}
