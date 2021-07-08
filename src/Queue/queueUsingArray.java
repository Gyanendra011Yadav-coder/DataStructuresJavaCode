package Queue;

public  class queueUsingArray {
    public final int Size=5;
    int rear=-1,front=-1;  // rear == back          front =begin
    int []queue=new int[Size];
//    public queueUsingArray(int Size ){
//        int [] queue=new int[Size];
//    }

    boolean isQueueEmpty(){
        if (rear==-1 &&front==-1){
            return true;
        }else{
            return false;
        }
    }

    boolean isQueueFull(){
        if(rear== queue.length){
            return true;
        }else {
            return false;
        }
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
    int  dequeue(){
        if(isQueueEmpty()){
            return -1;
        }else if(rear==front) {
            int data=queue[rear];
            front=-1;
            rear=-1;
            return data;
        }else {
            int value= queue[front];
            front++;
            return value;
        }

    }

    public static void main(String[] args) {
        queueUsingArray queue = new queueUsingArray();
        queue.enqueue(1);
        queue.enqueue(1);
        queue.enqueue(1);
        System.out.println( queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());



    }
}
