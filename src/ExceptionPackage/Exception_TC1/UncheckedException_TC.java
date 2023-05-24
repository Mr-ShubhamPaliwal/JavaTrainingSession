package ExceptionPackage.Exception_TC1;

public class UncheckedException_TC {

    public static void main(String[] args) {

        try {
            int i = 1/0;
            System.out.println(i);
        }catch (Exception e){

            System.out.println("Exception handled"+ e.getMessage());
        }

        System.out.println("last line of the code/ Next line after try catch block");
    }
}
