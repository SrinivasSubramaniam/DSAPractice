package onspot;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.junit.Test;

public class DecodeString {
	
	@Test()
	public void test1(){
		String s="3[a]2[bc]";
		System.out.println(decodeString(s));
	}
	@Test()
	public void test2(){
		String s="3[a2[c]]";
		System.out.println(decodeString(s));
	}
	@Test()
	public void test3(){
		String s="3[a]10[b]";
		System.out.println(decodeString(s));
	}
	public String decodeString(String s) {
        Stack<Character> stack=new Stack<Character>();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)!=']') stack.push(s.charAt(i));
            else
            {
                List<Character> list=new ArrayList<Character>();
                while (!stack.isEmpty() && stack.peek()!='['){
                    list.add(stack.pop());
                }
                stack.pop();
                int count=1;
                StringBuilder sbr=new StringBuilder();
                while (!stack.isEmpty() &&Character.isDigit(stack.peek())) {
                	sbr.append(stack.pop());                    
                }
                if (!sbr.equals("")){
                   count= Integer.parseInt(sbr.reverse().toString());
                }
                while (count>0){
                    for (int j=list.size()-1;j>=0;j--){
                        stack.push(list.get(j));
                    }
                    count--;
                }
                    
            }
        }
        StringBuilder sbr=new StringBuilder();
        while (!stack.isEmpty()){
            sbr.append(stack.pop());
        }
        return sbr.reverse().toString();
        
    }

}
