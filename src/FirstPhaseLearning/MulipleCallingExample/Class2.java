package FirstPhaseLearning.MulipleCallingExample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-06-16,Jun,2023
 * in Project: DataStructuresJavaCode
 */
public class Class2 {
    List<Employee> listEmp=new ArrayList<>();
    public void arrEmp(Employee emp) {
        listEmp.add(emp);

    }

    public void callPrint() {
        for (int i = 0; i < listEmp.size(); i++) {
            System.out.println(listEmp.get(i).getEmpName()+","+listEmp.get(i).getAge());
        }
    }

}
