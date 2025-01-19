package FirstPhaseLearning.LearningJava8.lambdaAndStream;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-06-23,Jun,2023
 * in Project: DataStructuresJavaCode
 */
public class LambdaSolution {

    public static void main(String[] args) {
        FunctionalInterface functionalInterface=(num1, num2)->{
          return num1+num2;
        };
        System.out.println(functionalInterface.returnSum(1,2));


    }
}
