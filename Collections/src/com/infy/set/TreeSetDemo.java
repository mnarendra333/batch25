package com.infy.set;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sorting
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(50);
		ts.add(60);
		ts.add(10);
		ts.add(70);
		ts.add(5);
		
		System.out.println(ts);
		System.out.println(ts.descendingSet());
		
		
		
		/*current element < existing element  
		if(true) {
			+1; place the element after the existing element
		}else {
			-1 = place the element after the existing element
		}*/
		
		System.out.println("================");
		
		for (int i = 97; i <=122; i++) {
			System.out.print(i+"="+(char)i+" ");
		}
		System.out.println("================");
		
		
		TreeSet<Character> ts2 = new TreeSet<Character>();
		ts2.add('h'); // a = 97 
		ts2.add('i');
		ts2.add('t');
		ts2.add('a');
		ts2.add('m');
		
		System.out.println(ts2);
		
		//a  h  i m t
		
		
		/*i<h
		105<104
		
		
		t<h
		t<i
		116<104
		116<105
		
		a<h
		a<i
		a<t
		
		m<a
		m<h
		m<i
		m<t*/
		
		
		TreeSet<String> ts3 = new TreeSet<String>();
		ts3.add("jogn");
		ts3.add("cleerk");
		ts3.add("ravi");
		ts3.add("arul");
		ts3.add("surya");
		
		System.out.println(ts3);
		
		
		
		//null check
		TreeSet<String> ts4 = new TreeSet<String>();
		ts4.add(null);
		
		System.out.println(ts3);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
