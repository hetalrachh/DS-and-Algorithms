import java.util.Stack;

class StackCommonOperations {

	public static void main(String[] args) {
      Stack<Integer> stack = new Stack<Integer>(); // creates an empty stack of capacity 10

	  int itemPushed1 = stack.push(1); // push an item and return it
	  int itemPushed2 = stack.push(2);
	  int itemPushed3 = stack.push(3);

      int capacity1 = stack.capacity(); // returns 10
	  System.out.println("Current stack capacity i.e. capacity1 = " + capacity1);

	  int size1 = stack.size(); // returns 3
	  System.out.println("Current stack size i.e. size1 = " + size1);

	  int itemPopped = stack.pop(); // removes and returns 3
	  System.out.println("Item popped itemPopped = " + itemPopped);

	  int itemPeeked = stack.peek(); // returns 2
	  System.out.println("Item peeked itemPeeked = " + itemPeeked);

	  boolean isStackEmpty = stack.isEmpty(); // returns false
	  System.out.println("Is stack empty = " + isStackEmpty);

	  int itemSearched1 = stack.search(1); // returns 2
	  System.out.println("Search 1 position = " + itemSearched1);

	  int itemSearched2 = stack.search(2); // returns 1
	  System.out.println("Search 2 position = " + itemSearched2);
	}

}