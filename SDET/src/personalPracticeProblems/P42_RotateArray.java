package personalPracticeProblems;

public class P42_RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] n={{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(n.length);
		for (int i = 0; i < n.length; i++) {
			
			for (int j = i; j < n.length; j++) {
				int temp=n[i][j];
				n[i][j]=n[j][i];
				n[j][i]=temp;
			}
		}
		/*for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n.length; j++) {
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}*/
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n.length/2; j++) {
				int temp=n[i][j];
				n[i][j]=n[i][n.length-1];
				n[i][n.length-1]=temp;
			}
			
		}
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n.length; j++) {
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
