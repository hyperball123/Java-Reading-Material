package hit.day11;

public class LocalAndInstanceDemo {
	int i;//instance variable
	static int ii;//class variable
	void met(int aaa) {
		int k=aaa;//local variable
		int i=aaa;
		System.out.println(k);
		System.out.println(this.i);
		//I want to access instance variable i
		//solution is - use the keyword -this-.  this - refers to the current object.
	}
	
	public static void main(String[] args) {
		//class variables - u can access the class variables directly with class name itself
				LocalAndInstanceDemo.ii=9999;
				
		//1. variable access
		//To access a instance variable and local variable you need to first create a instance of the class
		LocalAndInstanceDemo obj=new LocalAndInstanceDemo();
		System.out.println(obj.i);
		obj.i=1010101;
		System.out.println(obj.i);
		System.out.println(obj.ii);
		
		LocalAndInstanceDemo obj2=new LocalAndInstanceDemo();
		System.out.println(obj2.i);
		System.out.println(obj2.ii);
		//Local variables - u cannot access directly
		//only through methods u can access, because they are private to the method
		
		obj2.met(100);obj2.met(100);obj2.met(200);obj2.met(100);obj2.met(500);
		
		
		
		
	}

}
