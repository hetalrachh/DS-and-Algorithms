public class StackUsingLinkedList {
 
    // top node which points to the topmost/first node of the linked list
	StackNode top;

    // constructor initializing top to null
        StackUsingLinkedList() {
		this.top = null;
	}

    // class which represents a node in the linked list
	static class StackNode {
        // data stored in the node
		int data;

        // pointer to the next node
		StackNode next;

        // constructor initializing data and next pointer
		StackNode(int val) {
			this.data = val;
			next = null;
		}

	}
 
    // method to push a new element to the stack
	void push(int data) {

		StackNode newNode = new StackNode(data);
		if (top == null) {
			top = newNode;
		} else {
			newNode.next = top;
			top = newNode;

		}
		System.out.println("Element pushed to the stack = " + newNode.data);
	}

    // method to pop the topmost element of the stack
	int pop() {
		if (top == null) {
			System.out.println("Stack is empty. Cannot pop element from empty stack.");
			return -1;
		} else {
			int elementPopped = top.data;
			top = top.next;
			System.out.println("Element popped from the stack = " + elementPopped);
			return elementPopped;
		}
	}

    // method to peek/view the topmost element of the stack
	int peek() {
		if (top == null) {
			System.out.println("Stack is empty. Cannot peek element from empty stack.");
			return -1;
		} else {
			int elementPeeked = top.data;
			System.out.println("Element peeked from the stack = " + elementPeeked);
			return elementPeeked;
		}
	}

    // method to check if the stack is empty
	boolean isEmpty() {
		if (top == null) {
			return true;
		} else {
			return false;
		}
	}

    // method to view the list data
    void viewList() {
		StackNode pointer = top;
		System.out.print("List data = ");
		while (pointer != null) {
			System.out.print(pointer.data + " ");
			pointer = pointer.next;
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		StackUsingLinkedList s = new StackUsingLinkedList();
		s.push(5);
		s.push(6);
		s.push(7);
		s.viewList();
		s.pop();
		s.peek();
		s.pop();
		s.pop();
		s.pop();
		s.peek();
	}

}
