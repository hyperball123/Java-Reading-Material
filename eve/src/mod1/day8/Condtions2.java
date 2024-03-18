package mod1.day8;

import java.util.Scanner;

public class Condtions2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your age..:");
		int age=scan.nextInt();
		
		if(age<10) {
			System.out.println("you are a child... you cannot vote");
		}
		else if(age==10) {
			System.out.println("You are a big boy/girl....");
		}
		else if(age<19) {
			System.out.println("You are a young person..you can decide the government.");
		}
		else {
			System.out.println("You are not in your teens..........");
		}
		
		//two seperate conditions and both will get executed..and both will give output..if age value is below 20
		if(age<20) {System.out.println("below 20");}
		if(age<40) {System.out.println("below 40");}
		
		//In the below case, they will behave as one condition, though they both are executed, only one will give the output
		if(age<20) {System.out.println("below 20...............................");}
		else if(age<40) {System.out.println("below 40..............................");}
	}
}
