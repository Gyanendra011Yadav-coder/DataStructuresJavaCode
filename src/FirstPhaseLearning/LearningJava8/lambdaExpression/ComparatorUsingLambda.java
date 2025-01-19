package FirstPhaseLearning.LearningJava8.lambdaExpression;

import FirstPhaseLearning.LearningJava8.Comparator.Student;
import FirstPhaseLearning.LearningJava8.Comparator.TraditionComparator;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-13,Aug,2023
 * in Project: DataStructuresJavaCode
 */
public class ComparatorUsingLambda {

    // Traditional approach is applied in the below mentioned class
    TraditionComparator traditionObj; // Here, is the way to perform sorting

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
        /*
        Collections.sort(ar, new Sortbyname());
        System.out.println("Printing after sorting by name...");
        ar.forEach(student -> System.out.println(student));*/

        /*public int compare(Student a, Student b) { return a.name.compareTo(b.name); }*/

        //FirstPhaseLearning.Sorting using lambda
        Collections.sort(ar, (student1, student2) -> student1.name.compareTo(student2.name));

        System.out.println("Printing after performing sorting...");
        ar.forEach(student -> System.out.println(student + " "));

        System.out.println("Now, sorting with the help of roll Numbers:");
        Collections.sort(ar, (student1,  student2)-> Integer.compare(student1.rollno,student2.rollno));

        System.out.println("");
        ar.forEach(student -> System.out.println(student + " "));

        System.out.println("Performing reverse order...");
//        Comparator<Student> reverseOrder= Comparator.reverseOrder();


         ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(205);
        al.add(102);
        al.add(98);
        al.add(275);
        al.add(203);
        System.out.println("Elements of the FirstPhaseLearning.ArrayList " +
                "before sorting : " + al);

        Collections.sort(al, (num1, num2)-> Integer.compare(num1,num2));
        al.forEach(num-> System.out.print(num+" "));

        System.out.println();
        System.out.println("Performing decreasing order:");
        Collections.sort(al, (num1, num2)-> Integer.compare(num2, num1));
        al.forEach(num-> System.out.print(num+" "));
    }
}
