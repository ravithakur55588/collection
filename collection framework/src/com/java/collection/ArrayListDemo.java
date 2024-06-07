package com.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;     

/*
 //initial capacity or size of ArrayList is 10
  
1. How to create an array list from another collection using the ArrayList(Collection c)
   constructor.
2. how to add all the elements from an existing collection to the new ArrayList using the 
   addAll() method.  
3. diff ArrayList method
4. Iterator (iteration of arrayList)   -> line 82
5. shorting of array list              -> line 82
*/


public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		//create  list object
		List<Integer> firstFivePrimeNumber = new ArrayList<>(); //you can give size of array in ( );
		
		//Adding element in array list
		firstFivePrimeNumber.add(2);
		firstFivePrimeNumber.add(3);
		firstFivePrimeNumber.add(5);
		firstFivePrimeNumber.add(7);
		firstFivePrimeNumber.add(11);
		
		//passing this list to another list
		List<Integer> firstTenPrimeNumber = new ArrayList<>(firstFivePrimeNumber);
		
		////another list for next values
		List<Integer> nextFivePrimeNumber = new ArrayList<>();
		nextFivePrimeNumber.add(13);
		nextFivePrimeNumber.add(17);
		nextFivePrimeNumber.add(19);
		nextFivePrimeNumber.add(23);
		nextFivePrimeNumber.add(29);
		
		//to add all element of other list.
		firstTenPrimeNumber.addAll(nextFivePrimeNumber);
		
		System.out.println("First Ten Prime number = "+firstTenPrimeNumber);
		
		//to check arrayList empty or not
		System.out.println("firstTenPrimeNumber ArrayList is empty = "+firstTenPrimeNumber.isEmpty());
		
		//to find size of array
		System.out.println("SizeOf firstTenPrimeNumber ArrayList = "+firstTenPrimeNumber.size());
		
		//getting element (using index number)
		System.out.println("Lucky Number = "+firstTenPrimeNumber.get(4));
		
		//modify or update index (using index number)
		System.out.println("new element at index number 4 = "+firstTenPrimeNumber.set(4, 100));
		System.out.println("Updated 1 firstTenPrimeNumber ArrayList = "+firstTenPrimeNumber);
		
		//to remove element (using index number)
		firstTenPrimeNumber.remove(4);
		System.out.println("Updated 2 firstTenPrimeNumber ArrayList = "+firstTenPrimeNumber);
		
		//to remove element (using value)  //for string type value
		//firstTenPrimeNumber.remove("19");    
		//System.out.println("Updated 3 firstTenPrimeNumber ArrayList = "+firstTenPrimeNumber);
		
		//use of removeall method
		List<Integer> subList = new ArrayList<>();
		subList.add(17);
		subList.add(19);
		
		firstTenPrimeNumber.removeAll(subList);
		System.out.println("Updated 4 firstTenPrimeNumber ArrayList = "+firstTenPrimeNumber);
		
		//to remove or clear the list
		subList.clear();
		System.out.println("Updated subList ArrayList = "+subList);
		
		//Diff. ways of iterate Arraylist 
		//1. method (using for loop)
		System.out.println("Array List after Iteration");
		System.out.println("First method ((using for loop))");
		for(int i=0;i<firstTenPrimeNumber.size();i++)
		{
			System.out.print(firstTenPrimeNumber.get(i)+"\t");
		}
		System.out.println();
		System.out.println("Second Method (using for each loop)");
		
		//2. using for each loop
		for(Integer primeNumber:firstTenPrimeNumber) //we have to write primeNumber in syntex
		{
			System.out.print(primeNumber+"\t");
		}
		System.out.println();
		System.out.println("Third Method (using basic loop with iterator)");
		
		//3. using basic loop with iterator
		for (Iterator<Integer> iterator = firstTenPrimeNumber.iterator(); iterator.hasNext();) 
		{
			Integer primeNumber = (Integer) iterator.next();
			System.out.print(primeNumber+"\t");
		}
		System.out.println();
		System.out.println("Forth Method (using while loop)");
		
		//4. iterator with while loop
		Iterator<Integer> iterator = firstTenPrimeNumber.iterator();
		while (iterator.hasNext()) 
		{
			Integer primeNumber = (Integer) iterator.next();
			System.out.print(primeNumber+"\t");
		}
		System.out.println();
		System.out.println("Fifth Method (using java 8 stream + lambda expration or example)");
		
		//using java 8 stream + lambda expression or example
		firstTenPrimeNumber.stream().forEach(primeNumber -> System.out.println(primeNumber));

		System.out.println("sixth Method (using java 8 for each + lambda expration or example)");
		//using java 8 for each + lambda expression or example
		firstTenPrimeNumber.forEach((primeNumber) -> System.out.println(primeNumber));
		
		//Shorting of ArrayList
		Collections.sort(firstTenPrimeNumber);  //by default Ascending order(collections used)
		System.out.println("firstTenPrimeNumber in Ascending Order"+firstTenPrimeNumber);
		
		Collections.reverse(firstTenPrimeNumber); //for descending order
		System.out.println("firstTenPrimeNumber in Descending Order"+firstTenPrimeNumber);
	}
}
