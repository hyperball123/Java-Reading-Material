package eve;

public class VariableDemo {
	public static void main(String[] args) {
		//variable declaration
		
		int i;
		String s;
		
		//variable initialization
		i=10;
		s="hello";
		float f=1.2f;
		float ff=20;
		byte b=111;
		short sss=20202;
		char c='c';
		char ccc=97;
		boolean bb=true;//u cannot give 0 or 1
		boolean bbb=false;
		
		//valid identifiers or valid name
		
		int a;//valid identifier
		/*
		 * 2age - invalid identifier - because the name starts with a number
		 * @age - invalid identifier - because the name starts with a special character other than $ and _
		 * $age - valid identifer
		 * _age - valid identifier
		 * a2ge - valid identifier - you can have numbers in between
		 * a2g_e$ - valid identifier
		 * ag e - invalid identifier - because there is a space 
		 * 
		 * YOU CANNOT CREATE A NAME WHICH IS A KEYWORD OR CLASSNAME IN JAVA
		 * The valid identifier concept applies to even the CLASS NAMES which u create.
		 */
	}
}
