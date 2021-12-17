package com.infy.list;

import java.util.ArrayList;
import java.util.Stack;

public class StackDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Stack stack = new Stack();
		
		for (int i = 10; i <=100; i+=10) {
			stack.push(i);
		}
		System.out.println(stack);
		
		//System.out.println(stack.indexOf(90));
		
		
		System.out.println(stack.search(80));
		/*while(!stack.isEmpty()) {
			System.out.println(stack.peek());
			stack.pop();
		}*/
		
		
		
		ArrayList<Integer> al = new ArrayList<Integer>(stack);
		System.out.println(al);
		
		
		Object[] obj= stack.toArray();
		
		System.out.println("===========array elem=======");
		for (Object object : obj) {
			System.out.println(object);
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
