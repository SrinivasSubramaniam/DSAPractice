package personalPracticeProblems;

public class P67_MakingPalindromeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="bbeadcebfp";
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
