package mod1.day22;

import java.lang.reflect.Field;
import java.util.Scanner;

public class RefDemo2 {
	public static void main(String[] args) throws Exception{
		//Paint paint=new RedPaint(); - this creates a static binding
		PaintBrush<Water> waterBrush=WaterContainer.getWaterBrush();
		
		waterBrush.obj.sprinkle();
		
		PaintBrush<Paint> paintBrush=PaintContainer.getPaintBrush();
		paintBrush.obj.doPaint();
	}
}
class WaterContainer{
	@In(className = "mod1.day22.PureWater")
	private static PaintBrush<Water> brush;
	
	public static PaintBrush<Water> getWaterBrush()throws Exception {
		brush=new PaintBrush<>();
		WaterContainer waterC=new WaterContainer();
		Field f=waterC.getClass().getDeclaredField("brush");
		f.setAccessible(true);
		In in=(In)f.getAnnotation(In.class);
		String className=in.className();
		Water water=(Water)Class.forName(className).getConstructor().newInstance();
		WaterContainer.brush.setObj(water);
		return brush;
	}
}

class PaintContainer{
	@In(className = "mod1.day22.RedPaint")
	private static PaintBrush<Paint> brush;
	
	public static PaintBrush<Paint> getPaintBrush()throws Exception {
		brush=new PaintBrush<>();
		PaintContainer paintC=new PaintContainer();
		Field f=paintC.getClass().getDeclaredField("brush");
		f.setAccessible(true);
		In in=(In)f.getAnnotation(In.class);
		String className=in.className();
		Paint paint=(Paint)Class.forName(className).getConstructor().newInstance();
		PaintContainer.brush.setObj(paint);
		return brush;
	}
}
class PaintBrush<T>{
	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	T obj;
}
abstract class Water{
	public abstract void sprinkle();
}
class PureWater extends Water{
	public PureWater() {
		// TODO Auto-generated constructor stub
	}
	public void sprinkle() {
		System.out.println("sprinkling water...");
	}
}
class ImpureWater extends Water{
	public ImpureWater() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void sprinkle() {
		System.out.println("impure water sprinkled...");
	}
}

abstract class Paint{
	public abstract void doPaint();
}
class RedPaint extends Paint{
	public RedPaint() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void doPaint() {
		System.out.println("red paint painted.....");
	}
}
class BluePaint extends Paint{
	public BluePaint() {
		// TODO Auto-generated constructor stub
	}
		@Override
		public void doPaint() {
			System.out.println("blue paint painted......");
		}
}