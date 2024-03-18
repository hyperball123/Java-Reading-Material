package mod1_2.day1;

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("life before exception.....");
		try {
			int i=1/Integer.parseInt(args[0]);
		}catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("Please enter a number other than zero, because as per mathematics u cannot divide a number by zero");
			
		}catch(ArrayIndexOutOfBoundsException ae) {
			ae.printStackTrace();
			System.out.println("please enter a value in command line...");
		}
		catch(NumberFormatException ne) {
			ne.printStackTrace();
			System.out.println("please enter a number not a character....");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("unknown....");
		}
		finally {
			System.out.println("finally block....");
			/*
			 * finally gets called all time
			 * whether exception arises or not
			 * whether exception is handled or not
			 * finally always gets called
			 * 
			 */
		}
		System.out.println("life after exception");
	}
}
