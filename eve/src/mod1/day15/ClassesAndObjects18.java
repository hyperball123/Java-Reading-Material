package mod1.day15;
/*
 * Inner classes
 * A class with in a class is called Inner class
 * 1. Boardly inner classes are classified as 
 * a. Inner Class b. static inner class
 * a.1 - Inner class
 * a.2 - Local Inner class
 * a.3 - Anonymous Inner class
 */
public class ClassesAndObjects18 {
public static void main(String[] args) {
	//syntax for creating an object of inner class
	//Kalimark.Cola cola=new Kalimark().new Cola();
	Kalimark kali=new Kalimark();
	kali.makeCola();	
	//To access a static class	
	Kalimark.Hello hello=new Kalimark.Hello();
	hello.sayHello("eve");	
}
}
class Pepsi{
//	public void makeCola(Kalimark.Cola cola) {
//		cola.makeCola();
//		System.out.println("cola filled in pepsi bottles...and sold...");
//	}
}
class Kalimark{
	public void makeCola() {
		//local inner class
		class Cola{
			public void makeCola() {
				facilitiesOfKali();
				System.out.println(money);
				System.out.println("cola is made by cola company");
			}
		}	
		new Cola().makeCola();
		System.out.println("cola filled in bovonto bottles...and sold...");
	}	
	int money=100110000;
	public void facilitiesOfKali() {		
	}
	static int  mon=1000;
	public static void statMet() {}
	static public class Hello{
		public void sayHello(String s) {
			statMet();
			System.out.println("hello...:"+s+":"+mon);
		}
	}
	
}


