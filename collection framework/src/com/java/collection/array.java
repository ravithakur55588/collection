package com.java.collection;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println(""+a+"\t"+b+"\t"+c);
		
		int d[] = new int[5];   // size is mandatory
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter Array Element");
		for(int i=0;i<5;i++)
		{
			d[i] = scr.nextInt();
		}
		
		System.out.println("Array Element are ");
		for(int i=0;i<5;i++)
		{
			System.out.print(""+d[i]+"\t");
		}
		
		System.out.println("\nArray Using Predefined Functions");
		for(int i=0;i<d.length;i++)
		{
			System.out.print(""+d[i]+"\t");
		}
	}

}
