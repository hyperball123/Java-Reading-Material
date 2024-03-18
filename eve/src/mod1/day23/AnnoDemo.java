package mod1.day23;

import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.Properties;

public class AnnoDemo {
	public static void main(String[] args)throws Exception {
		//ShoeShop shop=SimpleContainer.getShoeShop("official");
		//ShoeShop shop=DynamicContainerOld.getShoeShop("official");
		ShoeShop shop=DynamicContainerNew.getShoeShop("official");
		//System.out.println(shop.sellShoe());
	}
}
class DynamicContainerNew{
	public static ShoeShop getShoeShop(String status) throws Exception{
		ShoeFactory factory = null;
		RahimShoeShop shop=new RahimShoeShop();
		Class c=shop.getClass();
		//System.out.println(shop.getClass().getSuperclass().getDeclaredField("factory"));
		//Field f=shop.getClass().getSuperclass().getDeclaredField("factory");
		Field f=c.getDeclaredField("factory");
		
		f.setAccessible(true);
		In inj=(In)f.getAnnotation(In.class);
		System.out.println(inj);
		if(inj!=null) {
			String factoryClass=inj.factoryName();
			factory=(ShoeFactory)Class.forName(factoryClass).getConstructor().newInstance();
			System.out.println(factory);
			shop.setFactory(factory);
		}
		else {
			
		}
		//dependency injection
		
		return shop;
	}
}
class DynamicContainerOld{
	public static ShoeShop getShoeShop(String status) throws Exception{
		Properties prop=new Properties();
		if(status.equals("official")) {
			prop.load(new FileInputStream("config.properties"));
		}
		else {
			prop.load(new FileInputStream("config2.properties"));
		}
		String factoryClass=prop.getProperty("factory");
		String shopClass=prop.getProperty("shop");
		
		ShoeFactory factory=(ShoeFactory)Class.forName(factoryClass).getConstructor().newInstance();
		ShoeShop shop=(ShoeShop)Class.forName(shopClass).getConstructor().newInstance();
		//dependency injection
		//shop.setFactory(factory);
		return shop;
	}
}
class SimpleContainer{
	public static ShoeShop getShoeShop(String status) {
		ShoeFactory bFactory=new BataShoeFactory();
		ShoeFactory lFactory=new LakhaniShoeFactory();
		ShoeShop shop=new RahimShoeShop();
		
		//dependency injection
		if(status.equals("official")) {
		//	shop.setFactory(bFactory);
		}
		else {
			//shop.setFactory(lFactory);
		}
		return shop;
	}
}
interface Manufacturer{
	public Shoe makeShoe();
}
interface Seller{
	public Shoe sellShoe();
}
abstract class Shoe {}
class LeatherShoe extends Shoe{}
class SportsShoe extends Shoe{}
abstract class ShoeFactory implements Manufacturer{
	public abstract Shoe makeShoe();
}
class BataShoeFactory extends ShoeFactory{
	public BataShoeFactory() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public Shoe makeShoe() {
		return new LeatherShoe();
	}
}
class LakhaniShoeFactory extends ShoeFactory{
	public LakhaniShoeFactory() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public Shoe makeShoe() {
		return new SportsShoe();
	}
}
abstract class ShoeShop implements Seller{
	
	public abstract Shoe sellShoe();
	
}
class RahimShoeShop extends ShoeShop{
	public RahimShoeShop() {
		// TODO Auto-generated constructor stub
	}
	@In(factoryName = "mod1.day23.BataShoeFactory")
	public ShoeFactory factory;
	
	

	public ShoeFactory getFactory() {
		return factory;
	}
	public void setFactory(ShoeFactory factory) {
		this.factory = factory;
	}
	@Override
	public Shoe sellShoe() {
		// TODO Auto-generated method stub
		return getFactory().makeShoe();
	}
}
class RamShoeShop extends ShoeShop{
	public RamShoeShop() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public Shoe sellShoe() {
		// TODO Auto-generated method stub
		return getFactory().makeShoe();
	}
}