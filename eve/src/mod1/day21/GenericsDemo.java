package mod1.day21;

import java.util.Scanner;

public class GenericsDemo {
	public static void main(String[] args)throws Exception {
		PaintBrushSpecific pb=new PaintBrushSpecific();//bad
		GenericBadPaintBrush gpb=new GenericBadPaintBrush();//bad
			
//		Scanner scan=new Scanner(System.in);
//		String className=scan.next();
		//pb.paint=(Paint)Class.forName(className).getConstructor().newInstance();
		//pb.doPaint();
//		gpb.obj=Class.forName(className).getConstructor().newInstance();
//		gpb.executeWork();
		
		GenericPaintBrush<Water> gpbw=new GenericPaintBrush<>();
		gpbw.setObj(new Water());
		Water w=gpbw.getObj();
		w.sprinkle();
		
		GenericPaintBrush<Paint> gpbP=new GenericPaintBrush<>();
		gpbP.setObj(new RedPaint());
		Paint p=gpbP.getObj();
		p.colorExecute();
		
	}
}

class PaintBrushSpecific{
	Paint paint;
	public void doPaint() {
		System.out.println(paint);
	}
}
class GenericBadPaintBrush{
	Object obj;
	public void executeWork() {
		if(obj instanceof Paint) {
			Paint paint=(Paint)obj;
			paint.colorExecute();
		}
		else if(obj instanceof Water) {
			Water water=(Water)obj;
			water.sprinkle();
		}
		else {
			DryAir dryAir=(DryAir)obj;
			dryAir.doDusting();
		}
	}
}

class GenericPaintBrush<T>{
	T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}
class Water{
	public Water() {
		// TODO Auto-generated constructor stub
	}
	public void sprinkle() {
		System.out.println("sprinkling water...");
	}
}
class DryAir{
	public DryAir() {
		// TODO Auto-generated constructor stub
	}
	public void doDusting() {
		System.out.println("dusting done by brush...");
	}
}
class Pastry{
	public Pastry() {
		// TODO Auto-generated constructor stub
	}
	public void doCakePastry() {
		System.out.println("pastry work done...");
	}
}
abstract class Paint{
	public abstract void colorExecute();
}
class RedPaint extends Paint{
	 public RedPaint() {
		
	}
	 @Override
	public void colorExecute() {
		 System.out.println("red paint colour...");
	}
}
class BluePaint extends Paint{
	public BluePaint() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void colorExecute() {
		System.out.println("blue paint colour...");	
	}
}