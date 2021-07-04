package personalPracticeProblems;

public class P23_StringToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="He is a very very good boy, isn't he?";
		String[] split = s.split("[ ,'?]+");
		System.out.println(split.length);
		for (String string : split) {
			System.out.println(string);
		}

	}

}
