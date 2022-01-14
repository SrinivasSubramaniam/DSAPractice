package personalPracticeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P42_RotateArray {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		// TODO Auto-generated method stub
		int[][] ar={{1,2,3},{4,5,6}/*,{7,8,9}*/};
		int m = ar.length;
	    int n = ar[0].length;

	    int[][] transposedMatrix = new int[n][m];
		for(int x = 0; x < n; x++) {
	        for(int y = 0; y < m; y++) {
	            transposedMatrix[x][y] = ar[y][x];
	        }
	    }
		
		System.out.println(Arrays.deepToString(transposedMatrix));

		
		/*System.out.println(n.length);
		for (int i = 0; i < n.length; i++) {
			
			for (int j = i; j < n.length; j++) {
				int temp=n[i][j];
				n[i][j]=n[j][i];
				n[j][i]=temp;
			}
		}
		System.out.println(Arrays.deepToString(n));
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n.length; j++) {
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n.length/2; j++) {
				int temp=n[i][j];
				n[i][j]=n[i][n.length-1];
				n[i][n.length-1]=temp;
			}
			
		}*/
		/*System.out.println(Arrays.deepToString(n));
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n.length; j++) {
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}*/
		

	}

}
