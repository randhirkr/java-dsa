package com.ran.linkedlist;

public class SingleLinkedListDemoTest {

	
	public static void main(String[] args) {
		
		// test case 1
		//["MyLinkedList","addAtHead","addAtTail","addAtIndex","get","deleteAtIndex","get"]
		//[[],[1],[3],[1,2],[1],[1],[1]]
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
		System.out.println("============");
		System.out.println();
		
		
		// test case 2
		//["MyLinkedList","addAtHead","deleteAtIndex"]
		//[[],[1],[0]]
		SingleLinkedListDemo testcase2 = new SingleLinkedListDemo();
		testcase2.printLinkedList();
		testcase2.addAtHead(1);
		testcase2.printLinkedList();
		
		testcase2.deleteAtIndex(0);
		testcase2.printLinkedList();
		
		// test case 3
		//["MyLinkedList","addAtHead","addAtHead","addAtHead","addAtIndex","deleteAtIndex",
		//"addAtHead","addAtTail","get","addAtHead","addAtIndex","addAtHead"]
		//[[],[7],[2],[1],[3,0],[2],[6],[4],[4],[4],[5,0],[6]]
		
		SingleLinkedListDemo testcase3 = new SingleLinkedListDemo();
		testcase3.printLinkedList();
		testcase3.addAtHead(7);
		testcase3.addAtHead(2);
		testcase3.addAtHead(1);
		testcase3.printLinkedList();
		
		testcase3.addAtIndex(3, 0);
		testcase3.printLinkedList();
		
		testcase3.deleteAtIndex(2);
		testcase3.printLinkedList();
		
		//["MyLinkedList","addAtHead","addAtHead","addAtHead","addAtIndex","deleteAtIndex",
				//"addAtHead","addAtTail","get","addAtHead","addAtIndex","addAtHead"]
				//[[],[7],[2],[1],[3,0],[2],[6],[4],[4],[4],[5,0],[6]]
		testcase3.addAtHead(6);
		testcase3.printLinkedList();
		testcase3.addAtTail(4);
		testcase3.printLinkedList();
		System.out.println(testcase3.get(4));
		testcase3.addAtHead(4);
		testcase3.addAtIndex(5, 0);
		testcase3.printLinkedList();
		testcase3.addAtHead(6);
		testcase3.printLinkedList();
		
		//["MyLinkedList","addAtHead","addAtTail","addAtIndex","get","deleteAtIndex","get"]
		//[[],[1],[3],[1,2],[1],[0],[0]]
		SingleLinkedListDemo testcase4 = new SingleLinkedListDemo();
		testcase4.addAtHead(7);
		testcase4.addAtTail(3);
		testcase4.printLinkedList();
		testcase4.addAtIndex(1, 2);
		testcase4.printLinkedList();
		System.out.println(testcase4.get(1));
		testcase4.deleteAtIndex(0);
		testcase4.printLinkedList();
		System.out.println(testcase4.get(0));
		
		//["MyLinkedList","addAtHead","addAtIndex","get"]
		//[[],[2],[0,1],[1]]
		System.out.println("new test case-------");
		SingleLinkedListDemo testcase5 = new SingleLinkedListDemo();
		testcase5.addAtHead(2);
		testcase5.addAtIndex(0, 1);
		testcase5.printLinkedList();
		System.out.println(testcase5.get(1));
	}

}
