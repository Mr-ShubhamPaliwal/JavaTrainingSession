package CollectionPackage.ArrayListAssignment;

public class PersonOfJaipur {

    private String name;
    private int age;

    public PersonOfJaipur(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "PersonOfJaipur{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
