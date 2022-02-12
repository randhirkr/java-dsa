package com.ran.linkedlist;

public class SingleLinkedListDemoTest {

	public static void main(String[] args) {
		
		SingleLinkedListDemo singleLinkedListDemo = new SingleLinkedListDemo();
		singleLinkedListDemo.addAtHead(1);
		
		// fix this as its not working, going in infinite loop while printing
		singleLinkedListDemo.addAtTail(3); 
		
		singleLinkedListDemo.addAtIndex(1, 2);
		int no = singleLinkedListDemo.get(1);
		System.out.println("number is : "+no);
		
		// fix this as its going in infinite loop while printing
		singleLinkedListDemo.printLinkedList();
		//int len = singleLinkedListDemo.getLinkedListLength();
		//System.out.println("length of linkedlist: "+len);
	}

}
