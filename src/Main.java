import Connetions.ConecctionDB;

public class Main {
    public static void main(String[] args) {
        ConecctionDB cdb = new ConecctionDB();
        cdb.connect();

        cdb.disconnect();
    }
}