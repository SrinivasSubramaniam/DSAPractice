package personalPracticeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P71ArrayUncommon1V1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1={1,2,4,6};
		int[] arr2={2,2,6,8,10};
        boolean isfound = false;
        
        for(int i = 0; i < arr1.length; i++) 
        { 
            isfound = false;
             
            for(int j = 0; j < arr2.length; j++) 
            { 
                if(arr1[i]==arr2[j])
                {
                    isfound = true;
                    break;
                }
         
            } 
            if(!isfound) 
            { 
                System.out.println(":::::"+arr1[i]);
            }
           
        }
        for(int i = 0; i < arr2.length; i++) 
        { 
            isfound = false;
             
            for(int j = 0; j < arr1.length; j++) 
            { 
                if(arr2[i]==arr1[j])
                {
                    isfound = true;
                    break;
                }
            } 
            if(!isfound) 
            { 
                System.out.println(":::::"+arr2[i]);
                 
            } 
        }
         

	}

}
