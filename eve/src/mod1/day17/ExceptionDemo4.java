package mod1.day17;

public class ExceptionDemo4 {
	public static void main(String[] args) {
		ATM atm=new ATM();
		Customer ambani=new Customer();
		ambani.withdraw(atm, 8240329);
		
	}
}
class Customer{
	public void withdraw(ATM atm,int amount) {
		try {
			atm.withdrawMoney(amount);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
class CashNotAvailableException extends Exception{
	String msg;
	public CashNotAvailableException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception Arised...and it...is....:"+msg;
	}
}
class ATM{
	int atmBalance=10000;
	public int withdrawMoney(int amt) throws CashNotAvailableException{
		if(atmBalance<=amt) {
			throw new CashNotAvailableException("ATM does not have that much cash...");
		}
		else {
			return amt;
		}
	}
}