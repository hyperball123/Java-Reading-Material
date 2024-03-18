package hit.day20;

public class WrapperDemo {
	public static void main(String[] args) {
		/*
		 * int - Integer
		 * float - Float
		 * byte - Byte
		 * char - Character
		 * short - Short
		 * long - Long
		 * boolean - Boolean
		 * double - Double
		 */
		
		// how to create or convert simple to complex
		//before jdk5
			int i=10;
			//boxing
			Integer ii=new Integer(i);//before jdk5
			Integer iii=Integer.valueOf(i);//after jdk9
			//unboxing
			int n=ii.intValue();//to read the int value of the integer object we use this method
			
		//after jdk5
			//autoboxing and autounboxing
			Integer nn=i;
			Integer nnn=10;
			
			int x=nn;//auto unboxing
			int xx=Integer.valueOf(200);
			
			//all wrapper classes have utility plenty of methods
			System.out.println(Integer.MAX_VALUE);
			System.out.println(Byte.MAX_VALUE);
			System.out.println(Byte.MIN_VALUE);
			
			System.out.println(Integer.compare(10, 20));//0 if both are equal, 1 if first value is greated
			//and -1 if first value is smaller
			
			System.out.println(Integer.max(10, 20));
			System.out.println(Integer.min(10, 20));
			
			String x1=args[0];
			String x2=args[1];
			System.out.println(x1+x2);
			
			int x11=Integer.parseInt(x1);
			int x22=Integer.parseInt(x2);
			System.out.println(x11+x22);
	}
}
