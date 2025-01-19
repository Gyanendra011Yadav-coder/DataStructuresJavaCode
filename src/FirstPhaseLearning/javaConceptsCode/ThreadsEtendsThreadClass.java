package FirstPhaseLearning.javaConceptsCode;

/**
 * Created By:  Gyanendra_Yadav
 * on 2022-11-14,Nov,2022
 * in Project: DataStructuresJavaCode
 */
public class ThreadsEtendsThreadClass extends Thread{

    public void run() {
        System.out.println("HI, THRE I'M THREAD USING extend keyword");
    }

    //Main_Class
    public static void main(String[] args) throws InterruptedException {
        ThreadsEtendsThreadClass thread2=new ThreadsEtendsThreadClass();
        thread2.start();
        thread2.sleep(600);
    }
}
