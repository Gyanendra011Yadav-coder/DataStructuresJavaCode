package stackPrograms;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

/**
 * Abhishek went for an interview at an IT company. The interviewer asks him to design a Data Structure that performs the Stack operation like push(), pop() and one more operation getMin(), getMin() function should return the minimum element from the stack. The interviewer also told him that all these operations must be in
 * O
 * (
 * 1
 * )
 * time and use only stack data structure.
 * <p>
 * Note: You have to answer the question according to query.
 * You will get four types of query.
 * <p>
 * 1. push(x) - Push element x onto stack.
 * 2. pop() - Removes the element on top of the stack.
 * 3. top() - Get the top element.
 * 4. getMin() - Get the minimum element in the stack.
 * Expected Time Complexity for each query is O(1)
 * <p>
 * Note: The Interviewer did not allow you to use any other data structure except stack.
 */

public class stackMenuDrivenProgram {
    Node top;

    class Node {
        int data;
        Node next;

        Node(int Data) {
            this.data = Data;
            this.next = null;
        }
    }

    boolean isEmpty() {
        if (top == null)
            return true;
        else
            return false;
    }


    void push(int data) {
        Node newNode = new Node(data);
        if (top == null)
            top = newNode;
        else
            newNode.next = top;
        top = newNode;
    }

    int pop() {
        if (isEmpty()) {
            return -1;
        } else {
            int topValue = top.data;
            top = top.next;
            return topValue;
        }

    }

    int top() {
        if (isEmpty()) {
            return -1;

        } else
            return top.data;
    }

    int getMin() {
        if (isEmpty()) {
            return -1;
        } else {
            int value = top.data;
            Node temp = top.next;
            while (temp != null) {
                if (value > temp.data)
                    value = temp.data;

                temp = temp.next;
            }
            return value;
        }

    }
}

class main {
    public static void main(String[] args) {
        stackMenuDrivenProgram prgm = new stackMenuDrivenProgram();
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("ENTER THE TEST CASES YOU WANT TO RUN:");
        int testCase = scannerObject.nextInt();
        while (testCase != 0) {
            System.out.println("ENTER THE NUMBER B/W 1-4" + " \n" +
                    "1. push(x) - Push element x onto stack.\n" +
                    "2. pop() - Removes the element on top of the stack.\n" +
                    "3. top() - Get the top element.\n" +
                    "4. getMin() - Get the minimum element in the stack.");
            int run = scannerObject.nextInt();
            if (run == 1) {
                System.out.println("ENTER THE DATA TO PUCH IN THE STACK:-");
                int dataToPush = scannerObject.nextInt();
                prgm.push(dataToPush);
            } else if (run == 2) {
                int val = prgm.pop();
                System.out.println("THE POPED ELEMENT FROM THE STACK IS:" + " " + val);
            } else if (run == 3) {
                int top = prgm.top();
                System.out.println("THE TOP ELEMENT OF THE STACK IS:" + " " + top);
            } else if (run == 4) {
                int minEle = prgm.getMin();
                System.out.println("THE MINIMUM ELEMENT OF THE STACK IS:" + " " + minEle);
            } else {
                System.out.println("ENTER THE CORRECT CHOICE");
            }
            testCase--;
        }
    }
}




