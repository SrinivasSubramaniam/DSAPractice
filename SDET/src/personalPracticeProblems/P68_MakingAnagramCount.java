package personalPracticeProblems;

public class P68_MakingAnagramCount {

	public static void main(String[] args) {
		// Count the characters to be deleted to make String a anagram
		String s="aaabbb";
		if (s.length()%2!=0)
		{
			System.out.println("Can't make it to Anagram");
		}else
		{
			int i=0;
			int j=s.length()-1;
			int count=0;
			while (i<j)
			{
				count+=Math.abs(s.charAt(i)-s.charAt(j));
				i++;
				j--;
			}
			System.out.println(count);
		}
		

	}

}
