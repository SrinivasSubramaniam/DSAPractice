package personalPracticeProblems;

import java.util.LinkedHashMap;
import java.util.Map;

public class P14_CharacterOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="Welcome to automation";
		String s = word.replace(" ", "");
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i)))
			{
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}else
			{
				map.put(s.charAt(i), 1);
			}
		}
		//System.out.println(map);
		for (Map.Entry<Character, Integer> c : map.entrySet()) {
			System.out.println(c.getKey()+" ---> "+ c.getValue());
			
		}

	}

}
