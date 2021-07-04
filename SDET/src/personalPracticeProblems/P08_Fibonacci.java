package personalPracticeProblems;

public class P08_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0;
		int n2=1;
		int length=5;
		int n3;
		System.out.print(n1+ " "+n2+ " ");
		for (int i = 0; i < length; i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(n3+ " ");
		}

	}

}
