package com.arpan.array;

import java.util.Stack;

import java.util.Stack;

public class ReveseStackWithoutUsingExtraMemory {
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		for(int i=1;i<=5;i++) {
			stack.add(i);
		}
		stack.stream().forEach(app->System.out.print(app+", "));
		reverse(stack);
		System.out.println();
		stack.stream().forEach(app->System.out.print(app+", "));
	}

	private static void reverse(Stack<Integer> stack) {
		if (stack.isEmpty()) {
			return;
		}
		int a = stack.pop();
		reverse(stack);
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
		int x = stack.pop();
		pushAtEnd(stack, a);
		stack.push(x);
	}
}
