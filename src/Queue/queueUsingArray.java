package Queue;

public class queueUsingArray {
    int rear=-1,front=-1;  // rear == back          front =begin
    int []queue;
    public queueUsingArray(int Size ){
        int [] queue=new int[Size];
    }
    /*ENQUEUE OPERATION IN THE QUEUE*/

    void enqueue(int data){
        if (rear==-1 && front==-1){
            queue[0]=data;
            rear++;
            front++;
        }else if (rear== queue.length-1){
            System.out.println("QUEUE OVERFLOW.");
        }else{
            rear++;
            queue[rear]=data;
        }
    }
}
