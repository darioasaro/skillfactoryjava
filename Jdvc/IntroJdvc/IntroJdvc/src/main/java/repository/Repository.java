package repository;
import com.sun.org.apache.bcel.internal.generic.ACONST_NULL;
import connection.ConectionDB;
import models.Product;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Repository {

    private Connection conection = new ConectionDB().getConection();

   public void setProduct(Product product) throws SQLException {

       String query = "INSERT INTO products (name,price,brand,unit,quantity,discount) VALUES(?,?,?,?,?,?)";
       PreparedStatement sentence = conection.prepareStatement(query);
       sentence.setString(1,product.getName());
       sentence.setDouble(2,product.getPrice());
       sentence.setString(3,product.getBrand());
       sentence.setInt(4,product.getUnit());
       sentence.setInt(5,product.getQuantity());
       sentence.setDouble(6,product.getDiscount());
       sentence.execute();


   }
   public ArrayList<Product> getProducts() throws SQLException {
       String query  = "SELECT * FROM products";
       Statement sentence = conection.createStatement();
       ResultSet rs = sentence.executeQuery(query);
       ArrayList<Product>products = new ArrayList<>();
       while(rs.next()){
          products.add(new Product.Builder().id(rs.getInt("id")).brand(rs.getString("brand")).discount(rs.getDouble("discount"))
                  .name(rs.getString("name")).quantity(rs.getInt("quantity")).price(rs.getDouble("price")).unit(rs.getInt("unit")).build());
       }
        return products;
   }

   public Product getProductById(int searchId)throws SQLException{
       String query  = "SELECT * FROM products WHERE id = ?";
       PreparedStatement sentence = conection.prepareStatement(query);
       sentence.setInt(1,searchId);
       ResultSet rs = sentence.executeQuery();
       Product result = new Product.Builder().build() ;
       if(rs.next()){
           result =new Product.Builder().id(rs.getInt("id")).brand(rs.getString("brand")).discount(rs.getDouble("discount"))
                   .name(rs.getString("name")).quantity(rs.getInt("quantity")).price(rs.getDouble("price")).unit(rs.getInt("unit")).build();
       }
       return result;
   }

   public void updateProduct(Product toUpdate){
       try {
           Product search = getProductById(toUpdate.getId());
           if(search.getId()>0){
               String query = "UPDATE products SET name  = ?,price = ? ,brand = ?,unit = ? ,quantity = ?,discount = ? WHERE id = ?";
               PreparedStatement sentence = conection.prepareStatement(query);
               sentence.setString(1,toUpdate.getName());
               sentence.setDouble(2,toUpdate.getPrice());
               sentence.setString(3,toUpdate.getBrand());
               sentence.setInt(4,toUpdate.getUnit());
               sentence.setInt(5,toUpdate.getQuantity());
               sentence.setDouble(6,toUpdate.getDiscount());
               sentence.setInt(7,toUpdate.getId());
               sentence.execute();
           }
           else{
               System.out.println("The product isn't exist");
           }
       } catch (SQLException throwables) {
           throwables.printStackTrace();
       }



   }

   public void deleteById(int idToDelete) throws SQLException {
       String query  = "DELETE FROM products WHERE id = ? ";
       PreparedStatement sentence = conection.prepareStatement(query);
       sentence.setInt(1,idToDelete);
       sentence.execute();
   }

}
