package InterfacePackage.interfaceAssignment;

public class CallingClass {

    public static void main(String[] args) {

        DataBaseConnection oracleConnection = xyz();

        oracleConnection.connect("Connection Link google.com");
        oracleConnection.checkConnectionStatus();
        String queryResult = oracleConnection.fireQuery("SQL Query");
        System.out.println(queryResult);
        oracleConnection.disconnect();
        oracleConnection.checkConnectionStatus();
        queryResult = oracleConnection.fireQuery("SQL Query to create a Table");
        System.out.println(queryResult);


    }

    private static DataBaseConnection xyz() {

        DataBaseConnection v1 = new OracleDatabaseConnection();

        return v1;
    }
}
