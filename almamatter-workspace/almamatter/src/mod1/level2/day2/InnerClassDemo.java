package mod1.level2.day2;

public class InnerClassDemo {
	public static void main(String[] args) {
		Pepsi pepsiCo=new Pepsi();
		Kalimark bovonto=new Kalimark();
		
		pepsiCo.makeCola();
		bovonto.makeCola();
	}
}
abstract class Cola{
	public abstract void makeCola();
}


class Pepsi {
	public void makeCola() {
		//Cola cola=new Kalimark().new CampaCola();
		//Cola cola=new Kalimark.CampaCola();//calling a static inner class
		//cola.makeCola();
		System.out.println("fills campa cola in pepsi bottle...and sells.pepsicola..");
	}
}

class Kalimark{
	static int money=1010101;
	static public void canteen(Cola c) {}
	public static void makeCola() {
//		class CampaCola extends Cola{
//			@Override
//			public void makeCola() {
//				System.out.println(money);
//				canteen();
//				System.out.println("campa cola makes cola.....");
//			}
//		}
//		Cola cola=new CampaCola();
//		cola.makeCola();
		canteen(new Cola() {
			@Override
			public void makeCola() {
				
			}
		});
		new Cola() {			
			@Override
			public void makeCola() {
				System.out.println("campa cola makes cola.....");			
			}
		}.makeCola();
		System.out.println("fills campa cola in cola bottle ..and sells..bovontocola..");
	}
//	//Acquisition
//	static class CampaCola extends Cola{
//		@Override
//		public void makeCola() {
//			System.out.println(money);
//			canteen();
//			System.out.println("campa cola makes cola.....");
//		}
//	}
}