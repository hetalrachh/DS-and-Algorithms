public class QueueUsingLinkedList {

	QueueNode front;
	QueueNode rear;

	// constructor to initialize front and rear pointers
	QueueUsingLinkedList() {
		this.front = null;
		this.rear = null;
	}

	// QueueNode class representing a node in the linked list
	static class QueueNode {
		int data;
		QueueNode next;

		QueueNode(int val) {
			this.data = val;
			next = null;
		}

	}

	/* method to add a new element to the queue */
	void enqueue(int data) {

		QueueNode newNode = new QueueNode(data);

		// inserting the first element
		if (rear == null) {
			rear = newNode;
			front = rear;

		} else {
			// attach the new node at the rear end and update rear pointer
			rear.next = newNode;
			rear = newNode;
		}
		System.out.println("Element enqueued = " + rear.data);
	}

	/* method to remove an element from the queue */
	void dequeue() {
		if (rear == null) {
			System.out.println("Queue is empty. Cannot dequeue element.");
		} else {
			System.out.println("Element dequeued = " + front.data);
			front = front.next;

			// if this was the only node
			if (front == null) {
				rear = null;
			}
		}
	}

	/* method to display all elements of the queue */
	void display() {
		QueueNode temp = front;
		System.out.print("Queue elements are = ");
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();

	}

	public static void main(String[] args) {
		QueueUsingLinkedList q = new QueueUsingLinkedList();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.enqueue(6);
		q.display();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();

	}

}