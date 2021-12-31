package interview.practice;

import org.junit.Test;


public class PracticeNode {
	//Node head;
	public class Node{
		Node next;
		int value;

		public Node() {
			this.next = null;
		}

		public Node(int val) {
			this.value = val;
			next = null;
		}
	}

		public Node addNode(int val){
			return new Node(val);
		}

		public void printNodes(Node node){
			while(node!=null){
				System.out.println(node.value);
				node=node.next;
			}
		}

		public Node mergeNode(Node node1,Node node2){
				Node head=new Node();
				Node prev=head;
				while(node1!=null && node2!=null){
					if (node1.value<node2.value){
						prev.next=node1;
						node1=node1.next;
					}else{
						prev.next=node2;
						node2=node2.next;
					}
					prev=prev.next;
				}
				prev.next=node1== null?node2:node1;
				return head.next;
			}
		public Node reveseNode(Node node){
			Node current=node;
			Node prev=null;
			Node next=null;
			while (current!=null ){
					next=current.next;
					current.next=prev;
					prev=current;
					current=next;				
			}			
			return prev;
		}
		public Node oddEvenNode(Node node){
			Node oddNode=node;
			Node evenNode=node.next;
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
		public Node evenNode(Node node){
			Node evenNode=node.next;
			Node allEven=evenNode;
			while (evenNode!=null && evenNode.next!=null){
				node.next=evenNode.next;
				node=node.next;
				evenNode.next=node.next;
				evenNode=evenNode.next;
				
			}
			//node.next=allEven;
			return allEven;
		}
		public Node oddNode(Node node){
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
	
	@Test
	public void test1(){
		/*Node head1=addNode(1);
		head1.next=addNode(3);
		head1.next.next=addNode(5);
		head1.next.next.next=addNode(7);
		
		Node head2=addNode(2);
		head2.next=addNode(4);
		head2.next.next=addNode(6);
		head2.next.next.next=addNode(8);*/
		
		/*Node node = mergeNode(head1, head2);
		printNodes(node);*/
		Node head1=addNode(1);
		head1.next=addNode(2);
		head1.next.next=addNode(3);
		head1.next.next.next=addNode(4);
		head1.next.next.next.next=addNode(5);
		head1.next.next.next.next.next=addNode(6);
		/*oddEvenNode(head1);
		printNodes(head1);*/
		/*Node node=reveseNode(head1);
		printNodes(node);*/
		Node evenNode = oddNode(head1);
		printNodes(evenNode);
		
		
		
	}
}
	
