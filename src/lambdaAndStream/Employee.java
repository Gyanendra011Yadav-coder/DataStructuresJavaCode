package lambdaAndStream;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-06-23,Jun,2023
 * in Project: DataStructuresJavaCode
 */
public class Employee {
    int id;
    String name;
    int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
