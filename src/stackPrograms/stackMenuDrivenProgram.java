package stackPrograms;

import java.util.Scanner;

/**
 *  Abhishek went for an interview at an IT company. The interviewer asks him to design a Data Structure that performs the Stack operation like push(), pop() and one more operation getMin(), getMin() function should return the minimum element from the stack. The interviewer also told him that all these operations must be in
 * O
 * (
 * 1
 * )
 *  time and use only stack data structure.
 *
 *  Note: You have to answer the question according to query.
 *     You will get four types of query.
 *
 * 1. push(x) - Push element x onto stack.
 * 2. pop() - Removes the element on top of the stack.
 * 3. top() - Get the top element.
 * 4. getMin() - Get the minimum element in the stack.
 *  Expected Time Complexity for each query is O(1)
 *
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
    int pop(){
        if (isEmpty()){
            return -1;
        }
        else{
            int topValue= top.data;
            top=top.next;
            return topValue;
        }

    }

    int top(){
        if (isEmpty()){
            return -1;

        }
        else
            return top.data;
    }

    int getMin(){
        if (isEmpty()){
            return -1;
        }else{
            int value=top.data;
            Node temp=top.next;
            while (temp.next!=null){
                if (value>temp.data)
                    value=temp.data;

                temp=temp.next;
            }
        return value;
        }

    }

class main{
    public static void main(String[] args) {
        stackMenuDrivenProgram prgm = new stackMenuDrivenProgram();
        Scanner scannerObject = new Scanner(System.in);
        int testCase = scannerObject.nextInt();
        while (testCase!=0){
            int run = scannerObject.nextInt();
            if (run==1){
                int dataToPush= scannerObject.nextInt();
                prgm.push(dataToPush);
            }else if (run==2){
                int val=prgm.pop();
                System.out.println(val);
            }else if (run==3){
                int top = prgm.top();
                System.out.println(top);
            }else if (run==4){
                int minEle = prgm.getMin();
                System.out.println(minEle);
            }else {
                System.out.println("-1");
            }
            testCase--;
        }
    }
}

}


