package prefixSuffix;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.junit.Test;

public class ValidParenthesis {
	@Test
	public void test1(){
		String s="()";
		System.out.println(isValid(s));
	}
	public boolean isValid(String s) {
        Map<Character,Character> map=new HashMap<Character,Character>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        Stack<Character> stack=new Stack<Character>();
        for (int i=0;i<s.length();i++){
            if (map.containsKey(s.charAt(i))){
                if (!stack.isEmpty() || stack.pop()!=map.get(s.charAt(i))) return false;
            }
            else stack.push(s.charAt(i));
        }
        return true;
        
    }

}
