package personalPracticeProblems;

import java.util.Arrays;

public class P65_FunnyStringReverseASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="acxz";
		int len=s.length()-1;
		int[] n1=new int[len];
		int[] n2=new int[len];
		int k=0;
		for (int i = 0; i < s.length()-1; i++) {
			n1[k]=s.charAt(i+1)-s.charAt(i);
			k++;
		}
		int j=0;
		for (int i = s.length()-1; i >0; i--) {
			n2[j]=s.charAt(i)-s.charAt(i-1);
			j++;
		}
		for (int i : n1) {
			System.out.println("n1 is"+ i);
		}
		for (int i : n2) {
			System.out.println("n2 is"+ i);
		}
		if (Arrays.equals(n1, n2))
		{
			System.out.println("Yes it is funny");
		}else
		{
			System.out.println("Not funny");
		}

	}

}
