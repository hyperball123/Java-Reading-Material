package mod1.day7;

public class TypeCastingDemo {
	public static void main(String[] args) {
		int i=258;//32 bit
		/*
		 * When you assign a variable to another variable
		 * 1. Then the variable type of the receiving should be of same type 
		 * 2. or it should be of higher type
		 * 3. or you should do casting
		 */
		int j=i;//both i and j are of same type so no issues
		//char c=i;//not possible because they are of different types;
		//byte b=i;//not possible because they are of different types
		//short s=i;//not possible because they are of different types
		long l=i;//posssible because long is of higher type than int - auto type promotion happened
		
		//To solve the problem of incompatibility, we do typecasting
		//In case int to byte, downcasting should happen
		
		byte age=(byte)i;//8 bit of memory
		System.out.println(age);
		
		short s=(short)i;
		System.out.println(s);
		
		float f=100;//32 bit
		byte b=(byte)f;
		System.out.println(b);
		
		float ff=100.25f;
		byte bb=(byte)ff;
		s=(short)ff;
		int n=(int)ff;
		System.out.println(bb);
		System.out.println(s);
		System.out.println(n);
		
		char cc='a';
		char ccc=97;
		System.out.println(cc);
		System.out.println(ccc);
		int nc=cc;//a character is actually a type of integer, so u can store a char into int but the reverse is not allowed
		int num=97;
		System.out.println((char)num);
		char c2=(char)num;//if you give a number value in char it accepts but if you give a variable of type int, it wont accept
		System.out.println(c2);
		
		char mychar=169;
		System.out.println(mychar);
		
		boolean boo=true;
	}
}
