package mod1.day12;

public class ClassObjectDemo {
	public static void main(String[] args) {
		Human shoiab;
		//shoiab.enjoy();
		Human shoiab1=new Human();
		shoiab1.enjoy(100);
		new Human().enjoy(10000);
	}
}


class Human{
	
	//PROPERTIES AND METHODS
	//DATA AND BEHAVIOUR
	//methods are behaviours which add value to the class, inside the methods u write business logic
	int salary=100;
	
	public void enjoy(int salary) {//a non returnable method with int parameter
		if(salary==10000) {
			System.out.println("spend salary");
		}
		else {
			System.out.println("work hard....");
		}
	}
}