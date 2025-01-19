package FirstPhaseLearning.Threading.threadIntialization;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-06-17,Jun,2023
 * in Project: DataStructuresJavaCode
 */
public class ThreadIntilizationExtend extends Thread{
    private int startCount;
    private int endCount;
    private boolean isPrintEven;

    public ThreadIntilizationExtend(String threadName, int start, int end, boolean isPrintEven){
        super(threadName);
        this.startCount=start;
        this.endCount=end;
        this.isPrintEven=isPrintEven;
    }

    @Override
    public void run() {
        for (int i = startCount; i <endCount ; i++) {
            if(isPrintEven && i%2==0) {
                System.out.println(Thread.currentThread().getName() + "Printing Value Even"+i);
            } else if (!isPrintEven && i%2!=0) {
                System.out.println(Thread.currentThread().getName() + "Printing Value Odd"+i);
            }else{
                continue;
            }
        }
    }

    public static void main(String[] args) {
        ThreadIntilizationExtend thread1=new ThreadIntilizationExtend("EvenThread1",1,100, true);
        ThreadIntilizationExtend thread2=new ThreadIntilizationExtend("OddThread2",1,100,false);
        thread1.start();
        thread2.start();
    }
}
