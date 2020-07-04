public class StackUsingArray {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.pop();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		s.getSize();
		s.pop();
		s.peek();

	}

}

class Stack {
    // maximum size of stack array
	final int MAX_SIZE = 5;

    // array to store elements
	int[] stackArray = new int[MAX_SIZE];

    // top of stack and current size of the stack
	int top, SIZE; 

	// initialize top and current size of stack
	Stack() {
		top = -1;
		SIZE = 0;
	}

	// method to push a new element to the stack
	boolean push(int element) {
		if (isFull()) {
			System.out.println("Stack is full. Cannot insert new element " + element + " to the stack");
			return false;
		} else {
			stackArray[++top] = element;
			SIZE = SIZE + 1;
			System.out.println("Element pushed to the stack = " + stackArray[top]);
			return true;
		}
	}

	// method to pop the top element from the stack
	int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty. Cannot pop element from the stack.");
			return -1;
		} else {
			int elementPopped = stackArray[top--];
			SIZE = SIZE - 1;
			System.out.println("Element popped from the stack = " + elementPopped);
			return elementPopped;
		}
	}

	// method to peek/view the topmost element of the stack
	int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty. Cannot peek element from the stack");
			return -1;
		} else {
			System.out.println("Top most element of the stack = " + stackArray[top]);
			return stackArray[top];
		}
	}

	// method to check if the stack is empty
	boolean isEmpty() {
		if (SIZE == 0) {
			return true;
		} else {
			return false;
		}
	}

	// method to check if the stack is full
	boolean isFull() {
		if (SIZE == MAX_SIZE) {
			return true;
		} else {
			return false;
		}
	}

	// method to get the current size of stack
	int getSize() {
		System.out.println("Current size of stack is = " + SIZE);
		return SIZE;
	}

}
