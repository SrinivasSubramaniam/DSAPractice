package personalPracticeProblems;

import java.io.*;
import java.util.Arrays;

public class P71ArrayUncommonV4 {
 

    public static void main(String[] args)
    {
        int ar1[] = {1,2,4,6};
        int ar2[] = {2,2,6,8,10};
 
        int n = ar1.length;
        int m = ar2.length;
       
        // sort
        Arrays.sort(ar1);
        Arrays.sort(ar2);
       
        int i = 0, j = 0;
        
        while (i < n && j < m) {
 
            if (ar1[i] < ar2[j]) {
            	System.out.print(ar1[i] + " ");
                i++;
            }
 
            else if (ar2[j] < ar1[i]) {
            	System.out.print(ar2[j] + " ");
                j++;
            }
            
            //Skipping equal values
            else {              
                i++;
                j++;
            }
        }
        // printing remaining values
        while (i < n) {
        	System.out.println("i loop");
            System.out.print(ar1[i] + " ");
            i++;
        }
        while (j < m) {
        	System.out.print ("j loop ");
            System.out.print(ar2[j] + " ");
            j++;
        }
    }
}