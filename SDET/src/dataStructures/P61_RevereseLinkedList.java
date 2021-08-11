package dataStructures;

import java.util.LinkedList;

import org.junit.Test;

public class P61_RevereseLinkedList {
	
	//Node head;
	//When creating a new Node
	 public class Node{
		 int value;
		 Node next;
		 
		 Node (int val){
			 this.value=val;
			 next=null;
		 }
	 }
	 
	 public Node addNote(int val){
		 return new Node(val);
	 }
	 
	 public void printAllNodes(Node node){
		 while (node!=null){
			 System.out.println(node.value);
			 node=node.next;//reposition the node to see all the values
		 }
	 }
	 
	 //reverse the node
	 public Node reverseNode(Node node){
		 Node curr=node; //current node
		 Node prev=null; //don't know what would be
		 Node next=null; //don't know what would be
		 while (curr!=null){
			 next=curr.next;
			 curr.next=prev;
			 prev=curr;
			 curr=next;
			 
		 }
		  // 1 3 5  --> 5 3 1 
		 return prev;
	 }
	 
	 @Test
	 public void test1(){// 1 next-> value 3 next-> value 5 next-> null
		 Node head = addNote(1);
		 head.next=addNote(3);
		 head.next.next=addNote(5);
		 Node node=reverseNode(head);
		 printAllNodes(node);
	 }
	
}
