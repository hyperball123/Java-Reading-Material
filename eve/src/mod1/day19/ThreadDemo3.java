package mod1.day19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo3 {
	public static void main(String[] args) {
		Kitchen kitchen=new Kitchen();
		ExecutorService es=Executors.newFixedThreadPool(3);
		es.execute(new BriyaniMakingJob(kitchen,"onioncutter"));
		es.execute(new BriyaniMakingJob(kitchen,"vegcutter"));
		es.execute(new BriyaniMakingJob(kitchen,"riceboiler"));
		es.shutdown();
	}
}
class Kitchen{
	public void cutOnions() {
		System.out.println("cutting onions....");
		try {Thread.sleep(10000);}catch(Exception e) {}
		System.out.println("cutting onions completed...");
	}
	public void cutVegetables() {
		System.out.println("cutting vegetables...");
		try {Thread.sleep(10000);}catch(Exception e) {}
		System.out.println("cutting veg completed...");
	}
	public void boilRice() {
		System.out.println("boiling rice...");
		try {Thread.sleep(10000);}catch(Exception e) {}
		System.out.println("boiling rice completed...");
	}
}
class BriyaniMakingJob implements Runnable{
	String name;Kitchen kitchen;
	public BriyaniMakingJob(Kitchen kitchen,String name) {
		this.name=name;
		this.kitchen=kitchen;
	}
	@Override
	public void run() {
		Thread.currentThread().setName(name);
		if(name.equals("onioncutter")) {
			kitchen.cutOnions();
		}
		else if(name.equals("vegcutter")) {
			kitchen.cutVegetables();
		}
		else {
			kitchen.boilRice();
		}
		
	}
}