package personalPracticeProblems;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class P70_GameofPalindrome {

	public static void main(String[] args) {
		// To find if the string can be rearranged to form palindrome
		String s="aaacc";int odd=0;
		int even=0;
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i)))
			{
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}else
			{
				map.put(s.charAt(i), 1);
			}
		}
		
		Set<Character> keySet = map.keySet();
		Collection<Integer> values = map.values();
		Iterator<Integer> itr = values.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		for (Integer value : map.values()) {
			if (value%2==1)
			{
				odd++;
				continue;
			}
			if (value%2==0)
			{
				even++;
			}
			
		}
		if (odd>1)
		{
			System.out.println("No- Can't be rearranged to form Palindrome");
		}else
		{
			System.out.println("Yes- Can be rearranged to form Palindrome");
		}

	}

}
