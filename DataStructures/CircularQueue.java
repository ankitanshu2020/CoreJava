package dataStructures.com;

public class CircularQueue {
	int[] queue;
	int capacity,front, rear;
	
	CircularQueue(int capacity){
		queue = new int[capacity];
		this.capacity =  capacity;
		front = rear = -1;
	}
	public boolean isEmpty() {
		return (front == -1);
	}
	public boolean isFull() {
		return (rear + 1) % capacity == front;
	}
	public void enqueue(int data) {
		if(isFull()) {
			System.err.println("Queue Overflow");
		}
		else {
			if(isEmpty()) {  // queue is empty
				front = rear = 0;
				queue[rear] = data;
				System.out.println(data + " inserted in queue successfully!!");
				
			}
			else {   // some elements are there in the queue means not empty
				rear = (rear + 1) % capacity;
				queue[rear] = data;
				System.out.println(data + " inserted in queue successfully!!");
			}
		}
	}
	public void dequeue() {
		if(isEmpty())
			System.err.println("Queue Underflow");
		else {
			int data = queue[front];
			if(front == rear) {     // last element to be deleted, delete last and update front & rear
				front = rear = -1;
				System.out.println(data + " removed from queue successfully!!");
			}
			else {
				front = (front + 1) % capacity; // set front again
				System.out.println(data + " removed from queue successfully!!");
			}
		}
	}
	@Override
	public String toString() {
		
		String s = "[";
		
		for(int i = 0; i <= rear; i++) {
			if(i != rear)
				s = s + queue[i] + ",";
			else
				s = s + queue[i];
		}
		s = s + "]";
		
		return s;
	}
}
