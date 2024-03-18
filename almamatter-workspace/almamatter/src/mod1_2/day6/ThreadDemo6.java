package mod1_2.day6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * scenario is
 * One Object
 * Two Threads
 * Two tasks
 */
public class ThreadDemo6 {
	public static void main(String[] args) {
		ReservationCounter central=new ReservationCounter();
		
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(new BookingJob(central,"ram",1000));
		es.execute(new BookingJob(central,"rahim",500));
		
		es.shutdown();
	}
}
class BookingJob implements Runnable{
	ReservationCounter counter;int amt;String name;
	public BookingJob(ReservationCounter counter,String name,int amt) {
		this.counter=counter;
		this.amt=amt;
		this.name=name;
	}
	@Override
	public void run() {
		Thread.currentThread().setName(name);
		//synchronized(counter) {//OBJECT LOCK - PESIMISTIC LOCK
			counter.bookTicket(amt);
			counter.getChange();
		//}
	}
}
class ReservationCounter{
	int amt;
	synchronized public void bookTicket(int amt) {
		Thread t=Thread.currentThread();
		String name=t.getName();
		this.amt=amt;
		System.out.println("Ticket Booked by..:"+name+" amount is..:"+amt);
	}
	
	synchronized public void getChange() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("Change given to..:"+name+" amount is..:"+(amt-100));
	}
}
