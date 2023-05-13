package InterfacePackage.interfaceAssignment;

public class OracleDatabaseConnection implements DataBaseConnection{

    Boolean isConnectionAlive;


    @Override
    public void connect(String connectionDetails) {
        isConnectionAlive=true;
    }

    @Override
    public void disconnect() {
        isConnectionAlive=false;
    }

    @Override
    public String fireQuery(String query) {
        return query;
    }

    @Override
    public String checkConnection() {


        if(isConnectionAlive){
            return "Connection to Oracle is active";
        }else{
            return "Connection to Oracle is not active";
        }

    }
}
