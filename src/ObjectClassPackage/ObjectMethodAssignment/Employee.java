package ObjectClassPackage.ObjectMethodAssignment;

import java.util.Objects;

public class Employee {

    private final String firstName = "Shubham";
    private final String secondName = "Paliwal";
    private int age;
    private final String address = "113/24, Pratap Nagar, Jaipur, Rajasthan";
    private String department;

    public Employee(int age, String department) {
        this.age = age;
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {

        Employee abc = (Employee) o;
        boolean isEqaulsAge = this.age==abc.age;
        boolean isAddressSame = this.department.equals(abc.department);

//        return isEqaulsAge && isAddressSame;

        if(isAddressSame){
            if(isEqaulsAge){
                return true;
            }else return false ;
        }else return false;
    }

    @Override
    public int hashCode() {
        return (this.age + this.address.hashCode())/2;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public String returnString(){
        System.out.println("I am string");
        return department;
    }
}
