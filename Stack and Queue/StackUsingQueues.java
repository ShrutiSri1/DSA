class MyStack {

    /** Initialize your data structure here. */
    int top=-1;
    int s[]=new int[1000];
    public MyStack() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        
        s[++top]=x;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(top==-1) return -1;
        int r=s[top];
        s[top]=-1;
        top--;
        return r;
    }
    
    /** Get the top element. */
    public int top() {
        return s[top];
        
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return top==-1;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
