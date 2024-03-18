package hit.day16;
//code reusability
public class GeneralizationDemo3 {
	public static void main(String[] args) {
		A obj=new B();
		System.out.println(obj.i);
		obj.met();
		A obj2=new C();
		System.out.println(obj2.i);
		obj2.met();
	}
}

class A{
	//code reusability
	int i=10;
	public void met() {
		System.out.println("a class method met called...");
	}
}

class B extends A{
	
}

class C extends A{
	
}