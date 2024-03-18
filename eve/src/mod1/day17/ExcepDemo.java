package mod1.day17;

public class ExcepDemo {
	public static void main(String[] args) {
		System.out.println("before exception");
		try {
			int i=1/0;//this is a abnormal condition
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("after exception");
	}
}
