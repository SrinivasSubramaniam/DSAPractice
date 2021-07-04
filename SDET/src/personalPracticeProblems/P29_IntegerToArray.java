package personalPracticeProblems;

public class P29_IntegerToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123;
		String s = Integer.toString(n);
		int[] ar=new int[s.length()];
		
		for (int i = 0; i < s.length(); i++) {
			ar[i]=s.charAt(i)-'0';
			
		}
		
		for (int i : ar) {
			System.out.print(i+" ");
		}

	}

}
