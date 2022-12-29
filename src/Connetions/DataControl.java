package Connetions;

import TablesDB.TablePropietario;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class DataControl {
    private final TablePropietario tableP;

    public DataControl() {
        tableP = new TablePropietario();
    }

    public void insert(String name, String lastName, String colony, String street, int number, int postalCode) {
        PreparedStatement ps;
        String sql;
        tableP.setNombre(name);
        tableP.setApellido(lastName);
        tableP.setColonia(colony);
        tableP.setCalle(street);
        tableP.setNum(number);
        tableP.setCod_postal(postalCode);

        try {
            sql = "insert into propietario (nombre, apellidos, colonia, calle, num, cod_postal) values (?,?,?,?,?,?)";
            ps = ConecctionDB.prepareStatement(sql);
            ps.setString(1, tableP.getNombre());
            ps.setString(2, tableP.getApellido());
            ps.setString(3, tableP.getColonia());
            ps.setString(4, tableP.getCalle());
            ps.setInt(5, tableP.getNum());
            ps.setInt(6, tableP.getCod_postal());
            ps.executeUpdate();
            System.out.println("Se añadio al propietario con exido");
            System.out.println();
        } catch (SQLException e) {
            System.out.println("Error: No se pudo añadir al propietario");
            System.out.println();
        }
    }

    public void query(ResultSet rs) throws SQLException {
        while(rs.next()){
            try {
                tableP.setId_propietario(rs.getInt("id_propietario"));
                tableP.setNombre(rs.getString("nombre"));
                tableP.setApellido(rs.getString("apellidos"));
                tableP.setColonia(rs.getString("colonia"));
                tableP.setCalle(rs.getString("calle"));
                tableP.setNum(rs.getInt("num"));
                tableP.setCod_postal(rs.getInt("cod_postal"));
                System.out.println("ID: " + tableP.getId_propietario());
                System.out.println("Nombre: " + tableP.getNombre());
                System.out.println("Apellido: " + tableP.getApellido());
                System.out.println("Colonia: " + tableP.getColonia());
                System.out.println("Calle: " + tableP.getCalle());
                System.out.println("Numero: " + tableP.getNum());
                System.out.println("Codigo Postal: " + tableP.getCod_postal());
                System.out.println();
            } catch (SQLException e) {
                System.out.println("Error: " + e);
            }
        }
    }
}

