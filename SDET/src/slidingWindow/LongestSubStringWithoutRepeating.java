package slidingWindow;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class LongestSubStringWithoutRepeating {
	@Test
	public void test1(){
		String s="abba";
		System.out.println(lengthOfLongestSubstring(s));
	}
	
	public int lengthOfLongestSubstring(String s) {
        int max=Integer.MIN_VALUE;
        if (s.length()==0) return 0;
		int left=0;
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for (int right = 0; right < s.length(); right++) {
			if (map.containsKey(s.charAt(right))) {
                //left=map.get(s.charAt(right))+1;
				left=Math.max(left, map.get(s.charAt(right))+1);//abba
			}
				map.put(s.charAt(right), right);
				max=Math.max(max, (right-left)+1);
				
		}
		return max;
        
        /*if(s.length()==0) return 0;
        Set<Character> set = new HashSet<>();
        int left = 0,right=0,max=0;
        while(right<s.length()){
            if(set.contains(s.charAt(right))){
                set.remove(s.charAt(left++));
            } else {
                set.add(s.charAt(right++));
                max = Math.max(max, right-left);
            }
        }
        return max;*/
        
    }
}


