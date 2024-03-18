package mod1.rev.day1;

public class OperatorsDemo {
	public static void main(String[] args) {
		byte i=11;
		byte j=2;
		
		//when we do arithmetic operations on byte or any other type the result will be always in int type
		
		byte result=(byte)(i%j);
		
		System.out.println("Addition..:"+(i+j));
		System.out.println("Substraction..:"+(i-j));
		System.out.println("Multiplication..:"+(i*j));
		System.out.println("Division..**Quotient**.:"+(i/j));
		System.out.println("Division..**Reminder**.:"+(i%j)); //Mod operator
		
		//x++ this is equivalent to x=x+1;
		
		int x=10;
		System.out.println(x++);//prints x first and then increments - post increment
		System.out.println(x);
		
		x=10;
		System.out.println(++x);//increment x first and then print - pre increment
		System.out.println(x);
		
		x=10;
		System.out.println(x--);//prints x first and then decrements - post decrement
		System.out.println(x);
		
		x=10;
		System.out.println(--x);//decrement x first and then print - pre decrement
		System.out.println(x);
		
		//x=x+2 or 3 or some number
		x=10;
		//x=x+3;
		x+=3;
		System.out.println(x);
		
		x=10;
		//x=x-3;
		x-=3;
		System.out.println(x);
		
		x=10;
		//x=x*5;
		x*=5;
		System.out.println(x);
		
		x=10;
		//x=x/3;
		x/=4;
		System.out.println(x);
		
		x=11;
		//x=x%3;
		x%=4;
		System.out.println(x);
		
		//RELATIONAL OPERATORS - ALWAYS RETURN TRUE OR FALSE
		//WE CREATE A EXPRESSION USING RELATIONAL OPERATORS, AND REMEMBER THE EXPRESSION ALWAYS RETURNS A BOOLEAN
		int n1=10;
		int n2=20;
		System.out.println(n1==n2);
		System.out.println(n1!=n2);//NEGATE OF COMPARISON
		System.out.println(n1>n2);
		System.out.println(n1<n2);
		System.out.println(n1<=n2);
		System.out.println(n1>=n2);
		
		//LOGICAL OPERATORS
		//&& || !
		
		System.out.println(n1<n2 && n1==10);// this will return true if only both the expressions return true
		
		System.out.println(n1<n2 || n1==100);// this will return true if any one of the expressions return true
		
		
	}
}
