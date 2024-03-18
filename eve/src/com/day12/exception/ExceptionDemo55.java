package com.day12.exception;

import java.util.Scanner;

public class ExceptionDemo55 {
	public static void main(String[] args) throws Exception{
		Dog tiger=new Dog();
		
		Child baby=new Child();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a item...:");
		String itemClass=scan.next();
		
		Item item=(Item)Class.forName("com.day12.exception."+itemClass).getDeclaredConstructor(null).newInstance(null);
		
		baby.playWithDog(tiger, item);		
	}
}
