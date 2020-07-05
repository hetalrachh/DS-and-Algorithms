public class TwoStacksUsingArray {

	int stack[];
	int top1, top2, N;

	// initialization
	TwoStacksUsingArray(int size) {
		N = size;
		top1 = -1;
		top2 = N;
		stack = new int[N];

	}

	// push an element at top1 end
	private void push1(int val) {
		// check if the array is full or not
		if (isFull()) {
			System.out.println("Array is full, cannot push element");
		} else {
			top1++;
			stack[top1] = val;
			System.out.println("Element pushed at top1 = " + stack[top1]);
		}
	}

	// push an element at top2 end
	private void push2(int val) {
		if (isFull()) {
			System.out.println("Array is full, cannot push element");
		} else {
			top2--;
			stack[top2] = val;
			System.out.println("Element pushed at top2 = " + stack[top2]);
		}
	}

	// pop an element from top1 end
	private void pop1() {
		if (isStack1Empty()) {
			System.out.println("Cannot pop element, array is empty");
		} else {
			System.out.println("Element popped from top1 = " + stack[top1]);
			top1--;
		}
	}

	// pop an element from top2
	private void pop2() {
		if (isStack2Empty()) {
			System.out.println("Cannot pop element, array is empty");
		} else {
			System.out.println("Element popped from top2 = " + stack[top2]);
			top2++;
		}
	}

	// peek an element at top1
	private void peek1() {
		if (isStack1Empty()) {
			System.out.println("Cannot peek element from top1, stack is empty");
		} else {
			System.out.println("Element peeked at top1 = " + stack[top1]);

		}
	}

	// peek an element at top2
	private void peek2() {
		if (isStack2Empty()) {
			System.out.println("Cannot peek element from top2, stack is empty");
		} else {
			System.out.println("Element peeked at top2 = " + stack[top2]);

		}
	}

	// check if the array is full
	private boolean isFull() {
		return (top2 - top1) == 1;
	}

	// check if stack1 is empty
	private boolean isStack1Empty() {
		return top1 == -1;
	}

	// check if stack2 is empty
	private boolean isStack2Empty() {
		return top2 == N;
	}

	public static void main(String[] args) {
		TwoStacksUsingArray s = new TwoStacksUsingArray(5);
		s.push1(5);
		s.push2(10);
		s.push2(15);
		s.push1(11);
		s.push2(7);
		s.push1(10);

		s.pop1();
		s.pop1();
		s.peek1();
		s.peek2();
		s.pop2();
		s.peek2();

	}

}
