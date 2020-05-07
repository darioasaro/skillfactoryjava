package ejercicio4;
import java.util.*;

/*Escribir un método que reciba n cantidad de Integer (no un número fijo) y una List, los ordene dentro de un ArrayList e imprimir
        por pantalla.
        Luego convertir este Arraylist en LinkedList y repetir el proceso.*/

public class Main {
    public static void main(String[] args) {
        //***Uncomment to test!***
        /*List <Integer> listNumbers = new ArrayList<>();
        integerToSortArray(listNumbers,22,31,4,5,6,45,12,32,15,0,8,54);
        System.out.println("/////////////////////////////////////");
        integerToSortLinked(listNumbers,22,31,4,5,6,45,12,32,15,0,8,54);*/
    }

    public static void integerToSortArray(List<Integer> container, Integer... numbers){

        container  =new ArrayList<>( Arrays.asList(numbers));
        System.out.println("Numbers before sort");
        System.out.println(container);
        Collections.sort(container);
        System.out.println("Numbers in ASC order in " + container.getClass());
        System.out.println(container);

    }
    public static void integerToSortLinked(List<Integer> container, Integer... numbers){
        container = Arrays.asList(numbers);
        container  = new LinkedList<Integer>(Arrays.asList(numbers));
        System.out.println("Numbers before sort");
        System.out.println(container);
        Collections.sort(container);
        System.out.println("Numbers in ASC order in " + container.getClass());
        System.out.println(container);

    }
}
