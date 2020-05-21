package org.example;

import connection.ConectionDB;
import models.Product;
import repository.Repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Repository repository = new Repository();
       /* Product producto = new Product.Builder().brand("Adidas").discount(0.0)
                           .name("Predator").quantity(10).price(7.500).unit(2).build();

      //Set product
        try {
            repository.setProduct(producto);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }*/

      // Get all products

        //Get product by Id

        /*try {
            Product find = repository.getProductById(1);
            System.out.println(find);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }*/

        //repository.updateProduct(producto);
        try {
            repository.deleteById(1);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        
        try {
            ArrayList<Product>products = repository.getProducts();
            System.out.println("producst: " + products);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
