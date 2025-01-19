package FirstPhaseLearning.MulipleCallingExample;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-06-16,Jun,2023
 * in Project: DataStructuresJavaCode
 */
public class Employee {
    private String empName;
    private int age;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getAge() {
        return age;
    }

    public Employee(String empName, int age) {
        this.empName = empName;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
