package personalPracticeProblems;

public class P50_AlternateCharacters {

	public static void main(String[] args) {
		// Deletions required string not alternate
		
		String s="ABABABAB";
		int count=0;
		for (int i = 0; i < s.length()-1; i++) {
			if (s.charAt(i)==s.charAt(i+1))
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
