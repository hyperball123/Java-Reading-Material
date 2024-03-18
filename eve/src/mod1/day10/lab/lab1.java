package mod1.day10.lab;

import java.util.Scanner;

public class lab1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number..:");
		int i=scan.nextInt();
		System.out.println("Please enter another number...:");
		int j=scan.nextInt();
		int sum=i*j;
		System.out.println("The sum is...:"+sum);
		
		byte b=10;
		
		int n=b;
		
		byte bb=(byte)n;
		
		char c='a';
		char ccc=129;
		int nn=c;
		
		char cc=(char)nn;
		
		for(i=0;i<200;i++) {
			char cn=(char)i;
			System.out.println("The character value of Ascii Number.."+i+"  is..:"+cn+"\t");
		}
	}
}
