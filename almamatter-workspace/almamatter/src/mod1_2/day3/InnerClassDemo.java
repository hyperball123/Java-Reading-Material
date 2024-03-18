package mod1_2.day3;

public class InnerClassDemo {
	public static void main(String[] args) {
		int i=100;String s="the value is..:";
		
		System.out.println(s+i);
		
		InnerDemo obj=new InnerDemo();
		
		InnerDemo.MyInnerClass myin=new InnerDemo().new MyInnerClass();
		myin.met();
		
		
		InnerDemo.MyStaticInner myinstat=new InnerDemo.MyStaticInner();
	}
}
/*
 * There are four types of inner classes
 * 
 * 1. Inner class
 * 2. Static Inner class
 * 3. Local Inner Class
 * 4. Anonymous Inner class
 */
/*
 * Rules
 * 1. inner classes can be private or protected or no modifier or public
 * 2. Local inner classes can only be nomodifier
 * 3. Inner classes have access to all the outer class properties but the reverse is not true
 */
class InnerDemo{
	//inner class
	int ii=100;static int i=100;
	protected class MyInnerClass{
		int i=10;
		
		public void met() {
			int i=100;String s="the value is..:";
			System.out.println(ii);
			System.out.println(s+i);
		}
		public static void mett() {
			System.out.println(InnerDemo.i);
		}
	}
	
	//static Inner class
	static class MyStaticInner{
		
	}
	
	public void met() {
		//Local Inner class
		class MyLocalInner{
			
		}
	}
}