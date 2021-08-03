package dataStructures;

import java.util.LinkedList;

public class P58_Node {
	
	/*
	 * Node,value
	 * 
	 */
	
	Node head;
	//When creating a new Node
	 public class Node{
		 int value;
		 Node next;
		 //Node prev;
		 
		 Node (int val){
			 this.value=val;
			 next=null;
		 }
	 }
	 
	 public Node addNote(int val){
		 Node newNode=new Node(val);
		 System.out.println(newNode.next);
		 //Not needed to be set Null explicitly in this 
		 //case it is parameterised constructor
		 //newNode.next=null;
		 return newNode;
	 }
	 
	
}
