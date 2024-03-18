package com.day12.exception;

public abstract class DogExceptions extends Exception{
	public abstract void visit();
}

class DogBiteException extends DogExceptions{
	String msg;
	public DogBiteException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception is...:"+msg;
	}
	@Override
	public void visit() {
		Handler911.getHandler().handle(this);
	}
}

class DogBarkException extends DogExceptions{
	String msg;
	public DogBarkException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception is...:"+msg;
	}
	@Override
	public void visit() {
		Handler911.getHandler().handle(this);
	}
}

class DogHappyException extends DogExceptions{
	String msg;
	public DogHappyException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception is...:"+msg;
	}
	@Override
	public void visit() {
		Handler911.getHandler().handle(this);
	}
}
