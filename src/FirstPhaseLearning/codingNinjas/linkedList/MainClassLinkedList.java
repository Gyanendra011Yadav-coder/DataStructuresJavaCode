package FirstPhaseLearning.codingNinjas.linkedList;

public class MainClassLinkedList {
    protected static Node node=new Node();
    private static Node head=null;
    public static void insert(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(value);
        }
    }

    public static void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
//        int[] values = {8174, 57250, 40228, 21082, 87312, 78869, 29687, 87052, 18145, 62092, 78507, 9302, 28721, 47527, 35880, 11018, 30327, 24850, 76597, 83793, 6456, 18003, 9329, 89960, 78740, 55725, 5584, 58070, 63535, 78724, 24627, 49230, 4295, 35169, 33902, 46452, 44372, 54145, 28028, 94464, 55047, 48783, 43134, 71051, 82652, 72746, 88257, 32800, 90466, 88925, 39690, 20281, 68784, 91977, 83407, 51294, 27748, 85063, 42324, 66381, 85363, 17553, 8143, 47029, 86306, 66032, 45805, 16508, 43038, 62436, 71788, 6119, 21351, 5324, 45171, 47466, 16694, 14141, 84602, 51220, 85434, 55602, 70200, 53832, 89586, 68918, 10120, 3256, 86620, 61205, 90950, 96331, 97341, 61793, 24278, 59126, 76369, 17389, 85596, 60282, -1};
        for (int value : values) {
            insert(value);
        }
        printLinkedList();

        System.out.println(SearchInLinkedList.searchInLinkedList(head,60282));
        System.out.println("Middle Node data is"+SearchInLinkedList.findMiddle(head).data);
        head=SearchInLinkedList.reverseLinkedList(head);
        System.out.println("Head node is"+(head.data));
        printLinkedList();
    }
}
