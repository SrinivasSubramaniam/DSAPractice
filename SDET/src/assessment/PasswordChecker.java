package assessment;
import java.util.*;
import org.junit.*;
public class PasswordChecker {
	
	@Test
	public void test1(){
		String s="!@#$%^&*Aa1";
		System.out.println(passwordCheck(s));
	}
	@Test
	public void test2(){
		String s="''''''''''''''''";
		System.out.println(passwordCheck(s));
	}

	
	public String passwordCheck(String line){
	        int lower = 0, upper = 0,
	                digit = 0, otherChars = 0;
	        Set<Character> set = new HashSet<Character>(
	            Arrays.asList('!', '"','#','$','%','&','(',')','*','+',',','-','.','/',':',';','<',
	            		'=','>','?','@','[',']','\\','^','_','`','\''));
	        for (char i : line.toCharArray())
	        {
	            if (Character.isLowerCase(i))
	            	lower++;
	            else if (Character.isUpperCase(i))
	            	upper++;
	            else if (Character.isDigit(i))
	            	digit++;
	            else if (set.contains(i))
	            	otherChars++;
	            else if (!set.contains(i)) return " Invalid";
	        }
	       
	        if (line.length() < 6 && line.length() > 25) return " Invalid";
	        if (digit!=0 && lower!=0 && upper!=0 && otherChars!=0 && (line.length() >= 10)) return " Strong";
	        else if ((lower!=0 && upper!=0 && otherChars!=0) && (line.length() >= 8)) return " Moderate";
	        else return " Weak";
	}
}
