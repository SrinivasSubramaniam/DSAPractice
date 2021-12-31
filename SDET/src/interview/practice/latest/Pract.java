package interview.practice.latest;

public class Pract {
public static void main(String[] args) {
	String s1="java";
	String s3="java";
	String s2=new String("java");
	String s4=new String("java");
	String intern = s3.intern();
	System.out.println(s1==s2);
	System.out.println(s2==s4);
}
}
