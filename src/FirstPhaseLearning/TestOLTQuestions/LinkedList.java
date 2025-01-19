package FirstPhaseLearning.TestOLTQuestions;
import java.util.Scanner;
/**
 * @author lenovo
 * @created 14/12/2021- 11:07 PM
 * @project DataStructuresJavaCode
 */

public class LinkedList{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    //Wap a program
    void rotate(int k)
    {
        for (int i = 1; i <=k ; i++) {
            Node temp=head;
            int headData=head.data;
            Node previous=head;
            while(temp!=null){
                previous.data=temp.data;
                previous=temp;
                temp=temp.next;
            }
            previous.data=headData;
        }
    }

    void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void printList()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String args[])
    {
        LinkedList llist = new LinkedList();
        Scanner input = new Scanner(System.in);
       int rot = input.nextInt();
        for (int i = 60; i >= 10; i -= 10)
            llist.push(i);
        llist.rotate(rot);
        llist.printList();
    }
}
