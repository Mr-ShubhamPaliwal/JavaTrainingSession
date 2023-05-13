package InterfacePackage.interfaceAssignment;

public class CallingClass {

    public static void main(String[] args) {

        DataBaseConnection oracleConnection = xyz();

        oracleConnection.connect("Connection Link google.com");
        String oracleResult = oracleConnection.fireQuery("jdjdhfjdh");
        System.out.println(oracleResult);
        oracleConnection.disconnect();
        System.out.println(oracleConnection.checkConnection());


    }

    private static DataBaseConnection xyz() {

        DataBaseConnection v1 = new OracleDatabaseConnection();

        return v1;
    }
}
