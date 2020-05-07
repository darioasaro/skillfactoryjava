package org.example;

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

        System.out.println( "Hello World!" );
    }
}
