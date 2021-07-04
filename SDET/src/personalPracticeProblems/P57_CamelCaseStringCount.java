package personalPracticeProblems;

public class P57_CamelCaseStringCount {

	public static void main(String[] args) {
		//Find the camel case count
		String s="saveChangesInTheEditor";
		String[] split = s.split("[A-Z]");
		System.out.println(split.length);
		

	}

}
