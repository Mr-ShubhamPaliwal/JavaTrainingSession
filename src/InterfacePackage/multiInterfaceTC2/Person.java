package InterfacePackage.multiInterfaceTC2;

public class Person implements Salaried,Employee{

    String empName;
    int empSalary;

    public Person(String s,int i){
        this.empName=s;
        this.empSalary=i;
    }


    @Override
    public String getName() {
        return empName;
    }


    @Override
    public int getSalary() {
        return empSalary;
    }

    @Override
    public void commonMethod() {
        System.out.println("This is common method in both interface");
    }
}
