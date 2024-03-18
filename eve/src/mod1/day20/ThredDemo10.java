package mod1.day20;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThredDemo10 {
public static void main(String[] args) {
	ExecutorService es=Executors.newFixedThreadPool(2);
	Office office=new Office();
	
	es.execute(new OfficeEmployeeJob("ramu"));
	es.execute(new OfficeEmployeeJob("somu"));
	
	es.shutdown();
	
}
}
class OfficeEmployeeJob implements Runnable{
	String name;
	public OfficeEmployeeJob(String name) {
		
		this.name=name;
	}
	@Override
	public void run() {
		Thread.currentThread().setName(name);
		if(name.equals("ramu"))
		{
			System.out.println(Office.getLaptop()+":"+name);
			System.out.println(Office.getLaptop()+":"+name);
			System.out.println(Office.getLaptop()+":"+name);
			Office.returnLaptop();
			System.out.println(Office.getLaptop()+":"+name);
		}
		else {
			System.out.println(Office.getLaptop()+":"+name);
			System.out.println(Office.getLaptop()+":"+name);
		}
	}
}
class Laptop{
	public Laptop() {
		System.out.println("laptop object created...");
	}
}
class Office{
	private static ThreadLocal locker=new ThreadLocal();
	public static Laptop getLaptop() {
		Laptop laptop=(Laptop)locker.get();
		if(laptop==null) {
			laptop=new Laptop();
			locker.set(laptop);
			return laptop;
		}
		else {
			return laptop;
		}
	}
	public static void returnLaptop() {
		locker.remove();
	}
}