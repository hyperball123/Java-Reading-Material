package mod1.rev.day1;

class VariableDemo {
	public static void main(String[] args) {
		/*
		 * four types
		 * number types
		 * float types
		 * char types
		 * boolean types
		 * 
		 */
		
		//number types - byte-8bit, short-16bit, int-32 bit, long-64bit
		
		//VARIABLE DECLARATION
		int i;//i is the name of the variable
		
		//VARIABLE VALID IDENTIFIER
		/*
		 * valid name or identifier
		 * int age;-valid name
		 * 2age - invalid name - because the name starts with a number
		 * @age- invalid name because the name cannot have special characters other than $ and _
		 * a ge - invalid name because there is a space in between
		 * int void - invalid - keywords cannot be variable names
		 * 
		 * age - valid name
		 * a2ge- valid name - numbers can be inbetween
		 * $age - valid name - 
		 * _age - valid name
		 * a2g_e_$ - valid name
		 * a_ge - valid name
		 * ag$e - valid name
		 * a_g_$e - valid name
		 */
		
		//VARIABLE INITIALIZATION
		i=10;
		System.out.println(i);
		
		char c='a';
		char cc=97;
		System.out.println(c);
		System.out.println(cc);
		
		float f=100;
		float ff=2147.2345f;//f makes sures that it stores 32 bit
		System.out.println(ff);
		double d=343.45;//64 bit
		
		boolean boo=true;
		boolean boo2=false;
		
	//	boolean booo2=yes;
	}
}
