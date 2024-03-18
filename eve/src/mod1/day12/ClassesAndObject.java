package mod1.day12;

public class ClassesAndObject {
	public static void main(String[] args) {
		PaintBrush obj=new PaintBrush();
		obj.doPaint(1);
	}
}

class PaintBrush{
	public void doPaint(int i) {
		if(i==1) {
			System.out.println("red colour....");
		}
		else if(i==2) {
			System.out.println("blue colour....");
		}
		else {
			System.out.println("green colour....");
		}
	}
}