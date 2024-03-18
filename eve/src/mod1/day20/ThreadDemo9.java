package mod1.day20;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo9 {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		Crane c=new Crane();
		Frog f=new Frog();
		es.execute(new DeadLockJob(c,f,"crane"));
		es.execute(new DeadLockJob(c,f,"frog"));
		es.shutdown();
	}
}
class DeadLockJob implements Runnable{
	Crane c;Frog f;String name;
	public DeadLockJob(Crane c,Frog f,String name) {
		this.c=c;
		this.f=f;
		this.name=name;
	}
	@Override
	public void run() {
		Thread.currentThread().setName(name);
		if(name.equals("crane")) {
			c.eat(f);
		}
		else {
			f.escape(c);
		}
		
	}
}
class Crane{
	synchronized public void eat(Frog f) {
		System.out.println();
		f.leaveCrane();
	}
	synchronized public void leaveFrog() {
		
	}
}
class Frog{
	synchronized public void escape(Crane crane) {
		crane.leaveFrog();
	}
	synchronized public void leaveCrane() {
		
	}
}