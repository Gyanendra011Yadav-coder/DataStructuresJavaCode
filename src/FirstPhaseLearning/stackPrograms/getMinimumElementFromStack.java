package FirstPhaseLearning.stackPrograms;

import java.util.Scanner;
/**
 * @author lenovo
 * @created 03/01/2022- 4:31 PM
 * @project DataStructuresJavaCode
 */
public class getMinimumElementFromStack {
    static Node top=null;
    static class Node{
        int data;
        Node nextNode;
        Node(int data){
            this.data=data;
            nextNode=null;
        }
    }
    private static void push(int element){
        Node newNode= new Node(element);
        if(top==null){
            top=newNode;
        }
        newNode.nextNode=top;
        top=newNode;
    }

    private static int pop(){
        if(top==null){
            return -1;
        }
        int returnValue= top.data;
        top=top.nextNode;

        return returnValue;
    }


    private static int top(){
        if(top==null){
            return -1;
        }
        return top.data;
    }

    private static int getMin() {
        if(top==null){
            return -1;
        }
        int  min=0;
        Node temp=top;
        while(temp!=null){
            if(temp.data<min){
                min=temp.data;
            }
            temp=temp.nextNode;
        }
        return min;
    }


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int testCase=sc.nextInt();
        while(testCase!=0){
            int runNumber=sc.nextInt();
            if(runNumber==1){
                int numberToInsert=sc.nextInt();
                push(numberToInsert);
            }else if(runNumber==2){
                System.out.println(pop());
            }else if(runNumber==3){
                System.out.println(top());
            }else if (runNumber==4){
                System.out.println(getMin());
            }else{
                System.out.println("-1");
            }
            testCase--;
        }
    }


}
