package personalPracticeProblems;

public class P31_ArrayLeftandRightSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n={1,2,3,2,1};
		int leftsum=0;
		int rightsum=0;
		for (int i = 0; i < n.length/2; i++) {
			leftsum+=n[i];
			
		}
		for (int j = n.length/2+1; j < n.length; j++) {
			rightsum+=n[j];
			
		}
		if (leftsum==rightsum)
		{
			System.out.println("Equals");
		}
		

	}

}
