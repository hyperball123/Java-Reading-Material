package mod1.day14;
/*
 * Method OverLoading....
 */
public class ClassesAndObjects17 {
	public static void main(String[] args) {
		ClassesAndObjects17 obj=new ClassesAndObjects17();
		//Data changes behavior changes...-Polymorphism - Virtual/Dynamic Method Invocation
		obj.met(100);
		obj.met();
		obj.met("aaaa");
	}
	
	public void met() {
		System.out.println("met method called...");
	}
	//changing the return does not amount to overriding, neither changing the access specifier
//	public int met() {
//		
//		return 1;
//	}
	public void met(int i) {
		System.out.println("met method with param called...:"+i);
	}
	//You can have the over loaded method with a different return type
	public int met(String s) {
		return 1;
	}
}
