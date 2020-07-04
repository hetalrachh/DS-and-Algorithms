class EvalReversePolishNotation {
	public static int evalRPN(String s) {

		// stack to store operands
		java.util.Stack stack = new java.util.Stack<Integer>();
		String tokens[] = s.split(" ");
		int expLength = tokens.length;

		// parse the entire expression
		for (int i = 0; i < expLength; i++) {
			int result, element1, element2;
			switch (tokens[i]) {
			case "+":
				element1 = (Integer) stack.pop();
				element2 = (Integer) stack.pop();
				result = element2 + element1;
				stack.push(result);
				break;
			case "-":
				element1 = (Integer) stack.pop();
				element2 = (Integer) stack.pop();
				result = element2 - element1;
				stack.push(result);
				break;
			case "*":
				element1 = (Integer) stack.pop();
				element2 = (Integer) stack.pop();
				result = element2 * element1;
				stack.push(result);
				break;
			case "/":
				element1 = (Integer) stack.pop();
				element2 = (Integer) stack.pop();
				result = element2 / element1;
				stack.push(result);
				break;
			default:
				result = Integer.parseInt(tokens[i]);
				stack.push(result);

			}
		}
		return (Integer) stack.pop();
	}

	public static void main(String[] args) {
		int result = evalRPN("4 13 5 / +");
		System.out.println("Result of evaluation = " + result);
		int result1 = evalRPN("10 6 9 3 + -11 * / * 17 + 5 +");
		System.out.println("Result of evaluation = " + result1);
	}
}
