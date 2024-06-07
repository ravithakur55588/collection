package com.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> l2 = new ArrayList<>();
		
		//add items in list (output is in same manner or sequence in which we entered items)
		l2.add("e1");      //index value = 0
		l2.add("e2");      //index value = 1
		l2.add("e5");      //index value = 2
		l2.add("e4");      //index value = 3
		l2.add("e3");      //index value = 4
		
		System.out.println(l2);
		
		//list accept null value
		l2.add(null);
		System.out.println(l2);
		
		//access element from list (using index value)
		System.out.println(l2.get(0));
		System.out.println(l2.get(2));  
		

	}

}
