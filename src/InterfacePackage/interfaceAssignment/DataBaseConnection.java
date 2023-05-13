package InterfacePackage.interfaceAssignment;

public interface DataBaseConnection {

    public void connect(String connectionDetails);
    public void disconnect();
    public String fireQuery(String query);
    public String  checkConnection();
}
