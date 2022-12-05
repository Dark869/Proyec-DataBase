package Connetions;

import Interfaces.InterfaceMain;
import Interfaces.MainMenu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConecctionDB {
    static InterfaceMain iM = new InterfaceMain();

    static Connection cn;
    static String db = "alquileres_xalapa";
    static String url = "jdbc:mysql://localhost:3306/" + db;

    public static Connection connect(String user, String pass) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection successful with user: " + user);
            iM.ConnectionSuccessful();
            MainMenu mm = new MainMenu(null);
            mm.setVisible(true);
        } catch (ClassNotFoundException e) {
            System.out.println("Error: " + e);
        } catch (SQLException e) {
            System.out.println("Error: Doesn't connect to the database");
            iM.DontConection();
        }
        return cn;
    }
}

