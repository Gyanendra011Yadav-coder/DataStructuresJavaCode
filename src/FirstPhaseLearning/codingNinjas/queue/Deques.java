package FirstPhaseLearning.codingNinjas.queue;

public class Deques {
    int[] queue;
    int front, capacity, rear, size = -1;

    // Initialize your data structure.
    public Deques(int n) {
        capacity = n;
        queue = new int[n];
        front = rear = -1;
        size = 0;
    }

    // Pushes 'X' in the front of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushFront(int x) {
        if (isFull()){
            return false;
        }
        queue[front]=x;
        size++;
        return true;
    }

    // Pushes 'X' in the back of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushRear(int x) {
        if (isFull()){
            return false;
        }
        queue[rear]=x;
        size++;
        return true;
    }

    // Pops an element from the front of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popFront() {
        if(isEmpty()) return -1;

        int popValue = queue[front];
        if (rear == front) {
            rear = front = -1;
        } else {
            rear = (rear - 1 + capacity) % capacity;
        }
        size--;
        return popValue;
    }

    // Pops an element from the back of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popRear() {
        if (isEmpty()) return -1;
        int popValue = queue[rear];
        if (rear == front) {
            rear = front = -1;
        } else {
            rear = (rear - 1 + capacity) % capacity;
        }
        size--;
        return popValue;
    }

    // Returns the first element of the deque. If the deque is empty, it returns -1.
    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return queue[0];
    }

    // Returns the last element of the deque. If the deque is empty, it returns -1.
    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return queue[capacity - 1];
    }

    // Returns true if the deque is empty. Otherwise returns false.
    public boolean isEmpty() {
        return size==0;
    }

    // Returns true if the deque is full. Otherwise returns false.
    public boolean isFull() {
        return (size == capacity);

    }

}

