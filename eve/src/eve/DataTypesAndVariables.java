package eve;

public class DataTypesAndVariables {
	public static void main(String[] args) {
		int age=21_474_83_645 ;//32 bit
		byte b=10;//8 bit
		short s=100;//16 bit
		long l=232323;//64 bit
		/*
		 * valid identifiers should follow the following rules
		 * 1.variable names cannot start with a number value
		 * 2.variable names cannot have special characters except $ and _
		 * 3.In between the name you can have numbers and $ and _ but not any other special character
		 * 4. You cannot have space also in between
		 */
		
		float f=1.234343f;//32 bit
		double d=23.344;//64 bit
		
		char c='a';
		char cc=100;//in java character is internally stored as number
		
		boolean boo=true;
		boolean boo2=false;
		
		String ss="hello world";
	}
}
