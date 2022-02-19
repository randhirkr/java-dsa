package com.ran.linkedlist;

public class SingleLinkedListDemo {
	
	SingleNode head;
	
	// initialize it to null, empty linkedlist in beginning
    public SingleLinkedListDemo() {
    
    	head = null;
    }
    
    /*
     * 1 -> 2 -> null
     * 1 -> 2 -> 3 -> null
     * 1 > 2 > 4 > 5 > 6 > 7 > null - get(3) = 5
     */
    public int get(int index) {
    	
    	int len = getLinkedListLength();
    
    	if(index<len) {
	    	SingleNode curr = head;
	    	
	    	for(int i=0; i < index; i++) {
	    		curr = curr.next;
	    		
	    	}
	    	
	    	if (index < 0) {
	    		return -1;
	    	}
	    	return curr.value ;
    	}else {
    		System.out.println("index not valid");
    		return -1;
    	}
    }
    
    public void addAtHead(int val) {
    
    	//when its empty linkedlist
    	if(head == null) {
    		SingleNode curr = new SingleNode(val);
    		curr.next = null;
    		head = curr;
    	}else { // when linkedlist is not empty
    		
    		SingleNode curr = new SingleNode(val);
    		// 2 > null, add 3 ==> 3 > 2 > null
    		//SingleNode temp = head;
    		curr.next = head;
    		head = curr;
    		//curr.next = temp;
    		
    	}
    	
    }
    
    public void addAtTail(int val) {
    	
    /*
     * scenarios:
     * empty linkedlist
     * head -> null
     * 
     * Not empty linkedlist
     * head -> not null
     *   2 -> null
     *   3 -> 4 -> null
     *   1 -> 2 -> 3 -> null
     *   
     *   Do optimization later
     */
    	if(head == null) {
    		SingleNode curr = new SingleNode(val);
    		curr.next = null;
    		head = curr;
    	}else {
    		
    		// when its single element in linkedlist
    		if(head.next == null) {
    			SingleNode curr = new SingleNode(val);
    			head.next = curr;
    			curr.next = null;
    		}else {
    			
    			
    		    /*
    		     * Not empty linkedlist
    		     *   3 -> 4 -> null
    		     *   1 -> 2 -> 3 -> null 	
    		     */
    			SingleNode curr = new SingleNode(val);
    			SingleNode temp = head;
    			while(temp != null) {
    				
    				if(temp.next == null) {
    					temp.next = curr;
    					curr.next = null;
    					break;
    				}
    				
    				temp = temp.next;
    			}
    		}
    		
    		
    	}
        
    }
    
    /*
     * 2 > null
     * 4 > 2 > null
     * 2 > 5 > null 
     */
    public void addAtIndex(int index, int val) {
    
    	// head > null
    	// 2 > null , if 3 is added at 0 ==> 3 > 2 > null
    	// 1 > 3 ==> 1 > 2 > 3

    	if(index == 0 && head == null) {
    		SingleNode curr = new SingleNode(val);
    		head = curr;
    		curr.next = null;
    	}else if(index == 0 && head.next == null) {
    		SingleNode curr = new SingleNode(val);
    		SingleNode temp = head;
    		head = curr;
    		curr.next = temp.next;
    	}
    	else {
    		// process this when linkelist has more than 1 element.
    		int len = getLinkedListLength();
	    	SingleNode temp = head;
	    	SingleNode curr = new SingleNode(val);
	    	
    		//add element only one its valid index
    		if(index < len) {
		    	// 1 > 2 > null, add 3 at 0 ==> 3 > 1 > 2 > null
		    	// 1 > 2 > null, add 3 at 1 ==> 1 > 3 > 2 > null
		    	// if val(12) need to be added in the middle position(3 index)
		    	// 2 > 4 > 5 > 3 > 6 > null will become 2 > 4 > 5 > 12 > 3 > 6 > null
		    	if(index == 0 && head.next != null) {
		    		head = curr;
		    		curr.next = temp.next;
		    	}else {
			    	for(int i =0; i< index; i++) {
			    		// 1 > 3 ==> 1 > 2 > 3
			    		if(i == index-1) {
			    			SingleNode temp2 = temp.next;
			    			temp.next = curr;
			    			curr.next = temp2;
			    			
			    			break; // if node is added break from the loop
			    		}
			    		
			    		temp = temp.next;
			    	}
		    	}
    		}else if((index+1 == len) || (index == len)) { // add at tail
    			while(temp.next != null) {
    				temp = temp.next;
    			}
    			temp.next = curr;
    			curr.next = null;
    		}else {
    			System.out.println("Index "+index+" is greater than "
    					+ "length, nodes will not be inserted");
    		}
    	}
    	
    }
    
    public void deleteAtIndex(int index) {
    	
    	SingleNode temp = head;
    	SingleNode tempPrev = null;
    	
    	//23 > 11 > 22 > 43 > null, delete index 2 ==> 23 > 11 > 43 > null
    	//1 2 3  delete at index 1 ==> 1 3
    	// 1 > null , delete at index 0 ==> null

    	int len = getLinkedListLength();
    	if(index < len) {
	    	for(int i=0; i<= index; i++) {
	    		
	    		// if its single element, delete here
	        	if(index == 0 && head.next == null) {
	        		head = null;
	        		break;
	        	}else if(index == 0 && head.next != null) { //delete first element, if more than 1
	        		head = temp.next;
	        		break;
	        	}
	    		
	    		if ( i == index-1) { //store previous node
	    			tempPrev= temp;
	    		}
	    		//delete the node
	    		if( i== index && tempPrev != null) { // when previous node is found, point it to next node
	    			tempPrev.next = temp.next;
	    			System.out.println("value "+temp.getValue()+" deleted at index: "+index);
	    		}
	    		temp = temp.next;
	    	}
    	}else {
    		System.out.println("Not a valid index "+ index);
    	}
    }

    public int getLinkedListLength() {
    	
    	SingleNode temp = head;
    	int len = 0;
    	while(temp!=null) {
    		len++;
    		temp = temp.next;
    	}
    	
    	return len;
    }
    
    public void printLinkedList() {
    	System.out.println("printing linked list------");
    	SingleNode temp = head;
    	while(temp!= null) {
    		System.out.print(temp.getValue()+" ");
    		temp = temp.next;
    	}
    	System.out.println();
    }
}

//Definition of single LinkedList class
class SingleNode {
	
	int value;
	
	SingleNode next;
	
	SingleNode(int x){
		value = x;
	}

	public int getValue() {
		return value;
	}
}
