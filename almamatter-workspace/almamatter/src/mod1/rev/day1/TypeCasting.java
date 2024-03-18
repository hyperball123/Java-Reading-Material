package mod1.rev.day1;

public class TypeCasting {
	public static void main(String[] args) {
		int i=257;//32 bit
		
		byte age=(byte)i;//8 bit - downcasting int to byte
		short s=(short)i;
		
		//System.out.println(age);
		System.out.println(s);
		
		long l=i;//upcasting - auto type promotion will happen 32 being stored in 64
		
		System.out.println(l);
		
		float f=100.2f;//32 bit
		int n=(int)f;//32 bit
		System.out.println(n);
		float ff=n;
		
		char c='a';
		char cc=97;
		System.out.println(c);
		System.out.println(cc);
		int nn=c;
		System.out.println((char)nn);
		char ccc=(char)nn;
		
		
	}
}
