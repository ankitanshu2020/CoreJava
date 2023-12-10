package dataStructures.com;

public class Stack {

	int[] stack;
	int size;
	int top;
	
	Stack(int size){   // constructor to initiate and initialize
		stack = new int[size];
		top = -1;
		this.size = size;
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	public boolean isFull() {
		return (top == size - 1);
	}
	public void push(int data) {
		if(isFull()) {
			System.err.println("Stack Overflow !!!");
		}
		else {
		    top++;
		    stack[top] = data;
		    System.out.println(data + " inserted into stack successfully!!");
		}
	}
	public void pop() {
		if(isEmpty()) {
			System.err.println("Stack Underflow !!!");
		}
		else {
			int data = stack[top];
			top--;
		    System.out.println(data + " removed from stack successfully!!");
		}
	}
	public int peek() {
		if(isEmpty()) {
			return -1;
		}
		else
			return stack[top];
	}
	
	@Override
	public String toString() {
		
		String s = "[";
		
		for(int i = 0; i <= top; i++) {
			if(i != top)
				s = s + stack[i] + ",";
			else
				s = s + stack[i];
		}
		s = s + "]";
		
		return s;
	}	
}
