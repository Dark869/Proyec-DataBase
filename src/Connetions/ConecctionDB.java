package Connetions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConecctionDB {
    static Connection cn;
    static String db = "venta";
    static String url = "jdbc:mysql://localhost:3306/" + db;
    static String user = "root";
    static String pass = "Nevulosa12.";

    public static Connection connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection successful");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: " + e);
        } catch (SQLException e) {
            System.out.println("Error: Doesn't connect to the database");
        }
        return cn;
    }

    public void disconnect() {
        try {
            cn.close();
            System.out.println("Connection closed");
        } catch (SQLException e) {
            System.out.println("Error: Doesn't close the connection");
        }

    }
}
