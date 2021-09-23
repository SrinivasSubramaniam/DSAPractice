package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StackImpleArr156 {
	
	/*Psuedo code
	 * Create array of max length in constructor
	 * create a index to hold the current index
	 * push- add value to current Index and increment
	 * pop- decrement current index
	 * top- look value of index-1
	 * getMin- iterate the array till index and return minimum value
	 * 
	 * Time complexity- O(n)
	 * Space Complexity- O(30000)
	 * 
	 * 
	 * 
	 * Psuedo code- 5 mins
	 * Code- 10 mins
	 * debug- 5 mins
	 * 
	 */
	
	 private int[] arr;
	    //int min=Integer.MAX_VALUE;
	    int index=0;
	    /** initialize your data structure here. */
	    public StackImpleArr156() {
	        this.arr=new int[30000];
	        
	    }
	    
	    public void push(int val) {
	        arr[index]=val;
	        index++;
	        
	    }
	    
	    public void pop() {
	    	index--;
	        
	    }
	    
	    public int top() {
	        return arr[index-1];
	    }
	    
	    public int getMin() {
	    	int min=Integer.MAX_VALUE;
	    	for (int i=0;i<index;i++){
	    		if(arr[i]<min)
	    			min=arr[i];
	    	}
	    	
	        return min;
	    }
	    
	    public static void main(String[] args) {
	    	StackImpleArr156 st=new StackImpleArr156();
	    	st.push(-2);
	    	st.push(0);
	    	st.push(-3);
	    	System.out.println(st.getMin());
	    	st.pop();
	    	System.out.println(st.top());
	    	System.out.println(st.getMin());
		}

}
