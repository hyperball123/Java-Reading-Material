package mod1.day12;

public class ClassesAndObjects3 {
	public static void main(String[] args) {
		Calculator casio=new Calculator();
		casio.acceptNumberOne(20);
		casio.acceptNumberTwo(2);
		
		System.out.println("Addition..:"+casio.result("ADD"));
		System.out.println("Multiplication..:"+casio.result("mul"));
		System.out.println("Division..:"+casio.result("div"));
		System.out.println("Unknown..:"+casio.result("addaaaa"));
		
		System.out.println(casio.calculate(20,30,"fgf"));
	}
}

class Calculator{
	int n1,n2;
	public void acceptNumberOne(int num1) {
		n1=num1;
	}
	
	public void acceptNumberTwo(int num2) {
		n2=num2;
	}
	
	public int result(String operation) {
		if(operation.equalsIgnoreCase("add")) {
			return n1+n2;
		}
		else if(operation.equalsIgnoreCase("div")) {
			return n1/n2;
		}
		else if(operation.equalsIgnoreCase("mul")) {
			return n1*n2;
		}
		else {
			return 0;
		}
	}
	
	public int calculate(int num1,int num2,String ope) {
		if(ope.equals("add")) {
			return num1+num2;
		}
		else {
			return 0;
		}
	}
}