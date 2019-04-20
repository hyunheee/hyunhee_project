package hyunhee_project;

import java.util.LinkedList;

public class ReverseLinkedList2 {
	
	
	public static Node reverse(Node node) {
		
		if(node.next==null) {
			return node;
		}else {
			
			Node reversenode = reverse(node.next);
			node.next.next = reversenode;
			node = null;
			return reversenode;
		}
		
		
	}

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println();
	}
	
	
}
