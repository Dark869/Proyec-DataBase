package Connetions;

import java.sql.*;

public class ConecctionDB {

    static Connection cn;
    static String db = "alquileres_xalapa";
    static String url = "jdbc:mysql://localhost:3306/" + db;

    public static Connection connect(String user, String pass) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión exitosa con el usuario: " + user);
            System.out.println();
        } catch (ClassNotFoundException e) {
            System.out.println("Error: " + e);
        } catch (SQLException e) {
            System.out.println("Error: No se pudo conectar con la base de datos");
            System.out.println("Revise su usuario y contraseña");
            System.exit(0);
        }
        return cn;
    }

    public static PreparedStatement prepareStatement(String sql) {
        PreparedStatement ps = null;
        try {
            ps = cn.prepareStatement(sql);
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return ps;
    }

    public static void createStatement() {
        PreparedStatement ps = null;
        try {
            ps = cn.prepareStatement("select * from propietario");
            ResultSet rs = ps.executeQuery();
            DataControl dataControl = new DataControl();
            dataControl.query(rs);
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }
}
