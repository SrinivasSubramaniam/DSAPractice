package onspot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.junit.Assert;
import org.junit.Test;

public class SecondLeastCharacter {
	@Test
	public void test1(){
		String str="hello there";
		Assert.assertEquals('o', findSecond(str));
	}

	
	private char findSecond(String str) {
		
		Map<Character,Integer> map=new TreeMap<Character,Integer>();
		for (char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);			
		}
		List<Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list, (a,b)-> a.getValue()-b.getValue()/*a.getValue().compareTo(b.getValue())*/);
		System.out.println(list);		
		return list.get(1).getKey();
	}

}
