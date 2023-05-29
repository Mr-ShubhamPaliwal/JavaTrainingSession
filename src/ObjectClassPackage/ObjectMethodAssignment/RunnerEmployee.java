package ObjectClassPackage.ObjectMethodAssignment;

public class RunnerEmployee {

    public static void main(String[] args) {

        Employee e1 = new Employee(25,"Quality");
        Employee e2 = new Employee(30,"QUALITY");
        Employee e3 = new Employee(30,"HR");

        boolean b = e1.equals(e2);
        System.out.println(b);
        System.out.println(e2.equals(e3)); // how other object is decided ?????

        // both giving same output as we put object reference in sout bcz directly it will call toString method
        System.out.println(e1);// Why it is returning toString method only ????
        System.out.println(e1.toString());

        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());


    }


}
