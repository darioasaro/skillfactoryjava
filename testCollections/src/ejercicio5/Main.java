package ejercicio5;

/*
 Llenar un ArrayList con objetos Car (String model, Integer prize), cargar algunos varias veces, luego eliminar los
         repetidos.
*/

import ejercicio5.models.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //***Cars***
      /*  Car fiatUno = new Car("uno",45000);
        Car fiatUnoRepeat = new Car("uno",45000);
        Car fordFiesta = new Car("Fiesta",350000);
        Car chevroletCruze = new Car("Cruze",450000);
        Car chevroletCruzeRepeat = new Car("Cruze",450000);
        Car toyotaCorolla = new Car("Corolla",500000);
        Car chevroletChevy = new Car("Chevy",250000);
                                                                    //
      List<Car> cars = new ArrayList<Car>(Arrays.asList
                               (fiatUno,fiatUnoRepeat,
                                fordFiesta,chevroletCruze,
                                chevroletCruzeRepeat,
                                chevroletChevy,toyotaCorolla));

        System.out.println(cars);

        List<Car> dedupped = removeDuplicated((ArrayList)cars);
        System.out.println(dedupped);*/

    }
    public static List<Car> removeDuplicated(ArrayList<Car>carList){
        //Deleted by convert to linkedHashSet
        //List<Car> withoutDuplicated = new ArrayList<Car>(new LinkedHashSet<Car>(carList));

        //Deleted by use Stream-distinct.
        List<Car> withoutDuplicated = carList.stream().distinct().collect(Collectors.toList());
        return withoutDuplicated;
    }
}
