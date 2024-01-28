package LearningJava8.practiceInterviewQuestions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-16,Aug,2023
 * in Project: DataStructuresJavaCode
 */
public class ImportantJava8QusSolving {

    /*
    Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
     */
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32,110, 110, 120, 120, 10, 15, 8);
        List<String> strings = Arrays.asList("one", "two", "three");

        list.stream().filter(num->num%2==0).forEach(val-> System.out.print("Even Number's are:"+val+" "));

        //Given a list of integers, find out all the numbers starting with 1 using Stream functions?
//        list.stream().map(val->val+"").filter(num->num.startsWith("1")).forEach(num-> System.out.println("Number starting with 1 is:"+num));
        list.stream().filter(num->String.valueOf(num).startsWith("1")).forEach(num-> System.out.print("Number starting with 1 is:"+num+" "));

        //Convert String list to upper cases
        System.out.println("Converting string list to upper case letter:");
        strings.stream().map(str->str.toUpperCase()).forEach(System.out::println);

        System.out.println("Finding duplicate elements in a given integers list in java using Stream functions:-");
        Set<Integer> setRemDuplicate=new HashSet<>();
        list.stream().filter(ele->!setRemDuplicate.add(ele)).forEach(System.out::println);

        System.out.println("First element of the list using Stream functions is?");
        list.stream().findFirst().ifPresent(System.out::println);

        System.out.println("total number of elements present in the list using Stream functions?");
        System.out.println(list.stream().count());

        System.out.println("The maximum value element present in list using Stream functions?");
        list.stream().max(Integer::compare).ifPresent(System.out::println); // this is representing method refrencing's with instance method of particular object

        System.out.println(" The most smallest value in list is:");
        list.stream().min(Integer::compare).ifPresent(System.out::println);

        System.out.println("Sort all the values present in list using Stream functions?");
//        Collections.sort(list, (num1, num2)->Integer.compare(num1,num2));
        list.stream().sorted().forEach(System.out::println);// here we are applying instance methd of an particular object  object
//        list.stream().forEach(System.out::print);

        System.out.println("Sorting all the values present in list in descending order using Stream functions?");
        list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);


        System.out.println("Finding count of characters in the giver array:");
        String str="gyanendra";
        Map<String, Long> collect = Arrays.stream(str.split("")).
                collect(
                        Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        collect.forEach((key, value)-> System.out.println(key +":"+value));
        System.out.println(collect);

        System.out.println("Return true if any value appears at least twice in the array, and return false if every element is distinct:");
        List<Integer> newList=new ArrayList<>();
//        list.stream().filter(num-> );

    }
}
