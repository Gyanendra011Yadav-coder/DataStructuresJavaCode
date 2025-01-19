package FirstPhaseLearning.LearningJava8.lambdaExpression;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-12,Aug,2023
 * in Project: DataStructuresJavaCode
 */
public class MainClassInterface {

    public static void main(String[] args) {

        //Converting the above to Lambda expression
        Runnable runaableObj = () -> {
            System.out.println("Hello, World!");
        };

        Thread threadObject = new Thread(runaableObj);
        threadObject.start();

        // ()   ->   {body};
        FunctionalInterfaceExample interfaceExample = (a, b) -> {
            return a + b;
        };

        System.out.println(interfaceExample.addNum(1, 2));
//        Consumer<String> printConsumer = s -> System.out.println(s);
//        printConsumer.accept("Hello, Consumer!");
//
//        Predicate<Integer> isEvenPredicate = n -> n % 2 == 0;
//        System.out.println("Is 6 even? " + isEvenPredicate.test(6));
//
//        Function<Integer, String> intToStringFunction = n -> "Number: " + n;
//        System.out.println(intToStringFunction.apply(42));
//
//        Supplier<Double> randomSupplier = Math::random;
//        System.out.println("Random number: " + randomSupplier.get());
    }
}
