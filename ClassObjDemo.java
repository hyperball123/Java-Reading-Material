package eve;

public class ClassObjDemo {
 public static void main(String[] args) {
	human shoiab;
	human shoaib1=new human();
	shoaib1.enjoy(100);
	new human().enjoy(10000);
}
}

class human{
	//PROPERTIES AND METHODS
	//DATA AND BEHAVIOUR
	//METHODS ARE BEHAVIOURS WHICH ADD VALUE TO THE CLASS,INSIDE THE METHODS U WRITE BUSINESS LOGIC
	int salary =100;
	public void enjoy(int salary) {
		if(salary==10000) {
			System.out.println("epend salary");
		}
		else {
			System.out.println("work hard");
		}
	}
}