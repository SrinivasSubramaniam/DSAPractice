package dataStructures;



import org.junit.Test;



public class P60_OddLinkedList {
	
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

	    public Node oddEven(Node node) {
	    	if (node == null || node.next == null) return node;	
	        Node oddNode = node;
	        Node evenNode=node.next;
	        Node allEven = evenNode;
	        while (evenNode!=null &evenNode.next!=null){
	        	oddNode.next=evenNode.next;
	        	oddNode=oddNode.next;
	        	evenNode.next=oddNode.next;
	        	evenNode=evenNode.next;
	        }
	        oddNode.next=allEven;
	        return node;
	    }

	    @Test
	    public void test1() {
	        Node head = addNode(1);
	        head.next = addNode(2);
	        head.next.next = addNode(3);
	        head.next.next.next = addNode(4);
	        head.next.next.next.next = addNode(5);
	        head.next.next.next.next.next = addNode(6);
	        Node oddFirst=oddEven(head);
	        printAllNodes(oddFirst);
	    }
	
}
