package LinkedList.LinkedListLeetode;

/**
 * @author lenovo
 * @created 28/12/2021- 1:51 PM
 * @project DataStructuresJavaCode
 */

/***
 * https://leetcode.com/problems/linked-list-cycle/
 *
 *
 */
public class DetehCycle {



      class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }

    public class Solution {
        public boolean hasCycle(ListNode head) {
            if(head==null || head.next==null){
                return false;
            }
            ListNode tempNext=head;
            ListNode tempPre=head;
            while(tempNext!=null){
                tempNext=tempNext.next.next;
                tempPre=tempPre.next;
                if(tempNext==tempPre){
                    return true;
                }
            }
            return false;
        }
    }
}
