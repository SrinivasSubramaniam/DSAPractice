package personalPracticeProblems;

public class P52_BubbleSortingSwap {

	public static void main(String[] args) {
		// To find the swap count required to do bubble sorting
		int[] n={3,2,1};
		int count=0;
		boolean flag=false;
		while (flag!=true)
		{
			flag=true;
			for (int i = 0; i < n.length-1; i++) {
				if (n[i]>n[i+1])
				{
					int temp=n[i];
					n[i]=n[i+1];
					n[i+1]=temp;
					count++;
					flag=false;
				}
			}
		}
		System.out.println(count);
		for (int i : n) {
			System.out.println(i);
		}
		
	}

}
