package personalPracticeProblems;

public class P13_MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n={1,4,3,7,9,2};
		int smallest=n[0];
		int largest=n[0];
		for (int i = 0; i < n.length; i++) {
			if (n[i]<smallest)
			{
				smallest=n[i];
			}
			if(n[i]>largest)
			{
				largest=n[i];
			}
		}
		System.out.println(smallest);
		System.out.println(largest);
		

	}

}
