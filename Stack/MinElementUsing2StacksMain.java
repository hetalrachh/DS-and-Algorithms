import java.util.Stack;

class MinElementUsing2Stacks {

	Stack<Integer> mainStack;
	Stack<Integer> minStack;

	MinElementUsing2Stacks() {
		mainStack = new Stack<Integer>();
		minStack = new Stack<Integer>();
	}

	/*
	 * Method which pushes an element to the main stack and pushes to the min
	 * stack only if the data to be pushed is less than the top most element of
	 * min stack, else pushes the min element again to minStack
	 */
	void push(int data) {
		mainStack.push(data);

		// check if the minStack is empty
		if (minStack.empty()) {
			minStack.push(data);

		} else {
			int min = minStack.peek();
			minStack.push(data < min ? data : min);

		}
	}

	/*
	 * Method which pops an element from main stack and min stack
	 * 
	 */
	int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty, cannot pop elements.");
			return -1;
		} else {
			minStack.pop();
			return mainStack.pop();
		}
	}

	// method which checks if the main stack is empty
	boolean isEmpty() {
		return mainStack.empty();
	}

	// method which peeks the topmost element of main stack
	int peek() {
		return mainStack.peek();
	}

	// method which returns the size of the main stack
	int getSize() {
		return mainStack.size();
	}

	// method which returns the minimum element
	int getMin() {
		if (minStack.empty()) {
			System.out.println("Min stack is empty");
			return -1;
		} else {
			return minStack.peek();
		}
	}

}

public class MinElementUsing2StacksMain {

	public static void main(String[] args) {

		MinElementUsing2Stacks s = new MinElementUsing2Stacks();

		s.push(2); //push 2
		s.push(2); //push 2
		s.push(1); //push 1
		s.push(4); //push 4
		s.push(5); //push 5
		s.push(5); //push 5
		System.out.println(s.getMin()); //prints 1
		s.pop(); //pops 5 from mainStack and 1 from minStack
		s.pop(); //pops 5 from mainStack and 1 from minStack
		System.out.println(s.getMin()); // prints 1
		s.pop(); //pops 4 from mainStack and 1 from minStack
		s.pop(); //pops 1 from mainStack and 1 from minStack
		s.pop(); //pops 2 from mainStack and 2 from minStack
		System.out.println(s.getMin()); //prints 2
	}

}
