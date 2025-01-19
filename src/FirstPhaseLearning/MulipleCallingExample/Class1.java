package FirstPhaseLearning.MulipleCallingExample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-06-16,Jun,2023
 * in Project: DataStructuresJavaCode
 */
public class Class1 {

    public static void main(String[] args) {
        Class2 class2=new Class2();

        Employee employee=new Employee("Ramesh",12);
        Employee employee2=new Employee("suresh",15);

        List<Employee> lstEmp=new ArrayList<Employee>();
        lstEmp.add(employee);
        lstEmp.add(employee2);

        for (Employee emp : lstEmp) {
            class2.arrEmp(emp);
        }
        class2.callPrint();

        Employee employee3=new Employee("Ramesh3",12);
        Employee employee4=new Employee("suresh4",15);

        List<Employee> lstEmp2=new ArrayList<Employee>();
        lstEmp2.add(employee3);
        lstEmp2.add(employee4);

        for (Employee emp : lstEmp2) {
            class2.arrEmp(emp);
        }
        class2.callPrint();

    }
}
