public class QueueUsingArray {

	int queue[];
	int N;
	int front, rear;

	QueueUsingArray() {
		N = 5;
		queue = new int[N];
		front = -1;
		rear = -1;

	}

	/* method which inserts a new element to the queue */
	void enqueue(int data) {
		if (isFull()) {
			System.out.println("Queue is full. Cannot insert " + data);

		} else {
			if (rear == -1) { // means inserting first element
				rear++;
				front++;

			} else {
				rear++;

			}
			queue[rear] = data;

			System.out.println("Element enqueued = " + queue[rear]);
		}
	}

	/* method which removes an element from the queue */
	void dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");

		} else if (front == rear) { // means there is only 1 element

			System.out.println("Element dequeued = " + queue[front]);
			front = -1;
			rear = -1;

		} else {
			System.out.println("Element dequeued = " + queue[front]);
			for (int i = 0; i <= rear - 1; i++) {
				queue[i] = queue[i + 1];
			}
			// store 0 at that position to indicate there is no element
			queue[rear] = 0;

			rear--;

		}
	}

	/* method which checks if the queue is full */
	boolean isFull() {
		return rear == N - 1;
	}

	/* method which checks if the queue is empty */
	boolean isEmpty() {
		return rear == -1;
	}

	/* method which displays all the elements of the queue */
	void display() {
		System.out.print("Queue elements are = ");
		for (int i = front; i <= rear; i++) {
			System.out.print(queue[i] + " ");

		}
		System.out.println();
	}

	public static void main(String[] args) {
		QueueUsingArray q = new QueueUsingArray();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.enqueue(6);
		q.display();
		q.isEmpty();
		q.isFull();

	}

}
