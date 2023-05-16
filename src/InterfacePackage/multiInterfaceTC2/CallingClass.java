package InterfacePackage.multiInterfaceTC2;

public class CallingClass {

    public static void main(String[] args) {

        Person p1 = new Person("Shubham", 10000);
        Employee p2 = new Person("Vaibhav", 20000);
        Salaried p3 = new Person("Mahadev",500000);


        System.out.println("Name is "+ p1.getName());
        System.out.println("Salary is "+ p1.getSalary());;
        p1.commonMethod();

        String name2 = p2.getName();
        System.out.println("Name is "+ name2);
        p2.commonMethod();

        System.out.println("Salary is "+ p3.getSalary());
        p3.commonMethod();


    }
}
