package dataStructures.com;

public class LinkedListMain {
	public static void main(String[] args) {
		LinkedList myList = new LinkedList();
		
		myList.insertNodeEnd(10, myList);
		myList.insertNodeEnd(70, myList);
		myList.insertNodeEnd(40, myList);
		myList.insertNodeEnd(90, myList);
		myList.insertNodeEnd(200, myList);
//		myList.show();

		myList.insertNodeStart(50, myList);
		myList.insertNodeStart(100, myList);
		myList.insertNodeStart(210, myList);
		myList.show();
		
		System.out.println();
		myList.insertNodeIndex(55, 3, myList);

		myList.insertNodeIndex(11, 0, myList);
		myList.show();
		
		myList.deleteAt(4, myList);
		myList.show();

	}
}
