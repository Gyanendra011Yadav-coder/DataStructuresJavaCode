package FirstPhaseLearning.codingNinjas.linkedList;

public class SearchInLinkedList {
    public static int searchInLinkedList(Node head, int k)
    {
        // Write Your Code Here.
        while (head != null && head.next!=null) {
            if(head.data==k || head.next.data==k){
                return 1;
            }
            head=head.next;
        }
        return 0;
    }

    public static Node findMiddle(Node head) {
        Node middle = null;
        int lengthLinkedList = findLinkedListLength(head);
        int tempTraverse = 0;
        if (lengthLinkedList % 2 == 0) { // if even then return second middle value
            while (tempTraverse != (lengthLinkedList / 2)) {
                head = head.next;
                tempTraverse += 1;
            }
        } else { // if odd then return middle value
            while (tempTraverse != (lengthLinkedList / 2)) {
                head = head.next;
                tempTraverse += 1;
            }
        }
        middle = head;
        return middle;
    }

    public static Node reverseLinkedList(Node head) {
        Node tempNode = head.next;
        Node headDupl = head;

        while (tempNode != null) {
            Node tempDup = tempNode.next;
            tempNode.next = headDupl;
            headDupl = tempNode;
            tempNode = tempDup;
        }
        // Set the next of the original head to null to avoid the loop
        head.next = null;

        head = headDupl;
        return head;
    }


    public static int findLinkedListLength(Node head) {
        int length = 1;
        if (head == null) {
            return 0;
        }
        while (head.next != null) {
            length++;
            head = head.next;
        }
        return length;
    }

}
