package personalPracticeProblems;

public class P47_HourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] n={{1,1,1,0,0,0},{0,1,0,0,0,0},{1,1,1,0,0,0},{0,0,0,6,5,8},{0,0,0,9,4,3},{0,0,0,6,2,1}};
		int sum=0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int currentsum=n[i][j]+n[i][j+1]+n[i][j+2]
						+n[i+1][j]+n[i+1][j+1]+n[i+1][j+2]
						+n[i+2][j]+n[i+2][j+1]+n[i+2][j+2];
				
				if (currentsum>sum)
				{
					sum=currentsum;
				}
			}
			
		}
		System.out.println(sum);
		

	}

}
