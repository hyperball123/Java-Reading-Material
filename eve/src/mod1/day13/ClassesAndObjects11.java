package mod1.day13;

public class ClassesAndObjects11 {
	public static void main(String[] args) {
		//Demo obj=new Demo(1010101);
		
	//	obj.metNonStatic();
		
		Demo.met();
		Demo.met2();
	}
}

//use class name to access the static fields and methods
class Demo{
	static int i=0;
	static {
		i=1010101;
	}
	public Demo(int i) {
		Demo.i=i;//initialization of i value...
	}
	public static void met() {
		System.out.println("static method called...."+i);//static method can only access static variables
	}
	
	public static void met2() {
		System.out.println("static met2 called..."+i);
	}
	
	public void metNonStatic() {
		System.out.println("Non static method called...."+i);
	}
}