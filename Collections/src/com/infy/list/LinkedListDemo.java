package com.infy.list;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//new node(2000)
		
		//node1(1000) - 10,1001
		
		//node2(1001) - 30,1002
		
		//node3(1002) - 40,1003
		
		//node4(1003) - 50,null
		
		//node1   => node2  => node3  => node4
		
			  // (20,1001)
		//10,2000 => 30,1002=> 40,1003=> 50,null
		
		
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		for (int i = 10; i <=100; i+=10) {
			ll.add(i);
		}
		
		System.out.println(ll);
		
		ll.addFirst(5);
		System.out.println(ll);
		
		ll.add(2, 15);
		System.out.println(ll);
		
		ll.addLast(200);
		System.out.println(ll);
		
		
		ll.remove();
		System.out.println(ll);
		
		ll.remove(1);
		System.out.println(ll);
		
		ll.remove(new Integer(90));
		System.out.println(ll);
		
		
		
		ll.pop();
		
		System.out.println(ll);
		
		
		
		
		
		
		
		
		

	}

}
