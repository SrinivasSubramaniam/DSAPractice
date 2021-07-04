package personalPracticeProblems;

public class P36_RotateArrayRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n={1,2,3,4,5,6,7};
		int k=3%n.length;
		int prev=0;
		for (int i = 0; i < k; i++) {
			prev=n[n.length-1];
			for (int j = 0; j < n.length; j++) {
				int temp=n[j];
				n[j]=prev;
				prev=temp;
				
			}
		}
		for (int i : n) {
			System.out.print(i+" ");
		}

	}

}
