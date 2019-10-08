package easy;

import java.util.Stack;

public class MinStack {
	
	Stack<Integer> numStack = new Stack<Integer>();
    
    /** initialize your data structure here. */
    public MinStack() {
        this.numStack = new Stack<Integer>();
    }
    
    public void push(int x) {
        this.numStack.push(x);
    }
    
    public void pop() {
        this.numStack.pop();
    }
    
    public int top() {
        return this.numStack.peek();
    }
    
    public int getMin() {
        int min = this.top();
        for (int e: this.numStack){
            if (e < min){
                min = e;
            }
        }
        return min;
    }
}
