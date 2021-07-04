package personalPracticeProblems;

public class P28_StringReversalRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="This is a good dog";
		String[] sp = s.split(" ");
		for (String word : sp) {
			String reverseWord = reverseWord(word);
			System.out.println(reverseWord);
			
		}

	}

	private static String reverseWord(String word) {
		if (word.isEmpty())
		{
			return word;
		}else
		{
			return reverseWord(word.substring(1))+Character.toLowerCase(word.charAt(0));
		}
		
	}

}
