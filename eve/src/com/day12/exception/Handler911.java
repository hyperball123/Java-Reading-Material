package com.day12.exception;

public class Handler911 {
	private static Handler911 handler;
	private Handler911() {
		
	}
	
	public static Handler911 getHandler() {
		if(handler==null) {
			handler=new Handler911();
		}
		return handler;
	}
	
	public void handle(DogBiteException dbe) {
		System.out.println("Victim is bitten by a dog,,,,take him to hospital....");
	}
	
	public void handle(DogBarkException dbr) {
		System.out.println("dont worry....barking dogs seldom bite...............");
	}
	
	public void handle(DogHappyException dbr) {
		System.out.println("happy happy....dog is happy.play now...............");
	}
}
