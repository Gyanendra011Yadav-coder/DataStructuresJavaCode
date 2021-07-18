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
        front=capacity-1;
        rear=-1;
        count=0;

    }
    /*THIS METHOD WILL TAKE CARE, WHETHER  THE QUEUE IS EMPTY OR NOT*/
    public boolean isEmpty(){
        if(rear==-1)
            return true;
        else
            return false;
    }

    /*THIS METHOD WILL TAKE CARE OF QUEUE IS FULL OR NOT*/
    public boolean isFull(){
        if (rear==front)
            return true;
        else
            return false;
    }

    /*THIS METHOD WILL INSERT THE VALUE IN THE QUEUE*/
    public void enqueue(int data){
        if (isFull()){       //THIS WILL RUN WHEN, OUR QUEUE IS EMPTY.
            System.out.println("QUEUE OVER-FLOW");
        }else {                  // NOT EMPTY, THEN THIS WILL RUN
            /*
            rear=(rear+1)%capacity;
             */
          arr[++rear]=data;    // FIRST iNCREAISNG THE VALUE OF THE REAR AND THEN INSERTOITNG AT THAT LOCATION
          front++;
          count++;

        }
    }

    /*THIS METHOD WILL DEQUEUE The ELEMENTS FROM THE QUEUE */
    public int dequeue() {
       if (isEmpty()){
           return -1;
       }
       int lastValue=arr[front];
       front--;
       return lastValue;
    }




}
