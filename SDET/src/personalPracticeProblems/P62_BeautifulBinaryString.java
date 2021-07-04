package personalPracticeProblems;

public class P62_BeautifulBinaryString {

	public static void main(String[] args) {
		// To find number of beautiful strings 010
		String s="0100101010";
		//String replace = s.replace("010", "");
		String replaceAll = s.replaceAll("010", "");
		int count=(s.length()-replaceAll.length())/3;
		System.out.println(count);

	}

}
