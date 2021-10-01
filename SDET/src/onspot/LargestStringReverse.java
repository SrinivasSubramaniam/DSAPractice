package onspot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class LargestStringReverse {
	
	/*
	 * * Given a string and max duplicate occurrence of each char as k return the 
	 * largest string in alphabetically largest order either by deleting or re-ordering
	 * the char position based on k value
	 * 
	 * 1) Input-
	 * Output -  
	 * Constraints- 
	 *
	 * 2) Test Data
	 *
	 * Positive data -
	 * Negative data
	 * Edge Case
	 * 
	 * 3) Methods to Solve-
	 * 
	 * 4) O Notations-
	 * 
	 * 5) Psuedo code
	 */

	/*
	 * 
	 *
	 * 
	 * PsuedoCode: 
	 * Code: 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	@Test
	public void test1() {
		String str="zzzzza";
		int k=2;
		System.out.println(findLargetString(str,k));
	}
	@Test
	public void test2() {
		String str="zzzzzaa";
		int k=2;
		System.out.println(findLargetString(str,k));
	}

	private String findLargetString(String str, int k) {
		StringBuilder sbr = new StringBuilder();
		int[] ascii = new int[26];
		for (int i = 0; i < str.length(); i++) {
			ascii[str.charAt(i) - 'a']++;
		}
		for (int i = ascii.length - 1; i >= 0; i--) {
			if (ascii[i] > k) {
				int temp = k;
				while (temp-- > 0) {
					sbr.append((char) (i + 97));
					ascii[i]--;
				}
				for (int j = i - 1; j >= 0; j--) {
					if (ascii[j] > 0) {
						sbr.append((char) (j + 97));
						ascii[j]--;
						break;
					}
				}
				i++;
			} else if (ascii[i] > 0 && ascii[i] <= k && (char) (i + 97) != sbr.charAt(sbr.length() - 1)) {
				while (ascii[i]-- > 0) {
					sbr.append((char) (i + 97));
				}
			}

		}
		return sbr.toString();
	}
	
	private static String largestString(String s, int k) {
		char[] chs = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		StringBuilder sb = new StringBuilder();

		for (char ch : chs) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		Set<Entry<Character, Integer>> set = map.entrySet();
		ArrayList<Entry<Character, Integer>> list = new ArrayList<>(set);
		Collections.sort(list, (a, b) -> (b.getKey().compareTo(a.getKey()))); // nlogn

		int i = 0;
		while (i < list.size()) {
			Entry<Character, Integer> firstEntry = list.get(i);
			char firstKey = firstEntry.getKey();
			int firstVal = firstEntry.getValue();

			if (firstVal > k) {
				// reduce by k
				int count = 0;
				while (count < k) {
					sb.append(firstKey);
					count++;
				}
				firstEntry.setValue(firstVal - k);

				// Just add 1 next character
				Entry<Character, Integer> secondEntry = list.get(i + 1);
				char secondKey = secondEntry.getKey();
				int secondVal = secondEntry.getValue();

				if (secondVal > 0) {
					sb.append(secondKey);
					secondEntry.setValue(secondVal - 1);
				}
			} else if (firstVal > 0 && firstVal <= k) {
				int count = 0;
				while (count < firstVal) {
					sb.append(firstKey);
					count++;
				}
				firstEntry.setValue(0);
			} else {// firstVal == 0
				i++;
			}
		}

		return sb.toString();
	}
}



