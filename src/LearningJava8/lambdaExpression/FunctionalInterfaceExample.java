package LearningJava8.lambdaExpression;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-10,Aug,2023
 * in Project: DataStructuresJavaCode
 */

@FunctionalInterface
interface FunctionalInterfaceExample {
    default String addEmployee(String employeeName) {
        return null;
    }

    static void removeEmployee(String employeeName) {

    }

    int addNum(int num1, int num2);

    public static void main(String[] args) {
        Consumer<String> printConsumer = s -> System.out.println(s);
        printConsumer.accept("Hello, Consumer!");

        Predicate<Integer> isEvenPredicate = n -> n % 2 == 0;
        System.out.println("Is 6 even? " + isEvenPredicate.test(6));

        Function<Integer, String> intToStringFunction = n -> "Number: " + n;
        System.out.println(intToStringFunction.apply(42));

        Supplier<Double> randomSupplier = Math::random;
        System.out.println("Random number: " + randomSupplier.get());
    }
}
