package mod1.day12;

public class ClassesAndObjects2 {
	public static void main(String[] args) {
		Car maruti=new Car();
		System.out.println("Current Gear..:"+maruti.getGear());
		maruti.changeGear();
		maruti.changeGear();
		System.out.println("Current Gear..:"+maruti.getGear());
	}
}

class Car{
	int gear=0;
	String address=null;
	public void askAddress() {
		address="gandhi street";
	}
	public void changeGear() {
		if(gear==0) {
			gear=1;
		}
		else if(gear==1) {
			gear=2;
		}
		else if(gear==2) {
			gear=3;
		}
		else {
			gear=0;
		}
	}
	public int getGear() {
		return gear;
	}
}