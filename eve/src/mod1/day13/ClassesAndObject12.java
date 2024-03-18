package mod1.day13;

public class ClassesAndObject12 {
	public static void main(String[] args) {
		SingleTon obj=SingleTon.getSingleTonObject();
		
		SingleTon obj2=SingleTon.getSingleTonObject();
		SingleTon.getSingleTonObject();
		SingleTon.getSingleTonObject();
		SingleTon.getSingleTonObject();
		SingleTon.getSingleTonObject();
		//new SingleTon();new SingleTon();new SingleTon();new SingleTon();
	}
}

class SingleTon{
	private SingleTon() {
		System.out.println("singleton object created...");
	}
	private static SingleTon singleTon;
	public static SingleTon  getSingleTonObject() {
		if(singleTon==null) {
			singleTon=new SingleTon();
		}
		return singleTon;
	}
}