package mod1.day19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo7 {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		InterviewHall hall1=new InterviewHall();
		InterviewHall hall2=new InterviewHall();
		
		es.execute(new InterviewJob(hall1,"ramu"));
		es.execute(new InterviewJob(hall1,"somu"));
		
		es.shutdown();
	}
}
class InterviewJob implements Runnable{
	InterviewHall hall;String name;
	public InterviewJob(InterviewHall hall,String name) {
		this.name=name;this.hall=hall;
	}
	@Override
	public void run() {
		Thread.currentThread().setName(name);
		//synchronized(hall) {
		//synchronized(InterviewHall.class) {
		if(name.equals("somu")) {
			hall.firstPerson();
			hall.secondPerson();}
		else {
			hall.water();
			//hall.firstPerson();
		}
			//hall.toilet.useToilet();
		//}
	}
}
class Toilet1{
	public void useToilet() {
		String name=Thread.currentThread().getName();
		System.out.println("Toilet used by..:"+name);
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println("came out of toilet...:"+name);
	}
}
class InterviewHall{
	static Toilet1 toilet=new Toilet1();
	synchronized public void firstPerson() {
		String name=Thread.currentThread().getName();
		System.out.println("First person interviewing started...:"+name);
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println("First person interview is over...."+name);
	}
	
	synchronized public void secondPerson() {
		String name=Thread.currentThread().getName();
		System.out.println("Second person interviewing...:"+name);
	}
	public void water() {
		String name=Thread.currentThread().getName();
		System.out.println("water consumed by...:"+name);
	}
}