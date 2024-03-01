package codingNinjas.queue;

import java.util.ArrayList;

public class QueueMethods {
    private int[] deque;
    private int front, rear, size, capacity;


    // Initialize your data structure.
    public QueueMethods(int n) {
        capacity = n;
        deque = new int[n];
        front = rear = -1;
        size = 0;
    }


    // Pushes 'X' in the front of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushFront(int x) {
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            front = (front - 1 + capacity) % capacity;
        }
        deque[front] = x;
        size++;
        return true;
    }


    // Pushes 'X' in the back of the deque. Returns true if it gets pushed into the deque, and false otherwise.

    public boolean pushRear(int x) {
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }
        deque[rear] = x;
        size++;
        return true;
    }


    // Pops an element from the front of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popFront() {
        if (isEmpty()) {
            return -1;
        }
        int poppedElement = deque[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        size--;
        return poppedElement;
    }


    // Pops an element from the back of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.

    public int popRear() {
        if (isEmpty()) {
            return -1;
        }
        int poppedElement = deque[rear];
        if (front == rear) {
            front = rear = -1;
        } else {
            rear = (rear - 1 + capacity) % capacity;
        }
        size--;
        return poppedElement;
    }


    // Returns the first element of the deque. If the deque is empty, it returns -1.
    public int getFront() {
        return isEmpty() ? -1 : deque[front];
    }


    // Returns the last element of the deque. If the deque is empty, it returns -1.

    public int getRear() {
        return isEmpty() ? -1 : deque[rear];
    }


    // Returns true if the deque is empty. Otherwise, returns false.
    public boolean isEmpty() {
        return size == 0;
    }


    // Returns true if the deque is full. Otherwise, returns false.

    public boolean isFull() {
        return size == capacity;
    }
}
