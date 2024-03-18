package eve;

import java.util.Scanner;

public class HelloWorldDynamic {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter your name..:");
		String myname=scan.next();//this will wait for keyboard input from you
		
		System.out.println("Welcome To Java...:"+myname);
		
		System.out.println("Please input Number1...:");
		int n1=scan.nextInt();
		System.out.println("Please input Number2...:");
		int n2=scan.nextInt();
		
		System.out.println("The addition of n1 and n2 is...:"+(n1+n2));
	}
}
