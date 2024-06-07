package LinkedList;

import java.util.Iterator;

/*
 1. add element to linked list                            line = 
 2. add element in specific position in linked list       line = 
 3. add element to first in linked list                   line = 
 4. add element to last in linked list                    line = 
 5. how to get (retrive) the first element                line = 
 6. how to get (retrive) the last element                 line = 
 7. how to get (retrive) the any element (using index no) line = 
 8. iteration
 9. how to remove the first element                line = 
 10.how to remove the last element                 line = 
 11.how to remove the any element (using index no) line = 
 12.how to remove the all element                  line =
 */
public class LinkedList {
	
	public static void main(String[] args) {
		java.util.LinkedList<String> fruits  = new java.util.LinkedList<>();
		
		//add element in list
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("mango");
		
		System.out.println("Fruit List = "+fruits);
		
		//add element in any position list
		fruits.add(2, "watermelon");
		System.out.println("Updated list 1 = "+fruits);
		
		//add element in First position list
		fruits.addFirst("strawberry");
		System.out.println("Updated list 2 = "+fruits);
		
		//add element in last position list
		fruits.addLast("orange");
		System.out.println("Updated list 3 = "+fruits);
		
		//get (retrive) the first element 
		System.out.println("First element of LinkedList = "+fruits.getFirst());
		
		//get (retrive) the last element 
		System.out.println("Last element of LinkedList = "+fruits.getLast());
		
		//get (retrive) the first element (using index no)
		System.out.println("Index 2 element of LinkedList = "+fruits.get(2));
		
		//iteration  (same as list)
		System.out.println("List after iteration");
		for (String fur : fruits) {
			System.out.print(fur+"\t");
		}
		System.out.println();
		
		//how to remove the first element
		System.out.println("Removed item = "+fruits.removeFirst());
		System.out.println("updated list 4 = "+fruits);
		
		//how to remove the last element
		System.out.println("Removed item = "+fruits.removeLast());
		System.out.println("updated list 5 = "+fruits);
		
		//how to remove the any element
		System.out.println("Removed item = "+fruits.remove("apple"));
		System.out.println("updated list 6 = "+fruits);
		
		System.out.println("Removed item = "+fruits.remove(2));
		System.out.println("updated list 7 = "+fruits);
		
		//to clear the list
		fruits.clear();
		System.out.println("updated list 8 = "+fruits);
		
		//to search elements in linked list
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("mango");
		
		System.out.println("List contains banana = "+fruits.contains("banana"));
		System.out.println("List contains orange = "+fruits.contains("orange"));
		
		//to get index number of element
		System.out.println("Index no. of banana = "+fruits.indexOf("banana"));
		
	}
}
