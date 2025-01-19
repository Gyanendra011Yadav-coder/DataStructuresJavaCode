package FirstPhaseLearning.Multithreading;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-01-10,Jan,2023
 * in Project: DataStructuresJavaCode
 */
public class ThreadByExtending extends Thread{

    //Method will run the thread that will perform tasks of Reading a File
    @Override
    public void run() {
//       Runnable runnable = () -> {
//            try ( BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\Gyanendra-Yadav\\Downloads\\Ex_Files_Java_EE_Concurrency\\Exercise Files\\Chapter2\\02_03\\begin")))){
//                String line = null;
//                while((line=reader.readLine()) != null){
//                    System.out.println(Thread.currentThread().getName() + ": Reading Line " + line);
//                }
//            }catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//        };

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
       ThreadByExtending obj1= new ThreadByExtending();

        Thread thread1=new Thread();
        obj1.run();

    }
}
