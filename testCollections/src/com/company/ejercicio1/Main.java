package com.company.ejercicio1;

import com.company.ejercicio1.models.Alumn;
import com.company.ejercicio1.models.TestSet;

public class Main {

    public static void main(String[] args) {

    /*
        //Test List//

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
        System.out.println("////");*/

        //Test Map//

      /*  TestMap mapper = new TestMap();
        mapper.addToMap("Dario","darioasaro29@gmail.com");
        mapper.addToMap("Luciana","ludimeglio27@gmail.com");
        mapper.addToMap("Testing","testingmdq@gmail.com");
        mapper.printMap();
        mapper.removeToMapWithLambda("Dario");
        System.out.println(  mapper.getValue("Dario"));
        mapper.printMapWithStreams();*/

        // Test Set//

        TestSet set = new TestSet();
        set.addAlumn(new Alumn("Dario",34));
        set.addAlumn(new Alumn("Luciana",28));
        set.addAlumn(new Alumn("Juan Cruz",19));
        set.addAlumn(new Alumn("Gian",16));
        set.addAlumn(new Alumn("Humberto",81));
        set.addAlumn(new Alumn("Humberto",81));
        set.printHashSet();
        System.out.println("Removiendo a Dario...");
        boolean result = set.removeAlumn("Marcos");
        if(result) {
            System.out.println("Set sin Dario");
        }
        else{
            System.out.println("No borraste a Dario");
        }
        set.printHashSet();



    }
}
