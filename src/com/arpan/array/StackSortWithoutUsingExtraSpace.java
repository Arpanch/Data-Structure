package com.arpan.array;

import java.util.Stack;

public class StackSortWithoutUsingExtraSpace {
	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();
		int a[]= {2,1,3,4,0,9,1,2,4,5,6,3};
		for (int i = 0; i < a.length; i++) {
			stack.add(a[i]);
		}
		stack.stream().forEach(app -> System.out.print(app + ", "));
		sort(stack);
		System.out.println();
		stack.stream().forEach(app -> System.out.print(app + ", "));

	}

	private static void sort(Stack<Integer> stack) {
		if (stack.isEmpty()) {
			return;
		}
		int a = stack.pop();
		sort(stack);
		if (stack.isEmpty()) {
			stack.push(a);
		} else {
			pushAtEnd(stack, a);
		}
	}

	private static void pushAtEnd(Stack<Integer> stack, int a) {

		if (stack.isEmpty()) {
			stack.push(a);
			return;
		}
		if(a>stack.peek()) {
			stack.push(a);
		}else {
			int x = stack.pop();
			pushAtEnd(stack, a);
			stack.push(x);
		}
		
	}
}


