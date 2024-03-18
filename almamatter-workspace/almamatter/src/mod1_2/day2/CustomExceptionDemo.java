package mod1_2.day2;

public class CustomExceptionDemo {
	public static void main(String[] args) {
		ATM bobATM=new ATM();
		
		try {
			
			bobATM.withDrawMoney(1000);
			
		}catch(WithDrawLimitException we) {
			System.out.println(we);
			System.out.println("Due to demonotisation the withdraw limit is fixed at Rs. 2000/-");
		}
		catch(InsufficientFundsException s) {
			System.out.println(s);
			System.out.println("Increase your funds.....");
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("unknown ....");
		}
	}
}

class ATM{
	public void withDrawMoney(int amt)throws Exception {
		int balance=1000;
		if(amt>=2000) {
			throw new WithDrawLimitException();
		}
		if(amt>=1000) {
			throw new InsufficientFundsException("You dont have enough balance in account...");
		}
	}
}

class WithDrawLimitException extends Exception{
	@Override
	public String toString() {
		return "The exception is withdrawlimit exception.....";
	}
}

class InsufficientFundsException extends Exception{
	String msg;
	public InsufficientFundsException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception is...:"+this.msg;
	}
}