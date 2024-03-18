package mod1_2.day6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo9 {
	public static void main(String[] args) {
		Toilet sulab=new Toilet();
		Toilet sulab2=new Toilet();
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(new ToiletJob(sulab,"salman",1000));
		es.execute(new ToiletJob(sulab2,"sharuk",500));
		es.shutdown();
	}
}
class ToiletJob implements Runnable{
	Toilet toilet;String name;int qty;
	public ToiletJob(Toilet sulabInternational, String name,int qty) {
		this.toilet=sulabInternational;
		this.name=name;
		this.qty=qty;
	}
	@Override
	public void run() {
		Thread.currentThread().setName(name);
		//synchronized(toilet) {
		synchronized(Toilet.class) {//creates a lock simillar to object lock on static methods
			Toilet.useToilet(qty);
			Toilet.washHandsLegs();
		}
	}
}
class Toilet{
	static int water;
	public  static void useToilet(int water) {
		Toilet.water=water;
		String name=Thread.currentThread().getName();	
		System.out.println(name+" using the toilet...");
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			
		}
		System.out.println(name +" is out of toilet...");
	}
	
	public  static void washHandsLegs() {
		String name=Thread.currentThread().getName();	
		System.out.println(name+" washing hands and legs...."+(Toilet.water-100));
		
	}
}