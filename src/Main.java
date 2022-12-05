import Connetions.DisconnectionDB;
import Interfaces.InterfaceMain;

public class Main extends DisconnectionDB {
    public static void main(String[] args) {
        InterfaceMain iM = new InterfaceMain(null);
        DisconnectionDB ddb = new DisconnectionDB();
        ddb.disconnect();
    }
}