package GraphDataStructure;

public class QueueClass {
    int []arr;    // WILL STORE THE VALUES
    int front; // WILL BE POINTING THE FRONT of the queue
    int rear; // WILL BE POINTING the first position
    int count; // WILL BE USED TO CALACULATE THE CURRENT SIZE
    int capacity; // USED TO CALCULATE THE CAPACITY OF WHOLE QUEUE

    QueueClass(int size){
        capacity=size;
        arr=new int[size];
        front=0;
        rear=-1;
        count=0;

    }
    /*THIS METHOD WILL TAKE CARE, WHETHER  THE QUEUE IS EMPTY OR NOT*/
    public boolean isEmpty(){
        if(rear==-1 )
            return true;
        else
            return false;
    }

    /*THIS METHOD WILL TAKE CARE OF QUEUE IS FULL OR NOT*/
    public boolean isFull(){
        if (front==capacity-1)
            return true;
        else
            return false;
    }

    /*THIS METHOD WILL INSERT THE VALUE IN THE QUEUE*/
    public void enqueue(int data){
        if (isFull()){
            System.out.println("QUEUE OVER-FLOW");
        }else if(isEmpty()){
            arr[front]=data;    // FIRST iNCREAISNG THE VALUE OF THE REAR AND THEN INSERT AT THAT LOCATION
            rear++;
            count++;
        } else {                         // NOT EMPTY, THEN THIS WILL RUN
            /*
            rear=(rear+1)%capacity;
             */
          arr[++front]=data;    // FIRST iNCREAISNG THE VALUE OF THE REAR AND THEN INSERT AT THAT LOCATION
          count++;
        }
    }

    /*THIS METHOD WILL ****DEQUEUE**** The ELEMENTS FROM THE QUEUE */
    public int dequeue() {
       if (isEmpty()){
           return -1;
       }
       else {
           int data = arr[rear];
           rear++;
           count--;
           return data;
       }
    }
    /*THIS METHOD WILL GIVE THE SIZE OF THE QUEUE*/

    public int sizeQueue(){
        return count;
    }

    /*THIS METHOD WILL PEAK IN THE QUEUE */
    public int peak(){
        return arr[front];
    }




}
