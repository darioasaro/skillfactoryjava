package org.example.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static ArrayList<String> removeEvenLength(ArrayList<String> list) {
        return list.stream()
                .filter(word -> word.length() % 2 != 0)
                .collect(Collectors.toCollection(() -> new ArrayList<>()));
    }

    public static void countCharacters(String phrase) {

        long cantLetter = phrase.chars().filter(w -> Character.isLetter(w)).count();
        long cantSpace = phrase.chars().filter(w -> Character.isSpaceChar(w)).count();
        long cantNum = phrase.chars().filter(w -> Character.isDigit(w)).count();
        System.out.println("El String -> ** " + phrase + " ** tiene, " + " Digitos: " + cantNum + " Letras: " + cantLetter + " Espacios: " + cantSpace);
    }


    public static String cesarEncrypt(String toEncrypt) {
        String[]splited = toEncrypt.split("");
            return  Arrays.stream(splited)
                            .map(item ->nextChar(item.charAt(0)))
                            .collect(Collectors.joining());
    }
    public static String reversePhrase(String phrase){
        return Stream.of(phrase.split(" ")).reduce("", (reversed, character) -> character + " "+ reversed);
    }


    public static String nextChar(char letter){
        int ascii = (int)letter + 1;
        if(ascii == 91){
            ascii = 65;
        }
        if(ascii == 123){
            ascii = 97;
        }
        return Character.toString((char)ascii);
    }



    




    public static void main(String[] args) throws InterruptedException {
       /* List<String> testStringList = new ArrayList<>(Arrays.asList("hola","me","van","a","sacar","las","palabras","pares"));
        System.out.println(testStringList);
        Thread.sleep(1500);
        System.out.println("sacando...");
        Thread.sleep(2000);
        ArrayList<String>filtered = removeEvenLength((ArrayList<String>) testStringList);
        System.out.println(filtered);
        countCharacters("hola 12 12 que tal 1234");
        //test Cesar Encrypt
        System.out.println(cesarEncrypt("abzD"));*/
        System.out.println(reversePhrase("hola que tal"));
    }

}
