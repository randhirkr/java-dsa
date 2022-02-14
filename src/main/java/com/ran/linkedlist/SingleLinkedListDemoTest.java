package com.ran.linkedlist;

public class SingleLinkedListDemoTest {

	
	public static void main(String[] args) {
		
		SingleLinkedListDemo singleLinkedListDemo = new SingleLinkedListDemo();
		singleLinkedListDemo.addAtHead(1);
		singleLinkedListDemo.printLinkedList();
		
		singleLinkedListDemo.addAtTail(3); 
		singleLinkedListDemo.printLinkedList();
		
		// fix addAtIndex as its not working
		singleLinkedListDemo.addAtIndex(1, 2); // linked list becomes 1->2->3
		singleLinkedListDemo.printLinkedList();
		
		int no = singleLinkedListDemo.get(1);  // return 2
		System.out.println("number is : "+no);
		
		
		singleLinkedListDemo.printLinkedList();
		System.out.println();
		
		int len = singleLinkedListDemo.getLinkedListLength();
		System.out.println("length of linkedlist: "+len);
		
		singleLinkedListDemo.deleteAtIndex(1); //now the linked list is 1->3
		singleLinkedListDemo.printLinkedList();
		len = singleLinkedListDemo.getLinkedListLength();
		System.out.println("length of linkedlist post deletion: "+len);
		
		
		no = singleLinkedListDemo.get(1);  // return 3
		System.out.println("number at index "+ 1 + " is : "+no);
		
		
		
	}

}
