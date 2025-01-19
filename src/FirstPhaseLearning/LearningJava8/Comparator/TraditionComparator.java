package FirstPhaseLearning.LearningJava8.Comparator;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-13,Aug,2023
 * in Project: DataStructuresJavaCode
 */
public class TraditionComparator {
    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<Student>();

        // Adding entries in above List
        // using add() method
        ar.add(new Student(111, "Mayank", "london"));
        ar.add(new Student(131, "Anshul", "nyc"));
        ar.add(new Student(121, "Solanki", "jaipur"));
        ar.add(new Student(101, "Aggarwal", "Hongkong"));

        // Display message on console for better readability
        System.out.println("Unsorted list...");
        ar.forEach(student -> System.out.println(student)); // lambda to print

        Collections.sort(ar, new Sortbyname());
        System.out.println("Printing after sorting by name...");
        ar.forEach(student -> System.out.println(student));

        System.out.println("FirstPhaseLearning.Sorting list with the help of Roll Numbers...");
        Collections.sort(ar, new Sortbyroll());
        ar.forEach(student-> System.out.println(student));

    }
}
