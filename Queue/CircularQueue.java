class CircularQueue {

	int queue[];
	private static final int SPECIAL_EMPTY_VALUE = -1;
	private static int front;
	private static int rear;

	/**
	 * Initialize your data structure here. Set the size of the queue to be k.
	 */
	public CircularQueue(int k) {
		queue = new int[k];
		front = SPECIAL_EMPTY_VALUE;
		rear = SPECIAL_EMPTY_VALUE;

	}

	/**
	 * Insert an element into the circular queue. Return true if the operation
	 * is successful.
	 */
	public boolean enQueue(int value) {
		if (isFull()) {
			System.out.println("Queue is full.Cannot enqueue new element = " + value);
			return false;
		} else {
			// find next position of rear where new element will be placed
			rear = (rear + 1) % queue.length;
			queue[rear] = value;

			// change the index of front, for the first element inserted
			if (front == SPECIAL_EMPTY_VALUE)
				front = rear;
			System.out.println("Element enqueued = " + queue[rear]);

			return true;
		}

	}

	/**
	 * Delete an element from the circular queue. Return true if the operation
	 * is successful.
	 */
	public boolean deQueue() {
		if (isEmpty()) {
			System.out.println("Queue is empty. Cannot dequeue element.");
			return false;
		} else {

			// if this is the last element in the queue
			if (front == rear) {
				System.out.println("Element dequeued = " + queue[front]);
				front = SPECIAL_EMPTY_VALUE;
				rear = SPECIAL_EMPTY_VALUE;
			} else {
				System.out.println("Element dequeued = " + queue[front]);
				front = (front + 1) % queue.length;
			}

			return true;
		}

	}

	/** Get the front item from the queue. */
	public int front() {
		if (isEmpty()) {
			System.out.println("Queue is empty. Cannot find front element.");
			return -1;
		} else {
			System.out.println("Front element = " + queue[front]);
			return queue[front];
		}
	}

	/** Get the last item from the queue. */
	public int rear() {
		if (isEmpty()) {
			System.out.println("Queue is empty. Cannot find rear element.");
			return -1;
		} else {
			System.out.println("Rear element = " + queue[rear]);
			return queue[rear];
		}

	}

	/** Checks whether the circular queue is empty or not. */
	public boolean isEmpty() {
		return front == SPECIAL_EMPTY_VALUE;
	}

	/** Checks whether the circular queue is full or not. */
	public boolean isFull() {
		// queue is full when next index of tail is equal to head index
		int nextIndexOfTail = (rear + 1) % queue.length;
		return nextIndexOfTail == front;
	}

	public static void main(String[] args) {
		CircularQueue q = new CircularQueue(5);
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		q.enQueue(6);
		q.deQueue();
		q.deQueue();
		q.front();
		q.rear();
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.deQueue();

	}

}