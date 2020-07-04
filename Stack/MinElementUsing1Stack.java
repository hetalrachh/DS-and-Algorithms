import java.util.Stack;

public class MinElementUsing1Stack {

	Stack<int[]> stack;

	// data structure initialization
	MinElementUsing1Stack() {
		stack = new Stack<int[]>();

	}

	// method to push a new element along with the min value till that point
	void push(int val) {
		// if the stack is empty push the element to stack, min=element itself
		if (stack.empty()) {
			stack.push(new int[] { val, val });
			return;
		}

		// compare the top min element with the new element, if new element is
		// smaller then add the new min as the current element
		int currentMin = stack.peek()[1];
		stack.push(new int[] { val, Math.min(currentMin, val) });

	}

	// method to pop an element from stack
	void pop() {
		stack.pop();
	}

	// method which returns min value
	int getMin() {
		return stack.peek()[1];
	}

	// method to get top element of stack
	int top() {
		return stack.peek()[0];
	}

	public static void main(String[] args) {
		MinElementUsing1Stack s = new MinElementUsing1Stack();
		s.push(5);
		System.out.println("Min element is = " + s.getMin());
		s.push(2);
		System.out.println("Min element is = " + s.getMin());
		s.push(10);
		s.push(1);
		s.push(3);

		System.out.println("Min element is = " + s.getMin());
		System.out.println("Top element is = " + s.top());

		s.pop();
		System.out.println("Min element is = " + s.getMin());
		s.pop();
		System.out.println("Min element is = " + s.getMin());

	}

}