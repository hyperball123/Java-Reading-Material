package mod1_2.day2;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		Lady ladyGaga=new Lady();
		ladyGaga.buyDress();
	}
}

class Lady{
	public void buyDress() {//throws Exception {
		ShoppingMall alsa=new ShoppingMall();
		try {
			alsa.dressChangeRoom();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}

class ShoppingMall{
	boolean lock;
	public void dressChangeRoom()throws Exception {
		lock=true;
		if(lock) {
			throw new Exception();
		}
	}
}



class House {
	boolean dog=true;
	public void enter()throws Exception {
		if(dog) {
			throw new Exception();
		}
	}
}

class LLRLicenceDriver{
	boolean novice=true;
	public void drives()throws Exception {
		if(novice) {
			throw new Exception();
		}
	}
}

class Road{
	boolean potHole=true;
	public void drive()throws Exception {
		if(potHole) {
			throw new Exception();
		}
	}
}


