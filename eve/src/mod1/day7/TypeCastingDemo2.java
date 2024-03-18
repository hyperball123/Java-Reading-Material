package mod1.day7;

public class TypeCastingDemo2 {
	/*
	 * number types - byte,short,int,long
	 * float types - float and double
	 * char - char
	 * boolean - true or false
	 * 
	 */
	public static void main(String[] args) {
		//variable declaration
		//valid names
		byte b$_2e;
		/*
		 * valid names
		 * int age;
		 * int 2age;//you cannot start with a number
		 * int #age;//you cannot have any other special character than $ and _
		 * int a ge;//you cannot have space inbetween
		 * int void;//you cannot have java key words as variable names
		 * 
		 * int a2ge;//valid name - number can be inbetween
		 * int $age;//valid name
		 * int _age;//valid name
		 * int a_g_e;//valid name
		 * int a2g_e;//valid name
		 * int a_2_$_ge;//valid name
		 */
		/*
		 * 
		 */
		short s;
		int i;
		long l;
		
		//variable initialization
		byte b=100;
		short ss=31344;
		int ii=3434444;
		
		char c='a';
		char cc=97;
		
		float f=100;
		float ff=100.23434f;
		System.out.println(ff);
		double d=23.45;
		
		boolean boo=true;
		boolean boo2=false;
		
		//type casting
		int n=257;
		byte bbb=(byte)n;//int is downsized to byte - for that explicit casting is compulsory
		System.out.println(bbb);
		System.out.println(bbb+256);
		
		long ll=n;//when u promote a small type to a big type - auto promotion will apply
		
		char ccc='a';
		char cccc=97;
		System.out.println(ccc);
		System.out.println(cccc);
		
		int nnn=169;
		char c1=(char)nnn;
		System.out.println((char)nnn);
		
		
	}
}
