package FirstPhaseLearning.LearningJava8.lambdaExpression;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-13,Aug,2023
 * in Project: DataStructuresJavaCode
 */

@FunctionalInterface
interface GenericFunctionalInterface<T> {
    T doWhatYouWnat(T type);
}
public class GenricTypeLambda {

    public static void main(String[] args) {
        GenericFunctionalInterface<Double> funObj = (number) -> {
            return number;
        };

        System.out.println("Getiting from geneiric Double" + funObj.doWhatYouWnat(5678.0));


        GenericFunctionalInterface<Integer> funObjInt = (number) -> {
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            return factorial;
        };

        System.out.println("Finding factorial" + funObjInt.doWhatYouWnat(5));
    }
}


