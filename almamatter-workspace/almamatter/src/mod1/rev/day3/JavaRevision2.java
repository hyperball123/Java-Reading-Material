package mod1.rev.day3;
/*
 * methods
 * constructors
 * this keyword
 */
public class JavaRevision2 {
	public static void main(String[] args) {
	//	new Person("ramu");
		Person p=new Person(1);
		p.met1();
		int i=p.met2();
		System.out.println(i);
		System.out.println(p.met2(11));
	}
}

class Person{
	int i=10;
	public Person() {
		System.out.println("Person object created...");
	}
	public Person(int i) {
		System.out.println(i);
		System.out.println("Person Object created...:"+this.i);
	}
	public Person(String s) {
		System.out.println("Person object created.........................:"+s);
	}
	
	public void met1() {
		System.out.println("met1 called...");
	}
	public int met2() {
		return 100;
	}
	public String met2(int i) {
		if(i%2==0) {
			return "Even Number...";
		}
		else {
			return "Odd Number...";
		}
	}
}