package mod1.day13;
/*
 * Static keyword
 * I can create 
 * a. static block
 * b. static fields
 * c. static methods
 * d. static class
 * e. static inner class
 * 
 * CLASS LEVEL - STATIC
 */
public class ClassesAndObjects {
	public static void main(String[] args) {
		TrainingRoom nehru=new TrainingRoom();
		TrainingRoom gandhi=new TrainingRoom();
		
		System.out.println(nehru.sanyo);
		System.out.println(gandhi.sanyo);
		
		System.out.println(nehru.sulab);
		System.out.println(gandhi.sulab);
		
		System.out.println(TrainingRoom.sulab);
		System.out.println(TrainingRoom.sulab);
	}
}
class TrainingRoom{
	Projector sanyo=new Projector();//instance variable
	static Toilet sulab=new Toilet();//class variable - the instance of toilet is created by JVM
}

class Projector{
	public Projector() {
		System.out.println("new Projector object created...");
	}
}
class Toilet{
	public Toilet() {
		System.out.println("toilet object created...");
	}
}