package mod1_2.day1;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		System.out.println("before exception...");
		try {
			int i=1/Integer.parseInt(args[0]);
		}catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("enter a number other than zero");
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
			System.out.println("enter a number in command line....");
		}
		catch(NumberFormatException ne) {
			System.out.println(ne);
			System.out.println("enter a number not a character....");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally blocked....");
		}
		System.out.println("after exception...");
	}
}
