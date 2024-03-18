package mod1.day17;

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Before the division....");
		try {
			int i=1/Integer.parseInt(args[0]);//dividing a number by zero is a abnormal condition..
		}catch(ArrayIndexOutOfBoundsException aee) {
			System.out.println("Please enter a numerical value in the commond line...");
			System.out.println(aee);
		}
		catch(NumberFormatException ne) {
			System.out.println("Please enter a valid number...characters cannot be used for division..");
			System.out.println(ne);
		}
//		catch(Exception e) {
//			System.out.println("unknown.........exception"+e);
//		}
		finally {
			System.out.println("finally called..");
		}
		System.out.println("After the division...");
	}
}
/*
A program will not be terminated on exception, if the exception causing code is
placed inside the try catch block.

finally block gets called in all conditions
1.  Whether an exception arises or not.
2.  Whether an exception is handled or not
in all sense, finally will be called...

*/