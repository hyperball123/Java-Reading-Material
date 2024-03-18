package hit.day12;

public class StaticDemo {
	public static void main(String[] args) {
		StaticMethod.metStatic(256);
		
		StaticMethod obj=new StaticMethod();
		obj.metNormal();
	}
}

class StaticMethod{
	static int money;
	public void metNormal() {
		System.out.println("normal method...."+money);
	}
	
	public static void metStatic(int money) {
		//StaticMethod obj=new StaticMethod();
		//obj.money=1000;
		//static methods cannot access non static variable or non static methods
		//this.money=money;
		//static methods cannot use the keyword 'this', because this referes to instance variable
		StaticMethod.money=money;
		System.out.println("static method.....");
	}
}