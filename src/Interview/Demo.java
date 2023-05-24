package Interview;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("PLease enter the string ");
//        String s = sc.next();
//
//        String reversedString = new StringBuilder(s).reverse().toString();
//        System.out.println("Reversed string is - "+ reversedString);

        int rows = 5;
        printStarPattern(rows);


    }


    public static void printStarPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
