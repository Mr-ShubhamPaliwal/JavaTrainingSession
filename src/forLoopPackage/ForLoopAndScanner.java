package forLoopPackage;

import java.util.Scanner ;

public class ForLoopAndScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a no.");
        int i = scanner.nextInt();

        for(int j=1; j<=10; j++){


            System.out.println("Table of "+i+" "+ i*j);
        }



    }


}
