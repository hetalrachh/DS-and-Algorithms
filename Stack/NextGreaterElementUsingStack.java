package com.blog.programs;

import java.util.Stack;

public class NextGreaterElementUsingStack {

	static void printNextGreater(int num, int nextGreater) {
		System.out.println("Next greater of " + num + " = " + nextGreater);
	}

	private static void nextGreaterELement(int[] arr) {
		Stack<Integer> stack = new Stack<Integer>();
		int i = 0;
		while (i < arr.length) {

			if (stack.isEmpty() || arr[i] < stack.peek()) {
				stack.push(arr[i]);
				i++;
			} else {
				while (!stack.isEmpty() && arr[i] > stack.peek()) {
					printNextGreater(stack.pop(), arr[i]);
				}
				stack.push(arr[i]);
				i++;
			}

		}

		while (!stack.empty()) {
			printNextGreater(stack.pop(), -1);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 5, 3, 2, 10, 6, 8, 1, 4, 12, 7, 4 };
		// int arr[] = { 4, 3, 2, 1 };
		// int arr[] = { 11, 13, 21, 3 };
		nextGreaterELement(arr);
	}
}

// Time complexity = O(n) since we parse all elements of array
// space complexity , extra space of O(n) to store elements in stack
