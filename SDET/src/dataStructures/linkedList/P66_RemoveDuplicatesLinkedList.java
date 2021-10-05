package dataStructures.linkedList;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

import javax.print.attribute.HashAttributeSet;

import org.junit.*;


public class P66_RemoveDuplicatesLinkedList {
	/*
	 *
	 * 
	 * 
	 * 1)What is the input(s)? - 
	 * What is the expected output? 
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
	public class Node{
        int value;
        Node next;
        Node(int key){
            this.value = key;
            next = null;
        }
        Node(){
            next = null;
        }
    }
    public Node addNode(int key) {
        return new Node(key);
    }


    public void printAllNodes(Node node) {
        while(node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }
    
    /*
     * Psuedo code
     * Initalize a oddNode to hold the reference of node
     * Initialize a evenNode to hold the reference of node next reference
     * Initialize allEvene node and assign evenNode values
     * Do a while loop to check if evenNode and evenNode.next is not null
     * Assign even evenNode next to oddNode next and thus to node
     * Assign OddNode next to oddNode
     * Assign odd Node next to even node next
     * Assign evenNode next to evenNode
     * Finally make odd.next all to allEven
     * return node
     * 
     * 
     */

    public Node oddEven(Node head) {
    	
    	  // Write your code here
	    Node outputNode = new Node();  
	    Node tmp = outputNode;
        HashSet<Integer> set = new HashSet<>();
        while(head!=null){
              if(set.contains(head.value)){
                  head = head.next;
                  tmp.next = null;
              }else{
                  set.add(head.value);
                  tmp.next = head;
                  head = head.next;
                  tmp = tmp.next;
              }
              
          }
        
        return outputNode.next;  

        
    }

    @Test
    public void test1() {
        Node head = addNode(3);
        head.next = addNode(4);
        head.next.next = addNode(3);
        head.next.next.next = addNode(1);
        head.next.next.next.next = addNode(5);
        head.next.next.next.next.next = addNode(1);
        Node oddFirst=oddEven(head);
        printAllNodes(oddFirst);
    }
}
