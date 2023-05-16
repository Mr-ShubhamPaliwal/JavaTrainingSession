package InterfacePackage.multiInterfaceAssignment;

import java.util.Scanner;

public class RunnerClass {

    public static void main(String[] args) {



        Circle c1 = new Circle("CIRCLE", 20);
        System.out.println(c1.getName());
        c1.draw();
        c1.calculatePerimeter();
        c1.calculateArea();

        Rectangle r1 = new Rectangle("RECTANGLE",10, 30);
        System.out.println(r1.getName());
        r1.draw();
        r1.calculatePerimeter();
        r1.calculateArea();

        Square s1 = new Square("SQUARE", 20);
        System.out.println(s1.getName());
        s1.draw();
        s1.calculatePerimeter();
        s1.calculateArea();




    }


}
