package hit.day20.inter;

public class CanaraBank implements Depositor,Teller{
	@Override
	public void acceptCash(int money) {
		System.out.println("canara bank depositor accepting cash....:"+money);
	}
	@Override
	public int withDrawCash() {
		// TODO Auto-generated method stub
		System.out.println("with draw cash initiated by canara bank");
		return 100;
	}
}
