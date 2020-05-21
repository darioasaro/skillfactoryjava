package connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConectionDB {
    final String url = "jdbc:mysql://localhost:3306/";
    final String dbName = "jdbc_test";
    final String driver = "com.mysql.cj.jdbc.Driver";
    final String userName = "dario";
    final String password = "1234";
    public Connection conection = null;

    public  Connection getConection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conection = DriverManager.getConnection(url + dbName, userName, password);
            System.out.println("Connected");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return this.conection;

    }
}
