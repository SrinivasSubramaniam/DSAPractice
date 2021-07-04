package personalPracticeProblems;

public class P45_ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int first=1;
		int second=2;
		int third=0;
		int n=4;
		
		for (int i = 3; i <= n; i++) {
			third=first+second;
			first=second;
			second=third;
		}
		System.out.println(second);

	}

}
