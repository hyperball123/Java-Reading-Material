package hit.day16;

//overriding
public class GeneralizationDemo4 {
	public static void main(String[] args) {
		P obj=new CC();
		//variables / properties don't get overriden
		System.out.println(obj.i);
		//on inheritance, the super class methods can be overriden by the sub class, by redeclaring them
		obj.met(1);
		
		CC obj2=new CC();
		System.out.println(obj2.i);
		obj2.met(1);
		
	}
}

class P{
	int i=10;
	public void met(int i) {
		System.out.println("p method called.....");
	}
}

class CC extends P{
	int i=20;
	/*
	 * Rules pertaining to overriding
	 * 1. the method name should be same
	 * 2. the parameter should match
	 * 3. the method cannot be more private
	 * 4. the return type cannot be different - should be same
	 */
	public void met(int i) {
		super.met(i);
		System.out.println("cc method called..............CCCCCCCCCCCCCCCCCc");
	}
}