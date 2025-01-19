package FirstPhaseLearning.LearningJava8.optional;

import FirstPhaseLearning.LearningJava8.Comparator.Student;

import java.util.ArrayList;
import java.util.Optional;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-14,Aug,2023
 * in Project: DataStructuresJavaCode
 */
public class LearnOptinal {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int val=scanner.nextInt();

        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111, "Mayank", "london"));
        ar.add(new Student(131, "Anshul", "nyc"));
        ar.add(new Student(120, "Solanki", "jaipur"));
        ar.add(new Student(102, "Aggarwal", "Hongkong"));

        Optional<Student> optional= Optional.empty();
        System.out.println("Optional of empty is"+optional);

        Optional<Student> optional2= Optional.ofNullable(ar.get(3));
        if(optional2.isPresent()){
            System.out.println(optional2.get());
        }else{
            System.out.println(optional2.orElse(new Student(0,"null","fghjk")));
        }
    }
}
