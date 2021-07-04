package personalPracticeProblems;

public class P30_IntegertoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123;
		int org=n;
		int length=0;
		
		while(org>0)
		{
			org=org/10;
			length++;
		}
		System.out.println(length);
		int[] ar=new int[length];
		for (int i = 0; i < length; i++) {
			int rem=n%10;
			ar[length-1-i]=rem;
			n=n/10;
		}
		
		for (int i : ar) {
			System.out.print(i+ " ");
		}
		

	}

}
