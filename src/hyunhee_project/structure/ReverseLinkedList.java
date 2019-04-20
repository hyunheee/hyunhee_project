package hyunhee_project.structure;

import java.util.LinkedList;

public class ReverseLinkedList {
	

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(0,2);
		linkedList.add(1,4);
		linkedList.add(2,6);
		linkedList.add(3,8);
		
	//	System.out.println(linkedList.get(0));
		System.out.println(linkedList.get(0));
		linkedList = reverseList(linkedList);
		System.out.println(linkedList.get(0));
		
	}
	
	private static LinkedList<Integer> reverseList(LinkedList<Integer> linkedList){
		LinkedList<Integer> orgLinkedList = linkedList;
		LinkedList<Integer> reverseLinkedList = new LinkedList<>();
		int t = 0;
		for(int i=linkedList.size()-1;i>=0;i--) {
			System.out.println(linkedList.get(i));
			 reverseLinkedList.add(t,orgLinkedList.get(i));
			 System.out.println(reverseLinkedList.get(t));
			 t++;
			
		}
		System.out.println(reverseLinkedList.get(0));
		return reverseLinkedList;
	}
	
	
}
