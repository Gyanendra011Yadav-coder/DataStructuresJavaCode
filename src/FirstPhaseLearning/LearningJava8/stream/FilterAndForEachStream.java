package FirstPhaseLearning.LearningJava8.stream;

import FirstPhaseLearning.LearningJava8.Comparator.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-13,Aug,2023
 * in Project: DataStructuresJavaCode
 */
public class FilterAndForEachStream {

    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<Student>();

        // Adding entries in above List
        // using add() method
        ar.add(new Student(111, "Mayank", "london"));
        ar.add(new Student(131, "Anshul", "nyc"));
        ar.add(new Student(120, "Solanki", "jaipur"));
        ar.add(new Student(102, "Aggarwal", "Hongkong"));

        //Applying filter
        ar.stream().filter(obj->obj.name.startsWith("A")).forEach(obj->System.out.println(obj));

        ar.stream().filter(student->student.rollno%2==0).forEach(obj-> System.out.println(obj));

        ar.stream().filter(student->student.address=="london").forEach(obj-> System.out.println(obj));

        System.out.println("Performing double condition:");
        ar.stream().filter(student -> student.name.startsWith("A") && student.rollno%2==0).forEach(val-> System.out.println(val));

        System.out.println("Printing by performing sorting:");
        //FirstPhaseLearning.Sorting using Collection
        Collections.sort(ar, (val1, val2)->val1.name.compareTo(val2.name));
        ar.forEach(val-> System.out.println(val));


        System.out.println("Start performing operatin on map");
        Map<Integer, Student> map=new HashMap<>();
        map.put(1,new Student(111, "Mayank", "london") );
        map.put(2, new Student(112, "Gyanendra", "India"));
        map.entrySet().forEach(obj-> System.out.println(obj));

        System.out.println("Performing conditon of print only odd number:");
        map.entrySet().stream().filter(student->student.getValue().rollno%2!=0).forEach(value-> System.out.println(value));

    }
}
