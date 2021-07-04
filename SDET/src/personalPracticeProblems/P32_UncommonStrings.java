package personalPracticeProblems;

public class P32_UncommonStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
				String s1="aabde";
				String s2="cbaz";
				String uncommon="";
				
				
				for (int i = 0; i < s1.length(); i++) {
					boolean flag=true;
					for (int j = 0; j < s2.length(); j++) {
						if (s1.charAt(i)==s2.charAt(j)) {
							flag= false;
						}
						
					}
					if (flag==true)
					{
						uncommon=uncommon+s1.charAt(i);
					}
				}
				for (int i = 0; i < s2.length(); i++) {
					boolean flag=true;
					for (int j = 0; j < s1.length(); j++) {
						if (s2.charAt(i)==s1.charAt(j)) {
							flag= false;
						}
						
					}
					if (flag==true)
					{
						uncommon=uncommon+s2.charAt(i);
					}
					
				}
				System.out.println(uncommon);
				


	}

}
