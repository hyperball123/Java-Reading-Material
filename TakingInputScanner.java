package eve;

import java.util.Scanner;

public class TakingInputScanner {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("PLease enter your name...");

String name = scan.next();

System.out.println("Welcome to java..."+name);

System.out.println("Please input number1...");
int n1=scan.nextInt();
System.out.println("please input number2...");
int n2=scan.nextInt();

System.out.println("the addition of n1 and n2 is ..."+ (n1+n2));


	}

}
