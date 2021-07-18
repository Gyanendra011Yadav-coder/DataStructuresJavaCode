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
    /*THIS METHOD WILL TAKE CARE, WHEATHER  THE QUEUE IS EMPTY OR NOT*/
    public boolean isEmpty(){
        if(rear==-1)
            return true;
        else
            return false;
    }
    /*THIS METHOD WILL TAKE CARE OF QUEUE IS FULL OR NOT*/
    public boolean isFull(){
        if (front==capacity)
            return true;
        else
            return false;
    }
   


}
