package mod1.day19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo5 {
	public static void main(String[] args) {
		Hall hall1=new Hall();
		Hall hall2=new Hall();
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(new ToiletJob(hall1,"sharukh"));
		es.execute(new ToiletJob(hall2,"salman"));
		
		es.shutdown();
	}
}

class ToiletJob implements Runnable{
	Hall hall;String name;
	public ToiletJob(Hall hall,String name) {
		this.hall=hall;
		this.name=name;
	}
	@Override
	public void run() {
		Thread.currentThread().setName(name);
		synchronized(Hall.class) {//class lock...
			hall.toilet.useToilet();
		}
	}
}
class Hall{
	static public Toilet toilet=new Toilet();
	public Hall() {
		System.out.println("hall object created...");
	}
}

class Toilet{
	public Toilet() {
		System.out.println("toilet object created...");
	}
	public void useToilet() {
		System.out.println("Inside the toilet...."+Thread.currentThread().getName());
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println("Outside the toilet...."+Thread.currentThread().getName());
	}
}