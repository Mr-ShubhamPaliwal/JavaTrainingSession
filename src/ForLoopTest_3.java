import java.net.SocketTimeoutException;
import java.sql.SQLOutput;

public class ForLoopTest_3 {

    public static void main(String[] args) {


//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }
//
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Hello World");
//        }

        int sum = 0;
        for (int x = 1; x <= 20; x++) {
            sum = sum + x;
        }
        System.out.println("Sum: " + sum); // ???????????

//        String array[] = { "Ron", "Harry", "Hermoine" };
//        for (String x : array) {
//            System.out.println(x);
//        }
//
//        // for loop for same function
//        for (int i = 0; i < array.length; i++)
//        {
//            System.out.println(array[i]);
//        }

        // Infinite loop
        for (int i = 1; i >= 1; i++) {
            System.out.println("Stop me " + i);
            break;
        }

        // Infinite loop
        for (;;) {
                System.out.println("loop");
                return;
            }




















    }
}

