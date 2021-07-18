package GraphDataStructure;

public class QueueClass {
    int []arr;    // WILL STORE THE VALUES
    int front; // WILL BE POINTING THE FRONT
    int rear; // WILL BE POINTING THE REAR
    int count; // WILL BE USED TO CALACULATE THE CURRENT SIZE
    int capacity; // USED TO CALCULATE THE CAPACITY OF WHOLE QUEUE

    QueueClass(int size){
        arr=new int[size];
        front=0;
        rear=-1;
        count=0;
        capacity=size;
    }

}
