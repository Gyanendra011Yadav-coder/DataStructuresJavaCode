package FirstPhaseLearning.demo;

import java.lang.reflect.Method;

/**
 * @author lenovo
 * @created 02/02/2022- 9:39 PM
 * @project DataStructuresJavaCode
 */
public class Demo {
    public static void main(String[] args) {
        hackfun1 hack_obj = new hackfun1();
        Class hack_class=hack_obj.getClass();
        Method[] methods= hack_class.getMethods();

        for(Method method : methods){
            System.out.println();
        }
    }
}
