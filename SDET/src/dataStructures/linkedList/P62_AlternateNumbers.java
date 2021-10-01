package dataStructures.linkedList;

import java.util.LinkedList;

import org.junit.Test;

public class P62_AlternateNumbers {
	
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

	    public Node printOddNodes(Node node) {
	        Node oddNode = new Node();
	        Node current = oddNode;


	        while(node != null) {
	        	if (node.next.next==null) {
	        		node.next=null;
	        		current.next = node;
	        		break;
	        	}
	            current.next = node;
	            node = node.next.next;
	            current = current.next;
	            
	        }
	        //if current.next=
	        return oddNode.next;
	    }

	    @Test
	    public void test1() {
	        Node head = addNode(1);
	        head.next = addNode(2);
	        head.next.next = addNode(3);
	        head.next.next.next = addNode(4);
	        head.next.next.next.next = addNode(5);
	        head.next.next.next.next.next = addNode(6);
	        printAllNodes(printOddNodes(head));
	    }
	
}
