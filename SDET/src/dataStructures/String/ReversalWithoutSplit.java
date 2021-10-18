package dataStructures.String;

public class ReversalWithoutSplit {

	public static void main(String[] args) {
		
		   String word="This is a good day";
		   String reverseWord="";
		   
		   //Adding a space at the end to include the last word
		   word = " "+word+" "; 

		   int  endPos = word.length() - 1;
		   
		    //reverses every word except the first one
		    for(int i = endPos; i >= 0; i--){
		    	
		    //check for the presence of space and then reverse based on position
		      if(word.charAt(i) == ' '){
		    	  reverseWord += word.substring(i + 1, endPos + 1);
		    	  endPos = i;
		      }
		    }
		    
		    /*//Include first word
		    reverseWord += word.substring(0, endPos);*/ 
		    System.out.println(reverseWord);
	}

}
