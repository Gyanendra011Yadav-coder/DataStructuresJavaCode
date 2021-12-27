package LinkedListLeetode;

/**
 * @author lenovo
 * @created 27/12/2021- 11:52 PM
 * @project DataStructuresJavaCode
 */
/*
https://leetcode.com/problems/reverse-linked-list-ii/


Given the head of a singly linked list and two integers left and right where left <= right,
reverse the nodes of the list from position left to position right, and return the reversed list.
 */
public class ReverseLinkedList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class ListNode {
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
            this.next=null;
    }



        public ListNode reverseBetween(ListNode head, int left, int right) {
            //checking the base condtion
            if(head==null || left==right){
                return head;
            }

            //creating another tempHead so, that if there is less number of Nodes in Linked List, then there must not be no loss of head
            ListNode tempHead=new ListNode(0);
            //Connecting it with LL
            tempHead.next=head;
//creating another Temporary Node to Reach before Left Portion
            ListNode temp=tempHead;
            int iterate=0;
            while(iterate<left-1){
                temp=temp.next;
                iterate++;
            }
//creating another temporary Node.
            ListNode curr=temp.next;
            while(left<right){
                ListNode nextNode=curr.next;
                curr.next=curr.next.next;
                nextNode.next=temp.next;
                temp.next=nextNode;
                left++;
            }
            return tempHead.next;
        }
    }
}
