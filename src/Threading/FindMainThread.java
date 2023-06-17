package Threading;

import javaConceptsCode.ThreadsEtendsThreadClass;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-06-17,Jun,2023
 * in Project: DataStructuresJavaCode
 */
public class FindMainThread {
    public static void main(String[] args) {
        System.out.println("Current Thread ID:"+Thread.currentThread().getId());
        System.out.println("Current Thread Name:"+Thread.currentThread().getName());
        System.out.println("Current Thread Priority:"+ Thread.currentThread().getPriority());
        System.out.println("Current Thread State:"+Thread.currentThread().getState());
    }
}
