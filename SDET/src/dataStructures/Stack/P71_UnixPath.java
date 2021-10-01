package dataStructures.Stack;

import java.util.Stack;

import org.junit.*;


public class P71_UnixPath {
	/*
	 *
	 *Given a string path, which is an absolute path (starting with a slash '/') to a file 
	 *or directory in a Unix-style file system, convert it to the simplified canonical path.
In a Unix-style file system, a period '.' refers to the current directory, a double period '..' 
refers to the directory up a level, and any multiple consecutive slashes (i.e. '//') are treated as a single slash '/'. 
For this problem, any other format of periods such as '...' are treated as file/directory names.
The canonical path should have the following format:
The path starts with a single slash '/'.
Any two directories are separated by a single slash '/'.
The path does not end with a trailing '/'.
The path only contains the directories on the path from the root directory to the target file or directory (i.e., no period '.' or double period '..')
Return the simplified canonical path.
 
 
 //Find out when you should push to stack , pop from stack and when to skip !! 
  *  /  - pop
  *  // absolute path -- /
  *  . current directory - ignore
  *  .. one directory upper -- pop
  *  ... file or directory names
  *  
  *  
Example 1:
Input: path = "/home/"
Output: "/home"
Explanation: Note that there is no trailing slash after the last directory

Example 2:

Input: path = "/../"
Output: "/"
Explanation: Going one level up from the root directory is a no-op, as the root level is the highest level you can go.
Example 3:

Input: path = "/home//foo/"
Output: "/home/foo"
Explanation: In the canonical path, multiple consecutive slashes are replaced by a single one.
Example 4:

Input: path = "/a/./b/../../c/"
Output: "/c"

	 * 
	 * 
	 * 1)What is the input(s)? - String
	 * What is the expected output? String
	 * Do I have constraints to solve the problem? -
	 * Do I have all informations to go to next step!! 
	 * How big is your test data set will be?
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !!
	 * 
	 * Positive data- 
	 * Negative data- 
	 * Edge Case-
	 * 
	 * Validate the data set with the interviewer
	 *
	 * 3) Do I know how to solver it? - yes Yes - great, Is there any alternate
	 * solution?-
	 *
	 * 4) Ask for the hint (If you don't know how to solve it)
	 *
	 *
	 * 5) Do I know alternate solution to solve this problem?
	 * 
	 * 6) If you know alternate solutions-> find out the O notations
	 * (performance) Then explain the both or the best (depends on the time) 1
	 * 
	 * 
	 * Approach 1-> Start with the worst -> Improve to optimize -> End up with
	 * the best Approach 2-> Write down the options and benefits and code the
	 * best
	 * 
	 * 7) Start with the Pseudo code
	 * 
	 * 8) Implement them in the code (editor)
	 * 
	 * 9) Test against the different data set
	 * 
	 * 10) If it fails, debug them to solve it
	 *
	 *
	 *
	 * /
	 */
	@Test
    public void test1(){
        String str="/home/";
        Assert.assertEquals(findX(str),"/home");
        
    }
	@Test
    public void test2(){
        String str="/a/./b/../../c/";
        Assert.assertEquals(findX(str),"/c");
        
    }
	@Test
    public void test3(){
        String str="/home//foo/";
        Assert.assertEquals(findX(str),"/home/foo");
        
    }
	@Test
    public void test4(){
        String str="/../";
        Assert.assertEquals(findX(str),"/");
        
    }
	
	/*Psuedo code
	 * Split the string based on / and store it to char array
	 * Create a stack to hold the directory names
	 * Iterate the character array
	 * Check if the directory is not equal to . or null push
	 * else if directory is .. and not empty then pop
	 * Iterate through the stack and append the / at the beginning of each directory
	 * 
	 * 
	 */
	private String findX(String str){
		String[] split = str.split("/");
		Stack<String> stack=new Stack<String>();
		for (String eachString : split) {
			if (eachString.equals(".")||eachString.isEmpty()){
				continue; 
			}else if(eachString.equals("..")){
				if (!stack.isEmpty())
				stack.pop();			
			}else {
				stack.push(eachString);
			}
		}
		StringBuffer sb=new StringBuffer();
		if (stack.isEmpty()) sb.insert(0, "/");
		while (!stack.isEmpty()){
			sb.insert(0, stack.pop());
			sb.insert(0, "/");
		}
		
		System.out.println(sb);
		return sb.toString();
	}
}
