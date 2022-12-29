import Connetions.ConecctionDB;
import Connetions.DataControl;
import Connetions.DisconnectionDB;

import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {

        String user, password, name, lastName, colony, street;
        int option = 0, num, postalCode;
        Scanner sn = new Scanner(System.in);
        DataControl dc = new DataControl();

        System.out.println(" ");
        System.out.println("----- DB - Alquileres Xalapa -----");
        System.out.println("----- Bienvenido al sistema -----");
        System.out.println(" ");
        System.out.print("Ingrese su usuario: ");
        user = sn.nextLine();
        System.out.print("Ingrese su contraseña: ");
        password = sn.nextLine();
        System.out.println();

        ConecctionDB.connect(user, password);

        System.out.println("Seleccione una opción:");
        System.out.println("1. Ingresar nuevo propietario");
        System.out.println("2. Mostrar tabla de propietarios");
        System.out.println("3. Salir");
        option = sn.nextInt();
        System.out.println();

        if(option == 1){
            System.out.println("Ingresar nombre del propietario");
            name = sn.nextLine();
            name = sn.nextLine();
            System.out.println("Ingresar apellido del propietario");
            lastName = sn.nextLine();
            System.out.println("Ingresar colonia del propietario");
            colony = sn.nextLine();
            System.out.println("Ingresar calle del propietario");
            street = sn.nextLine();
            System.out.println("Ingresar número de domicilio del propietario");
            num = sn.nextInt();
            System.out.println("Ingresar código postal del propietario");
            postalCode = sn.nextInt();

            dc.insert(name, lastName, colony, street, num, postalCode);

        } else if(option == 2){
            ConecctionDB.createStatement();
        } else if(option == 3){
            System.exit(0);
        } else {
            System.out.println("Opción no válida");
            DisconnectionDB.disconnect();
        }
        DisconnectionDB.disconnect();
    }
}
