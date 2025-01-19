package FirstPhaseLearning.Multithreading;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-01-10,Jan,2023
 * in Project: DataStructuresJavaCode
 */
public class ThreadByRunnableInterface implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("MyThread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadByRunnableInterface myThread = new ThreadByRunnableInterface();
        Thread threadObj= new Thread(myThread);
        threadObj.start();
    }


}
