package ejercicio3;

import java.util.ArrayList;
import java.util.List;

//Escribir un método removeEvenLength() que reciba un ArrayList de String y elimine todos los String de longitud par.

public class Main {
    public static void main(String[] args) {

        //***Uncomment to test!***

        /*List<String> words = new ArrayList<String>(List.of("Hay","que","eliminar","las","palabras","pares"));
        System.out.println("Lista completa");
        System.out.println(words);
        System.out.println("Removiendo las palabras con cantidad par de caracteres");
        removeEvenLength((ArrayList)words);
        System.out.println(words);*/

    }

    public static void removeEvenLength(ArrayList<String> words){
       words.removeIf(word -> word.length() % 2 == 0);
    }
}
