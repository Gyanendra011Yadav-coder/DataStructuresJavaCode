package LeetcodeQuestions.Qustions;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackusingQueues225 {
    Queue <Integer> stack;
    public ImplementStackusingQueues225() {
        stack = new LinkedList<Integer>();
    }
    public void push(int x) {
        stack.add(x);
    }

    public int pop() {
        return stack.remove();
    }

    public int top() {
        return stack.peek();
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}

