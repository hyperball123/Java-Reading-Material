package mod1.day14;
/*
 * 'super'
 * refers to parent class - variable, constructor and methods
 */
public class ClassesAndObjects15 {
	public static void main(String[] args) {
		Child obj=new Child();
		obj.met(25);
	}
}
class GrandParent{
	void metMet() {
		System.out.println("grand parent met met called...");
	}
}
class Parent extends GrandParent{
	int age=100;
//	void metMet() {
//		System.out.println("Parent met met called...");
//		super.metMet();
//	}
}

class Child extends Parent{
	int age=50;
	void met(int age) {
		System.out.println(age);//this prints the local variable
		System.out.println(this.age); //this prints the instance variable
		System.out.println(super.age);//this prints the super class variable
		metMet();//this will call the child metMet method
		super.metMet();
	}
	void metMet() {
		System.out.println("child met met called...");
	}
}