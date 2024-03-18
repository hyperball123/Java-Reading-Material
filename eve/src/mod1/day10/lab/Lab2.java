package mod1.day10.lab;

public class Lab2 {
	public static void main(String[] args) {
		int n=11;
		int x=2;
		
		System.out.println("Quotient is..:"+(n/x));
		System.out.println("Reminder is..:"+(n%x));
		
		if(n%2==0) {
			System.out.println("even number....");
		}
		else {
			System.out.println("odd number...");
		}
		
		System.out.println((n%2==0)?"Even number...":"Odd Number....");
		
		char c='z';
		switch(c) {
		case 'a':{
			System.out.println("yes \"a\" is a vowel...");
			break;
		}
		case 'e':{
			System.out.println("yes \"e\" is a vowel...");
			break;
		}
		case 'i':{
			System.out.println("yes \"i\" is a vowel...");
			break;
		}
		case 'o':{
			System.out.println("yes \"o\" is a vowel...");
			break;
		}
		case 'u':{
			System.out.println("yes \"u\" is a vowel...");
			break;
		}
		default:{
			System.out.println(c+" is not a vowel....");
		}
		}
	}
}
