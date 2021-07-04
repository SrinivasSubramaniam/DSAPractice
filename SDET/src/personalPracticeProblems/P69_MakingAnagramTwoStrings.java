package personalPracticeProblems;

public class P69_MakingAnagramTwoStrings {

	public static void main(String[] args) {
		// In Two Strings count the strings to be deleted to make anagram
		String s1="abc";
		String s2="cde";
		int[] n=new int [26];
		int count=0;
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(s1.charAt(i)-'a');
			n[s1.charAt(i)-'a']++;
		}
		for (int i = 0; i < s2.length(); i++) {
			n[s2.charAt(i)-'a']--;
		}
		for (int i : n) {
			count+=Math.abs(i);
		}
		System.out.println(count);
		

	}

}
