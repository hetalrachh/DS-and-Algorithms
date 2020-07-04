public class QueueUsing2Stacks {

	/* Stack data structure */
	Stack<Integer> enqueue;
	Stack<Integer> dequeue;

	/* Initialization of data structure */
	public QueueUsing2Stacks() {
		enqueue = new Stack<Integer>();
		dequeue = new Stack<Integer>();
	}

	/* Method to push a new element to the enqueue stack */
	void push(int data) {
		enqueue.push(data);
	}

	/* Method to pop an element from dequeue stack */
	void pop() {
		if (enqueue.empty() && dequeue.empty()) {
			System.out.println("Queue is empty. Cannot pop element.");
			return;
		}
		ensureElementsInDequeueStack();
		dequeue.pop();
	}

	/* Method to peek an element */
	int peek() {
		ensureElementsInDequeueStack();
		return dequeue.peek();
	}

	/* Method which ensures elements are present in dequeue stack */
	void ensureElementsInDequeueStack() {
		if (dequeue.empty()) {
			populateDequeueStack();
		}

	}

	/* Method which populates dequeue stack from enqueue stack */
	private void populateDequeueStack() {
		while (!enqueue.empty()) {
			dequeue.push(enqueue.pop());
		}
	}

	public static void main(String[] args) {

		QueueUsing2Stacks q = new QueueUsing2Stacks();
		q.push(1);
		q.push(2);
		q.push(3);
		System.out.println("Top element = " + q.peek());
		q.pop();
		System.out.println("Top element = " + q.peek());

	}

}