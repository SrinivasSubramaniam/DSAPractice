package interview;

import java.util.HashSet;

import org.junit.Test;

public class MerNode {
	
	public class Node{
	Node next;
	int value;
	public Node() {
		next = null;
	}

	public Node(int val) {
		this.value = val;
		next = null;
	}
	}

	public Node addNode(int val){
		return new Node(val);
	}
	

	public void printAllNodes(Node node){
		while(node!=null){
			System.out.println(node.value);
			node=node.next;
		}
	}
	

		public Node mergeNode(Node node1, Node node2) {
			Node head = new Node();
			Node prev = head;

			while (node1 != null && node2 != null) {
				if (node1.value < node2.value) {
					prev.next = node1;
					node1 = node1.next;
				} else {
					prev.next = node2;
					node2 = node2.next;
				}
				prev = prev.next;
			}
			prev.next = node1 == null ? node2 : node1;
			return head.next;

		}
		public Node reverse(Node node) {
			Node current = node;
			Node prev = null;
			Node next=null;
			
			while (current!=null){
				next=current.next;
				current.next=prev;
				prev=current;
				current=next;				
			}

			return prev;

		}
		public Node oddEven(Node node) {
			Node oddNode = node;
			Node evenNode = node.next;
			Node allEven=evenNode;
			
			while (evenNode!=null && evenNode.next!=null){
				oddNode.next=evenNode.next;
				oddNode=oddNode.next;
				evenNode.next=oddNode.next;
				evenNode=evenNode.next;
			}
			oddNode.next=allEven;
			return node;

		}
		public Node alternateNumbers(Node node) {
			 Node oddNode=node, evenNode=node.next;
		        while (evenNode!=null && evenNode.next!=null){
		            node.next=evenNode.next;
		            node=node.next;
		            evenNode.next=node.next;
		            evenNode=evenNode.next;
		            node.next=null;
		        }

		        return oddNode;
		}
		public Node removeDuplicates(Node node) {
			Node outPut = new Node();
			Node current=outPut;
			HashSet<Integer> set=new HashSet<>();
			
			while (node!=null){
				if (set.contains(node.value)){
					current.next=null;
					node=node.next;
					
				}else{
					set.add(node.value);
					current.next=node;
					node=node.next;
					current=current.next;
				}
			}
			//System.out.println(set);
			return outPut.next;
		}
		public int findMiddleNode(Node node) {
			Node fast=node;
			Node slow=fast;
			while (fast!=null && fast.next!=null){
				fast=fast.next.next;
				slow=slow.next;
			}
			return slow.value;
		}
		 private Node printEvenNodes(Node node){
		        Node even=node.next, newNode=even;
		        while (even!=null && even.next!=null){
		            node.next=even.next;
		            node=node.next;
		            even.next=node.next;
		            even=even.next;
		        }
		        return newNode;
		  }
		
		@Test
		public void test1() {

			Node node1 = addNode(1);
			node1.next = addNode(2);
			node1.next.next = addNode(3);
			node1.next.next.next = addNode(4);
			node1.next.next.next.next = addNode(5);
			node1.next.next.next.next.next = addNode(6);
			node1.next.next.next.next.next.next = addNode(3);
			

			Node node2 = addNode(2);
			node2.next = addNode(4);
			node2.next.next = addNode(6);

			/*Node outPut = mergeNode(node1, node2);
			printAllNodes(outPut);*/
			
			/*Node outPut=reverse(node1);
			printAllNodes(outPut);*/
			/*Node outPut=alternateNumbers(node1);
			printAllNodes(outPut);*/
			/*Node outPut=removeDuplicates(node1);
			printAllNodes(outPut);*/
			/*System.out.println(findMiddleNode(node1));*/
			Node outPut=printEvenNodes(node1);
			printAllNodes(outPut);

		}
	}
