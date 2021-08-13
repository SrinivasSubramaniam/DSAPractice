package dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.*;

public class P9911_oddEvenPractice {
	Node head;

	public class Node {
		Node next;
		int value;

		public Node() {
			this.next = null;
		}

		public Node(int val) {
			this.value = val;
		}

	}

	public Node addNode(int value) {
		return new Node(value);
	}

	public void printNodes(Node head) {
		while (head != null) {
			System.out.println(head.value);
			head = head.next;
		}
	}
	
	public Node oddEvenNode(Node node){
		Node head=new Node();
		head.next=node;
		
		Node oddNode=head,EvenNode=head;
		
		while (node!=null){
			if (node.value%2!=0){
				oddNode.next=node.next;
				oddNode=oddNode.next;
				node=node.next;
				
			}
			else{
				EvenNode.next=node.next;
				EvenNode=EvenNode.next;
				node=node.next;
			}
		}
		printNodes(oddNode);
		printNodes(EvenNode);
		return oddNode;
		
	}
	

	@Test
	public void test1() {
		Node head = addNode(1);
		head.next=addNode(2);
		head.next.next=addNode(3);
		head.next.next.next=addNode(4);
		head.next.next.next.next=addNode(5);
		head.next.next.next.next.next=addNode(6);
		head.next.next.next.next.next.next=addNode(7);
		head.next.next.next.next.next.next.next=addNode(8);
		oddEvenNode(head);
		//printNodes(head);
	}
}
