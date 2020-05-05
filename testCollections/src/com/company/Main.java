package com.company;

import com.company.models.TestList;

public class Main {

    public static void main(String[] args) {

        TestList lista = new TestList();
        lista.addList("Dario");
        lista.addList("Martin");
        lista.addList("Lucho");
        lista.addList("Mauro");
        lista.addList("Jaz");
        lista.addList("Nico");
        //lista.printListByForEach();
        lista.printListByForEach2();
        lista.orderAsc();
        System.out.println("///");
        lista.printListByForEach2();
        lista.remove("Dario");
        lista.printListByForEach2();
        lista.remove("marcelo");
        System.out.println("////");

    }
}
