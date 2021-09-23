package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StackImpleArrList155 {
	
	 private List<Integer> list;
	    int min=Integer.MAX_VALUE;
	    /** initialize your data structure here. */
	    public StackImpleArrList155() {
	        this.list=new ArrayList<Integer>();
	        
	    }
	    
	    public void push(int val) {
	        
	        list.add(val);
	        
	    }
	    
	    public void pop() {
	        list.remove(list.size()-1);
	        
	    }
	    
	    public int top() {
	        return list.get(list.size()-1);
	    }
	    
	    public int getMin() {
	        return Collections.min(list);
	    }
	    
	    public static void main(String[] args) {
	    	StackImpleArrList155 st=new StackImpleArrList155();
	    	st.push(-2);
	    	st.push(0);
	    	st.push(-3);
	    	System.out.println(st.getMin());
	    	st.pop();
	    	System.out.println(st.top());
	    	System.out.println(st.getMin());
		}

}
