package ObjectClassPackage.EqualMethodOverride;

public class Student extends Object{

    private String studentName;
    private int rollNo;

    public Student(String studentName, int rollNo) {
        this.studentName = studentName;
        this.rollNo = rollNo;
    }




    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + studentName + '\'' +
                ", empId=" + rollNo +
                '}';
    }
}
