package dataStructures;

import java.util.LinkedList;

import org.junit.Test;


public class P59_MergeLinkedList {
	
	Node head;
	//When creating a new Node
	 public class Node{
		 int value;
		 Node next;
		 Node (){
			 
			 next=null;
		 }
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
	 
	 public Node merged(Node node1,Node node2){
		 
		 
		 Node head=new Node();
		 Node prev=head;
		 while (node1!=null && node2!=null){
			 if (node1.value<node2.value){
				 prev.next=node1;
				 node1=node1.next;
			 }else{
				 prev.next=node2;
				 node2=node2.next;
			 }
			 prev=prev.next;//we are moving only the previous index not the head head is 
			 //holding the value internally
			 //only we are moving the previous not the previous.next and hence
			 //head wont get changed
		 }
		 //for any left out nodes
		 prev.next=node1==null? node2:node1;
		 return head.next;
	 }
/*public Node merged(Node node1,Node node2){
		 
		 Node head=addNote(5);
		 Node prev=head;
		 head.next=addNote(10);
		 prev=prev.next;
		 head.next=addNote(15);
		 head.next=addNote(20);
		 //for any left out nodes
		 prev.next=node1==null? node2:node1;
		 return head.next;
	 }*/
	 
	 
	 public Node mergedLinkesList(Node node1,Node node2){
		 if (node1==null) return node2;
		 if (node2==null) return node1;
		 if (node1.value<node2.value){
			 node1.next=mergedLinkesList(node1.next, node2);
			 return node1;
		 }else {
			 node2.next=mergedLinkesList(node1, node2.next);
			 return node2;
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
		 
		 return prev;
	 }
	 @Test
	 public void test1(){
		 Node head1 = addNote(1);
		 head1.next=addNote(3);
		 head1.next.next=addNote(5);
		 
		 Node head2=addNote(2);
		 head2.next=addNote(4);
		 head2.next.next=addNote(6);
		 
		 Node merged = merged(head1, head2);
		 printAllNodes(merged);
		 
	 }
	
}
