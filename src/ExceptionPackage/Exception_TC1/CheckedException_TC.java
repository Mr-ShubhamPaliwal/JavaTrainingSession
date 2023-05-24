package ExceptionPackage.Exception_TC1;

import java.io.File;
import java.io.IOException;

public class CheckedException_TC {

    public static void main(String[] args) {

        CheckedException_TC c1 = new CheckedException_TC();

        try {
            c1.readSomeFile();
        } catch (Exception e) {
            System.out.println("Exception Handled "+ e.getMessage());
        }


    }

    private File readSomeFile() throws IOException{

        return new File("test");
    }
}
