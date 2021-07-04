package personalPracticeProblems;

public class P72_ReversalWithoutSplit {

	public static void main(String[] args) {
		
		   String word="This is a good day";
		   String reverseWord="";
		   
		   //Adding a space at the end to include the last word
		   word += " "; 

		   int  endPos = word.length() - 1;
		   
		    //reverses every word except the first one
		    for(int i = endPos; i >= 0; i--){
		    	
		    //check for the presence of space and then reverse based on position
		      if(word.charAt(i) == ' '){
		    	  System.out.println(i);
		    	  System.out.println(endPos);
		    	  reverseWord += word.substring(i + 1, endPos + 1);
		    	  System.out.println("This reverse "+reverseWord  );
		    	  endPos = i;
		      }
		    }
		    
		    //Include first word
		    reverseWord += word.substring(0, endPos); 
		    System.out.println(reverseWord);
	}

}
