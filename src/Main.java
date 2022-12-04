import Connetions.ConecctionDB;
import Connetions.DisconnectionDB;
import Interfaces.InterfaceMain;

public class Main extends DisconnectionDB {
    public static void main(String[] args) {
        InterfaceMain iM = new InterfaceMain(null);
        ConecctionDB cdb = new ConecctionDB();
        DisconnectionDB ddb = new DisconnectionDB();

        cdb.connect();

        ddb.disconnect();
    }
}