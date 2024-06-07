package com.java.collection;

import java.util.ArrayList;
import java.util.Collection;

class CollectionDemo {

	public static void main(String[] args) {
		
		Collection<String> coll = new ArrayList<>();
		
		//add element in collection
		coll.add("apple");
		coll.add("banana");
		coll.add("mango");
		
		System.out.println(coll);
		
		//remove element from collection
		coll.remove("banana");
		System.out.println(coll); 
		
		//to check element present in collection or not
		System.out.println(coll.contains("apple"));
		
		//to clear the collection
		coll.clear();
		System.out.println(coll);
		
		
	}

}
