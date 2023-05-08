package ObjectOrientedTC_1;

import java.util.Scanner;

public class Adder {

    private int hindi = 0;
    private int english =0;

    private int sanskrit=0;
    private Scanner scanner = new Scanner(System.in);

    String name = "Shubham's";

    public  int marksOfHindiAndSanskrit()
    {
        System.out.println("Enter " + name +" marks of Hindi");
        hindi = scanner.nextInt();

        System.out.println("Enter " + name +" marks of Sanskrit");
        sanskrit = scanner.nextInt();

        return hindi;

    }

    public void marksOfEnglish()
    {
        System.out.println("Enter " + name +" marks of English");
        english = scanner.nextInt();
    }

    public void addtionOfHindiEnglish()
    {
        int sum = english+hindi+sanskrit;
        System.out.println("Total of Hindi & English is :"+ sum);
    }






}
