package FirstPhaseLearning.TwoPointers;

import java.util.*;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class BinaryTrees {

    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for (int idx = 0; idx < score.length; idx++) {
            maxHeap.offer(new int[]{score[idx], idx});
        }

        String[] result = new String[score.length];
        int count = 1;
        while (!maxHeap.isEmpty()){ //[10,3,8,9,4] -> 10, 9, 8, 4, 3
            if (count==1){
                result[0] = "Gold Medal";
                maxHeap.poll();
            } else if (count==2) {
                result[1] = "Silver Medal";
                maxHeap.poll();
            } else if (count==3) {
                result[2] = "Bronze Medal";
                maxHeap.poll();
            } else {
                result[count] = Integer.toString(maxHeap.poll()[0]);
            }
            count++;
        }
        return result;
    }

    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int val : stones) {
            maxHeap.offer(val);
        }

        while (maxHeap.size() != 1) {
            int num1 = maxHeap.poll();
            int num2 = maxHeap.poll();
            if (num1 == num2) continue;
            else if (num1 != num2) {
                maxHeap.offer(num2 - num1);
            }
        }

        return maxHeap.poll();
    }

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (ListNode nodeHeads : lists) {
            if (nodeHeads != null) {
                minHeap.add(nodeHeads);
            }

        }

        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (!minHeap.isEmpty()) {
            ListNode node = minHeap.poll();
            tail.next = node;
            tail = tail.next;

            if (node.next != null) {
                minHeap.add(node.next);
            }
        }

        return dummy.next;
    }

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums1.length == 0 || nums2.length == 0 || k == 0) return result;

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        for (int idx = 0; idx < Math.min(k, nums1.length); idx++) {
            minHeap.offer(new int[]{nums1[idx] + nums2[0], idx, 0});
        }

        while (k > 0 && !minHeap.isEmpty()) {
            int[] curr = minHeap.poll();
            int idx1 = curr[1];
            int idx2 = curr[2];

            result.add(Arrays.asList(nums1[idx1], nums2[idx2]));
            k--;

            if (idx2 + 1 < nums2.length) {
                minHeap.offer(new int[]{nums1[idx1] + nums2[idx2 + 1], idx1, idx2 + 1});
            }
        }

        return result;
    }

    List<Integer> treeElements = new ArrayList<>();

    int[] solve(TreeNode root1, TreeNode root2) {
        inOrder(root1);
        int[] traversal1 = new int[treeElements.size()];
        listToArray(traversal1);
        treeElements.clear();

        inOrder(root2);
        int[] traversal2 = new int[treeElements.size()];
        listToArray(traversal2);

        int[] finalArrayTrav = new int[traversal1.length + traversal2.length];
        int idx1 = 0, idx2 = 0, idx3 = 0;
        while (idx1 < traversal1.length && idx2 < traversal2.length) {
            if (traversal1[idx1] < traversal2[idx2]) {
                finalArrayTrav[idx3] = traversal1[idx1];
                idx1++;
            } else {
                finalArrayTrav[idx3] = traversal2[idx2];
                idx2++;
            }
            idx3++;
        }

        while (idx1 < traversal1.length) {
            finalArrayTrav[idx3] = traversal1[idx1];
            idx1++;
            idx3++;
        }

        while (idx2 < traversal2.length) {
            finalArrayTrav[idx3] = traversal2[idx2];
            idx2++;
            idx3++;
        }


        return finalArrayTrav;
    }

    void listToArray(int[] array) {
        int idx = 0;
        for (int ele : treeElements) {
            array[idx] = ele;
            idx++;
        }
    }

    public int[] getAllElements(TreeNode root1, TreeNode root2) {
        inOrder(root1);
        inOrder(root2);
//        return treeElements.stream().sorted().collect(Collectors.toList());
        return treeElements.stream().sorted().collect(Collectors.toList()).stream().mapToInt(Integer::intValue).toArray();
    }

    public void inOrder(TreeNode rootNode) {
        if (rootNode == null) return;

        inOrder(rootNode.left);
        treeElements.add(rootNode.val);

        inOrder(rootNode.right);
    }

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return new TreeNode(head.val);

        List<Integer> elements = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            elements.add(temp.val);
            temp = temp.next;
        }

        int[] num = new int[elements.size()];
        int idx = 0;
        for (int val : elements) {
            num[idx] = val;
            idx++;
        }

        return sortedArrayToBSTHelper(num, 0, num.length - 1);
    }

    Set<Integer> set = new HashSet<>();

    public int findSecondMinimumValue(TreeNode root) {
        kthSmallestInorderHelper(root);
        if (set.size() < 2) return -1;

        Iterator<Integer> it = set.iterator();
        it.next(); // Skip the first (smallest)
        return it.next(); // Return the second
    }


    public void kthSmallestInorderHelper(TreeNode root) {
        if (root == null) return;

        kthSmallestInorderHelper(root.left);

        set.add(root.val);

        kthSmallestInorderHelper(root.right);
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBSTHelper(nums, 0, nums.length - 1);
    }

    public TreeNode sortedArrayToBSTHelper(int[] nums, int left, int right) {
        if (left > right) return null;

        int mid = (left + right) / 2;
        TreeNode rootNode = new TreeNode(nums[mid]);
        rootNode.left = sortedArrayToBSTHelper(nums, left, mid - 1);
        rootNode.right = sortedArrayToBSTHelper(nums, mid + 1, right);

        return rootNode;
    }

    public ArrayList<Integer> morrisInorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        TreeNode curr = root;

        while (curr != null) {
            if (curr.left == null) {
                result.add(curr.val);
                curr = curr.right;
            } else {
                TreeNode pred = curr.left;
                while (pred.right != null && pred.right != curr) {
                    pred = pred.right;
                }

                if (pred.right == null) {
                    pred.right = curr;
                    curr = curr.left;
                } else {
                    pred.right = null;
                    result.add(curr.val);
                    curr = curr.right;
                }
            }
        }

        return result;
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        return (isBalancedHelper(root) == -1) ? false : true;
    }

    public int isBalancedHelper(TreeNode root) {
        if (root == null) return 0;

        int left = isBalancedHelper(root.left);
        int right = isBalancedHelper(root.right);

        if (left == -1 || right == -1) return -1;
        if (Math.abs(left - right) > 1) return -1;

        return 1 + Math.max(left, right);
    }


    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();

        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        treeNodeQueue.add(root);

        while (!treeNodeQueue.isEmpty()) {
            int queueSize = treeNodeQueue.size();
            List<Integer> level = new ArrayList<>();

            for (int idx = 0; idx < queueSize; idx++) {
                TreeNode polledNode = treeNodeQueue.poll();
                level.add(polledNode.val);
                if (polledNode.left != null) treeNodeQueue.add(polledNode.left);
                if (polledNode.right != null) treeNodeQueue.add(polledNode.right);
            }

            list.add(level);
        }

        return list;
    }

    public int[] levelOrder2(TreeNode root) {
        ArrayList<Integer> traversal = new ArrayList<>();
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.add(root);

        while (!treeNodeQueue.isEmpty()) {
            TreeNode polledNode = treeNodeQueue.poll();
            traversal.add(polledNode.val);

            if (polledNode.left != null) treeNodeQueue.add(polledNode.left);
            if (polledNode.right != null) treeNodeQueue.add(polledNode.right);
        }

        int[] result = new int[traversal.size()];
        int idx = 0;
        for (int val : traversal) {
            result[idx] = val;
            idx++;
        }

        return result;
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();

        ArrayList<Integer> res = new ArrayList<>();
        inorderTraversalHelper(root, res);
        return res;
    }

    public void inorderTraversalHelper(TreeNode root, List<Integer> traversalValue) {
        if (root == null) return;

        inorderTraversalHelper(root.left, traversalValue);
        traversalValue.add(root.val);
        inorderTraversalHelper(root.right, traversalValue);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<Integer> resultTraversal = new ArrayList<>();

        preOrderTraversalHelper(root, resultTraversal);

        return resultTraversal;
    }

    public void preOrderTraversalHelper(TreeNode root, List<Integer> traversalValue) {
        if (root == null) return;

        traversalValue.add(root.val);
        preOrderTraversalHelper(root.left, traversalValue);
        preOrderTraversalHelper(root.right, traversalValue);
    }
}

