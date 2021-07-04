package personalPracticeProblems;

public class P12_RecursionString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="This is a good dog";
		String[] sp = s.split(" ");
		String reverseWord="";
		/*for (String word : sp) {
			String reverseWord = reverseWord(word);
			System.out.println(reverseWord);
			
		}*/
		
		for (int i = sp.length-1; i >=0; i--) {
			reverseWord+= reverseWord(sp[i]);
		}
		System.out.println(reverseWord);

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
