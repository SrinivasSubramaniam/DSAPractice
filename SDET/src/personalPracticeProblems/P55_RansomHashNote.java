package personalPracticeProblems;

import java.util.LinkedHashMap;
import java.util.Map;

public class P55_RansomHashNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="give me one grand today night";
		String s2="give one one grand today";
		String[] magazine=s1.split(" ");
		String[] note=s2.split(" ");
		if (canBuildRansom(magazine,note))
		{
			System.out.println("Yes we can build");
		}else
		{
			System.out.println("No we cant build");
		}

	}

	public static boolean canBuildRansom(String[] magazine, String[] note) {
		// TODO Auto-generated method stub
		Map<String, Integer> magazinemap=getFrequency(magazine);
		Map<String, Integer> notemap=getFrequency(note);
		return possibleRansom(magazinemap,notemap);
		
	}

	public static boolean possibleRansom(Map<String, Integer> magazinemap, Map<String, Integer> notemap) {
		// TODO Auto-generated method stub
		for(Map.Entry<String, Integer> note:notemap.entrySet())
		{
			String word = note.getKey();
			if (!magazinemap.containsKey(word)||magazinemap.get(word)<note.getValue())
			{
				return false;
			}
		}
		return true;
	}

	public static boolean possibleRansom() {
		// TODO Auto-generated method stub
		return false;
	}

	public static Map<String, Integer> getFrequency(String[] word) {
		// TODO Auto-generated method stub
		Map<String, Integer> map =new LinkedHashMap<String, Integer>();
		for (String s : word) {
			
			if (map.containsKey(s))
			{
				map.put(s, map.get(s)+1);
			}else
			{
				map.put(s, 1);
			}
		}
		return map;
	}

}
