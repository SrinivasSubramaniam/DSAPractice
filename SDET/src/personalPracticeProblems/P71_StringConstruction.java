package personalPracticeProblems;

public class P71_StringConstruction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdc";
		System.out.println(s.chars());
		System.out.println(s.chars().distinct());
		long count = s.chars().distinct().count();
		System.out.println(count);

	}

}
