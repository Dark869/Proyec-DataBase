package Connetions;

import java.sql.SQLException;

import static Connetions.ConecctionDB.cn;

public class DisconnectionDB {
    public void disconnect() {
        try {
            cn.close();
            System.out.println("Connection closed");
        } catch (SQLException e) {
            System.out.println("Error: Doesn't close the connection");
        }

    }
}

