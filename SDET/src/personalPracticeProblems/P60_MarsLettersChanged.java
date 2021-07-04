package personalPracticeProblems;

public class P60_MarsLettersChanged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="SOMSPMSQMSOR";
		String s2="SOM";
		int count=0;
		
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i)!=s2.charAt(i%3))
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
