package hit.day7.revision;

public class VariablesDemo {
	public static void main(String[] args) {
		int _a$ge;
		
		//int 2age; variable name cannot start with number
		//int %age; variable name cannot start with other special character than $ and _
		//int a g e; variable name cannot have space in between
		//int package; variable name cannot be a keword of java
		
		//declaration and initialization
		
		byte b=100; //size is 8 bit and range is -128 to 127
		short s=b;
		int i=s;
		long l=i;
		
		long ll=30000;
		System.out.println("long...:"+ll);
		int ii=(int)ll;//now 64 bit ll will become 32 bit
		System.out.println("int...:"+ii);
		short ss=(short)ii;
		System.out.println("short ...:"+ss);
		
		//type auto promotion
		
		short myshort1=25000;
		short myshort2=2;
		
		short result=(short)(myshort1*myshort2);//automatic type promotion
		System.out.println(result);
		
		int result2=myshort1*myshort2;
		System.out.println(result2);
		
		//Floating values
		double d=34.5;
		float myf=(float)d;//convert a 64 bit to 32 bit
		
		//character
		char ch=64;
		char chh='a';
		int ff=(int)chh;
		System.out.println(ff);
		System.out.println(ch);
		System.out.println(chh);
		
		boolean boo=true;
		boolean boo1=false;
		
	}
}
