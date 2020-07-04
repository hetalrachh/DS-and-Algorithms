import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queues {

	java.util.Queue<Integer> q1;
	java.util.Queue<Integer> q2;
	int SIZE;

	public StackUsing2Queues() {
		q1 = new LinkedList<Integer>();
		q2 = new LinkedList<Integer>();
		SIZE = 0;

	}

	/** Push element x onto stack. */
	public void push(int x) {
		q1.add(x);
		SIZE++;

	}

	/** Removes the element on top of the stack and returns that element. */
	public int pop() {
		ensureQ2IsNotEmpty();
		int poppedEle = q1.remove();
		SIZE--;
		swapQueues();
		return poppedEle;
	}

	/** Get the top element. */
	public int top() {
		ensureQ2IsNotEmpty();
		int peekedEle = q1.remove();
		q2.add(peekedEle);
		swapQueues();
		return peekedEle;
	}

	/** Returns whether the stack is empty. */
	public boolean empty() {
		return q1.isEmpty() && q2.isEmpty();

	}

	/** Ensure that queue q2 is not empty */
	public void ensureQ2IsNotEmpty() {
		for (int i = 0; i < SIZE - 1; i++) {
			q2.add(q1.remove());
		}
	}

	/** Swap queues q1 and q2 */
	public void swapQueues() {
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
	}

	public static void main(String[] args) {
		StackUsing2Queues s = new StackUsing2Queues();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s.top());
		s.pop();
		System.out.println(s.top());
		s.push(4);
		System.out.println(s.top());

	}
}
