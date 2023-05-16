package InterfacePackage.interfaceAssignment;

public class OracleDatabaseConnection implements DataBaseConnection {

    String connectionDetails;
    Boolean isConnectionAlive;


    @Override
    public void connect(String connectionDetails) {

        this.connectionDetails = connectionDetails;
        System.out.println("Connection Established");
        isConnectionAlive = true;
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting Connection");
        isConnectionAlive = false;
    }

    @Override
    public String fireQuery(String query) {

        if (isConnectionAlive) {
            return "Query result - Table created";
        } else {
            return "You are not connected to data base, please establish connection first ";
        }
    }

    @Override
    public void checkConnectionStatus() {

        if (isConnectionAlive) {
            System.out.println("Connection to oracle is Alive");
        } else {
            System.out.println("Connection to oracle is not Alive");
        }

    }
}
