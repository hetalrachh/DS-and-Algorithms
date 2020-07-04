import java.util.LinkedList;
import java.util.Queue;
public class QueueInterfaceImpl {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();

		/*
		 * throws IllegalArgumentException if the queue is full else returns
		 * true
		 */
		boolean addOne = queue.add(1);

		boolean addTwo = queue.add(2);

		/*
		 * returns true if the element is added to the queue else returns false
		 */
		boolean addThree = queue.offer(3);
		boolean addFour = queue.offer(4);

		/* returns null if the queue is empty else the head of the queue */
		int headOfQueue = queue.peek();
		System.out.println("Head of the queue is = " + headOfQueue);

		/* similar to peek but throws exception if the queue is empty */
		int headOfQueue1 = queue.element();

		/* returns null if the queue is empty */
		int poppedElement = queue.poll();
		System.out.println("Element popped = " + poppedElement);

		/* similar to poll but throws an exception if the queue is empty */
		int poppedElement1 = queue.remove();
		System.out.println("Element popped = " + poppedElement1);

		System.out.println("Size of the queue is = " + queue.size());

		System.out.println("Is queue empty = " + queue.isEmpty());

		int poppedElement2 = queue.poll();
		int poppedElement3 = queue.poll();

		System.out.println("Is queue empty = " + queue.isEmpty());

		/*
		 * try removing element when queue is empty using remove and it throws
		 * exception
		 */
		int poppedElement4 = queue.remove();

	}

}
