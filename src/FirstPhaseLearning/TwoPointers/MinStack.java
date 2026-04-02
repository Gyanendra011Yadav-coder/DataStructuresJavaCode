package FirstPhaseLearning.TwoPointers;

import java.util.Map;
import java.util.Stack;

class pair{
    int x;
    int y;
    public pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class MinStack {
    Stack<pair> stack = new Stack<>();

    public MinStack() {}

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(new pair(val, val));
        } else {
            int min = Math.min(stack.peek().y, val);
            stack.push(new pair(val, min));
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().x;
    }

    public int getMin() {
        return stack.peek().y;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
