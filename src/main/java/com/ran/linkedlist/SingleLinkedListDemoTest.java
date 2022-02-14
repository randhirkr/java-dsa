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
		int len = singleLinkedListDemo.getLinkedListLength();
		System.out.println("length of linkedlist: "+len);
	}

}
