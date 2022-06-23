package com.q28;

import java.util.Stack;

public class Main {
 public static void main(String[]args) {
	 Stack<String> stack = new Stack<>();
	 stack.push("chandan");
	 stack.push("Kumar");
	 stack.push("singh");
	 stack.push("Rav");
	 //stack.pop();
	 stack.peek();
	 System.out.println(stack.peek());
	 for(String s:stack) {
		 System.out.println(s);
	 }
	 		 
 }
}
