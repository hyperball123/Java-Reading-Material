package mod1.day19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo4 {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		ReservationCounter central=new ReservationCounter();
		
		es.execute(new ReservationJob(central,"ram",1000));
		es.execute(new ReservationJob(central,"rahim",500));
		
		es.shutdown();
	}
}
class ReservationJob implements Runnable{
	ReservationCounter counter;String name;int amt;
	public ReservationJob(ReservationCounter counter,String name,int amt) {
		this.counter=counter;
		this.name=name;
		this.amt=amt;
	}
	@Override
	public void run() {
		Thread.currentThread().setName(name);
		synchronized(counter) {
			counter.bookTicket(amt);
			counter.giveChange();
		}
	}
}
class ReservationCounter{
	int amt;
	public void bookTicket(int amt) {
		this.amt=amt;
		String name=Thread.currentThread().getName();
		System.out.println("Ticket booked by...:"+name);
		System.out.println("Amount carried by...:"+name+" is..:"+amt);
	}
	
	public void giveChange() {
		String name=Thread.currentThread().getName();
		System.out.println("Change given to...:"+name);
		System.out.println("Change Amount carried by...:"+name+" is..:"+(amt-100));
	}
}