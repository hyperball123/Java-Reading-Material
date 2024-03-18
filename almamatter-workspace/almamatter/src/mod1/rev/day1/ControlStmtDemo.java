package mod1.rev.day1;

public class ControlStmtDemo {
	public static void main(String[] args) {
		int i=10;
		/*
		 * if - which works on expression to evaluate to true or false so as to take a decision
		 * switch - which works on a char or string - which could be a input or outcome of logic
		 * ternary - ? - which works on again expression evaluation to true or false - but unlike if this is a single line
		 */
		
		boolean b=i<10;
		if(b) {//only one if is allowed
			System.out.println("i value is lesser than 10");
		}
		else if(i==10) {//else if can be as many as u like
			System.out.println("i value is equal to 10");
		}
		else {//only one else is allowe
			System.out.println("i value is not lesser than 10");
		}
		
		if(i<10) {
			
		}
		
		//you can also nested if i.e if with in if and so on
		
		String s=i<=10?"value is lesser or equal to 10":"value is unknown";
		System.out.println(i<=10?"value is lesser or equal to 10":"value is unknown");
	}
}
