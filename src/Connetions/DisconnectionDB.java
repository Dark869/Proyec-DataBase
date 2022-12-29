package Connetions;

import java.sql.SQLException;

import static Connetions.ConecctionDB.cn;

public class DisconnectionDB {
    public static void disconnect() {
        try {
            cn.close();
            System.out.println("Cerrando la conexión");
        } catch (SQLException e) {
            System.out.println("Error: Doesn't close the connection");
        }
    }
}

