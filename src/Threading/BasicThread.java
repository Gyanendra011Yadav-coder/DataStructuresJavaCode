package Threading;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-05-31,May,2023
 * in Project: DataStructuresJavaCode
 */
public class BasicThread implements Runnable{
    private static int counter = 0;
    public void run() {
        while(counter < 10) {
            synchronized (BasicThread.class) {
                System.out.println("[" + Thread.currentThread().getName() + "] ←-" +
                        "before: " + counter);
                counter++;
                System.out.println("[" + Thread.currentThread().getName() + "] ←- " +
                        "after: " + counter);
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[5];
        for(int i=0; i<threads.length; i++) {
            threads[i] = new Thread(new BasicThread(), " ←-"+
                    "thread-"+ i);
                    threads[i].start();
        }
        for(int i=0; i<threads.length; i++) {
            threads[i].join();
        }
    }

}
