package FirstPhaseLearning.TwoPointers;

import java.util.ArrayList;

public class LinkedList {

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode prev = dummyHead;

        while (head != null) {
            if (head.val == val) {
                prev.next = head.next;
            }
            prev = prev.next;
            head = head.next;
        }

        return dummyHead.next;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = reverseList(slow);
        ListNode firstHalf = head;

        while (secondHalf != null && secondHalf.next != null) {
            if (secondHalf.next.val != firstHalf.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next.next;
        }

        return true;
    }

    public boolean isPalindromeBrutt(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        for (int i = 0; i < list.size() / 2; i++) {
            if (list.get(i) != list.get(list.size() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode nextNode = null;
        ListNode temp = head;

        while (temp != null) {
            nextNode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextNode;
        }

        return prev;
    }

    public void deleteNode(ListNode node, int index) {
        ListNode prev = node;
        int count = 1;
        while (node.next != null && count != index) {
            prev = node;
            node = node.next;

            count++;
        }
        prev.next = node.next;
    }

    ListNode solve(ListNode node, int index) {
        ListNode prev = node;
        while (node.next != null) {
            prev = node;
            if (node.val == index) {
                prev.next = node.next;
            }
            node = node.next;
        }

        return prev;
    }

    public void deleteNode(ListNode node) {
        ListNode prev = node;

        while (node.next != null) {
            node.val = node.next.val;
            prev = node;
            node = node.next;
        }

        prev.next = null;
    }

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                ListNode temp = head;
                while (temp != slow) {
                    temp = temp.next;
                    slow = slow.next;
                }

                return temp;
            }
        }

        return null;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        for (int idx = 0; idx <= n; idx++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }

    public int lengthOfLinkedList(ListNode head) {
        int length = 0;
        while (head != null) {
            head = head.next;
            length++;
        }

        return length;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode cur = head;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        if (list1 != null) cur.next = list1;
        if (list2 != null) cur.next = list2;

        return head.next;
    }

    /**
     * Input: head = [3,2,0,-4], pos = 1
     *
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            if (slow == fast) return true;
            slow = slow.next;
            fast = fast.next.next;
        }

        return false;
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}