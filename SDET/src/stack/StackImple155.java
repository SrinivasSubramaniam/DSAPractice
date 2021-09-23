package stack;

import java.util.Stack;

public class StackImple155 {
	
	 private Stack<Integer> stack;
	    int min=Integer.MAX_VALUE;
	    /** initialize your data structure here. */
	    public StackImple155() {
	        this.stack=new Stack<Integer>();
	        
	    }
	    
	    public void push(int val) {
	        if (val<=min){
	            stack.push(min);
	            min=val;
	        } 
	        stack.push(val);
	        
	    }
	    
	    public void pop() {
	        if (stack.pop()==min) min=stack.pop();
	        
	    }
	    
	    public int top() {
	        return stack.peek();
	    }
	    
	    public int getMin() {
	        return min;
	    }
	    
	    public static void main(String[] args) {
	    	StackImple155 st=new StackImple155();
	    	st.push(-2);
	    	st.push(0);
	    	st.push(-3);
	    	System.out.println(st.getMin());
	    	st.pop();
	    	System.out.println(st.top());
	    	System.out.println(st.getMin());
		}

}
