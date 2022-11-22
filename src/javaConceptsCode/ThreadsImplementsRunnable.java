package javaConceptsCode;

/**
 * Created By:  Gyanendra_Yadav
 * on 2022-11-14,Nov,2022
 * in Project: DataStructuresJavaCode
 */
public class ThreadsImplementsRunnable implements Runnable {
    public void run() {
        System.out.println("HI, THRE I'M THREAD USING RUNNABLE INTERFACE");
    }
    public  void stop() {

    }

    //Main Class
    public static void main(String[] args) {
//        ThreadsEtendsThreadClass thread = ;
        Thread threadObj= new Thread(new ThreadsImplementsRunnable());
        threadObj.start();
    }
}
