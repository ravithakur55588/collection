package HashSet;

import java.util.Set;

public class HashSet {
	
	public static void main(String[] args) {
		
		Set<String> ele = new java.util.HashSet<>();
		ele.add("element1");
		ele.add("element4");     //doesnot follwed insertion order(inserted order)
		ele.add(null);              
		ele.add("element2");    
		ele.add("element1");     //dupticacy not allowed
		ele.add(null);           //more than one null value not allowed
		ele.add("element3");
		
		System.out.println(ele);
		
		//add element of hashset set in other hashset.
		
		Set<String> yy = new java.util.HashSet<>(ele);
		
		System.out.println(yy);
		yy.add(null);              
		yy.add("element5");    
		System.out.println(yy);
		
		//to remove a element from hashset
		yy.remove("element2");
		System.out.println("updated HashSet = "+yy);
		
		//to remove all elements 
		yy.removeAll(ele);
		System.out.println("updated HashSet = "+yy);
		
		//to clear list
		yy.clear();
		System.out.println("updated HashSet = "+yy);
		
		//iteration is as other............
	}
}
