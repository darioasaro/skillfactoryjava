package org.example;

import org.example.models.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        List<Product> products = generateRandomProducts();
        /* Crear un algoritmo que:
        *   Quite los Productos repetidos,
        *   Tome los productos cuyo precio sea mayor que 5000
        *   Ignore los primeros 5 Productos
        *   Tome solo los 10 primeros Productos
        *   Imprima por pantalla el resultado
        * */
    }

    private static List<Product> generateRandomProducts(){
        List<Product> products = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            products.add(generateRandomProduct());
        }
        return products;
    }

    private static Product generateRandomProduct(){
        Double price = 1000D + Math.random() * (100000D - 1000D);
        price = Math.floor(price * 100) / 100;
        Long id = 1L + (long) (Math.random() * (10L - 1L));

        return new Product(id, price);
    }
}
