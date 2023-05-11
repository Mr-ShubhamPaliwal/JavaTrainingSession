package forLoopPackage;

public class ForLoopTest_2 {

    public static void main(String[] args) {

        // Nested for loop for printing table
        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {

                System.out.print(i * j + " ");
            }
            System.out.println("");
        }

        // Nested for loop

        for (int i = 0; i < 3; i++) {
            System.out.println("Outer loop" + i);

            for (int j = 0; j < 4; j++) {
                System.out.println("Inner loop" + j);
            }
        }

        // iterate iterate
        int b = 3;

        for (int a = 1; b != 1; System.out.println("iterate"))
        {
            b = b - a;
        }

    }
}