package mod1.day10.lab;

public class Lab4 {
	public static void main(String[] args) {
		int n1=10;
		int n2=20;
		
		System.out.println(n1+":"+n2);
		
		int temp=n1;
		n1=n2;
		n2=temp;
		System.out.println(n1+":"+n2);
		//do the same exercise without temp variable...
	}
}
