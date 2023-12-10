package dataStructures.com;

public class LinkedList {
	Node head;  // head is first node in the LL, as it will store the reference of first element/node

//---------------------method to insert an element in a list in the last position---------------------
	public void insertNodeEnd(int data, LinkedList list) {  // list is LL, in this we will store nodes
		Node new_node = new Node(data);  // data will stored in new_node reference
		
		if(list.head == null) {   // no nodes present, empty
			list.head = new_node;
		}
		else {
			Node last = list.head; //here we are storing head in variable name last, by this we will reach to the last of the array list
			
			while(last.next != null) {  //if next to current node have any element then move to next, till reach to last node it will be jumping to next.we know in last node reference is null 
				last = last.next; // every time it will move to next position
			}
			last.next = new_node; // after finding last node, we insert our new node there
		}
	}
	
//---------------------method to insert an element at the start position------------------------------
//if we insert a node at start, then head should point to new node and new node will have reference of next node
	public void insertNodeStart(int data, LinkedList list) {
		Node new_node = new Node(data);
		new_node.next = head; // new node inserted at start and head is assigned to next to new node
		head = new_node; // new_node is assigned to head, as new_node will be first node(head node)
	}
	
//---------------------method to insert an element at specified index------------------------------
	public void insertNodeIndex(int data, int index, LinkedList list) {
		Node new_node = new Node(data);
		
		if(index == 0) { // means putting value at start,where index is 0. so we can simply call insertNodeStart()
			insertNodeStart(data, list);
		}
		else {	
		Node n = head; // by n variable we will traverse through list, as n had head reference
		for(int i = 0; i < index - 1; i++) { //finding index where to insert
			n = n.next; // moving to each index for searching one index before specified index
		}
		new_node.next = n.next; // moving forward the value at specified index to next index
		n.next = new_node;  // now assigning new node to the specified index, as previous element moved forward right
	}
  }
//---------------------method to delete an element at specified index------------------------------
	public void deleteAt(int index, LinkedList list) {
		//if we want to delete first element
		if(index == 0) {
			head = head.next;
		}
		//if we want to delete element other than first
		else {	
			Node n = head; // by n variable we will traverse through list, as n had head reference
			Node n1 = null;
			for(int i = 0; i < index - 1; i++) { //finding index 
				n = n.next; // moving to each index for searching one index before specified index
			}
			n1 = n.next;
			n.next = n1.next;
			System.out.println(n1.data);
		}
	}
	
	public void show() {
		Node node = head;
		while(node.next != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.print(node.data + " "); // this is last node, which next is null. loop reaching there but as next is null so it is coming out of loop, so we need to print the last node manually
	}
}
