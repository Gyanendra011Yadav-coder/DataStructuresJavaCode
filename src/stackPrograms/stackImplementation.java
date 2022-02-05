package stackPrograms;

/**
 * @author Gyanendra Yadav
 * @created 05/02/2022- 1:31 PM
 * @project DataStructuresJavaCode
 */

/**
 * STACK WORKS ON-> LAST IN FIRST OUT PRINCIPLE
 */
public class stackImplementation {
    //Stack Implementation Using LinkedList
    Node head = null;
    Node tail = null;
    int nodeCount = -1;

    class Node {
        Node nextNode;
        int data;

        Node(int data) {
            this.nextNode = null;
            this.data = data;
        }
    }

    //This method will Insert Value in stack
    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null && tail == null) {
            head = tail = newNode;
            nodeCount++;
        }
        tail.nextNode = newNode;
        tail = newNode;
        nodeCount++;
    }

    //This Method Will take out the value
    public int pop() {
        if (head == null || tail == null) {
            return -1;
        }
        Node temp = head;
        while (temp.nextNode != tail) {
            temp = temp.nextNode;
        }
        int lastNodeValue = tail.data;
        tail = temp;
        temp.nextNode = null;
        nodeCount--;
        return lastNodeValue;
    }

    //method to display the Node
    public void display() {
        if (head == null) {
            System.out.println("Stack Is Empty...");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.nextNode;
        }
    }
//method to peek in the stack
    public int peek(){
        if(head==null || tail==null){
            return -1;
        }
        return tail.data;
    }
    //main method of the class
    public static void main(String[] args) {
        stackImplementation stack = new stackImplementation();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Size Of Stack is" + stack.nodeCount);
        System.out.println();
        System.out.println("Number Of Nodes Are There Ini Stack Are:-");
        stack.display();
        System.out.println();
        System.out.println("Removing Node From Stack is:-");
        System.out.println(stack.pop());
        System.out.println("Remaining Nodes After Removing Node From Stack is...");
        stack.display();
        System.out.println();
        System.out.println("Size Of Stack is" + stack.nodeCount);
    }
}
