package util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UtilDemo {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		RailwayStation central=new RailwayStation();
		es.execute(new LuggageJob(central,"rahim"));
		es.execute(new LuggageJob(central, "ram"));
		es.shutdown();
	}
}
class LuggageJob implements Runnable{
	RailwayStation central;String name;
	public LuggageJob(RailwayStation central,String name) {
		this.central=central;
		this.name=name;
	}
	@Override
	public void run() {
		Thread.currentThread().setName(name);
		
		if(name.equals("rahim")) {
			RailwayStation.add(new Suitcase(Thread.currentThread().getId(),name));
			System.out.println(RailwayStation.get().threadid);
			System.out.println(RailwayStation.get().threadid);
			RailwayStation.delete();
			RailwayStation.add(new Suitcase(Thread.currentThread().getId(),name));
			System.out.println(RailwayStation.get().threadid);
		}
		else if(name.equals("ram")) {
			RailwayStation.add(new Suitcase(Thread.currentThread().getId(),name));
			System.out.println(RailwayStation.get().threadid);
		}
	}
}
class RailwayStation{
	private static ThreadLocal<Suitcase> clockRoom=new ThreadLocal<>();
	
	public static void add(Suitcase suitcase) {
		String name=Thread.currentThread().getName();
		//System.out.println("Name...:"+name);
		Suitcase mysuitcase=clockRoom.get();
		if(mysuitcase!=null) {
			System.out.println("You already have a suitcase..remove that and add a new one..");
		}
		else {
			clockRoom.set(suitcase);
		}
	}
	public static Suitcase get() {
		String name=Thread.currentThread().getName();
		//System.out.println("Name...:"+name);
		Suitcase mysuitcase=clockRoom.get();
		if(mysuitcase==null) {
			System.out.println("You have not registered your luggage..");
			return null;
		}
		else {
			return clockRoom.get();
		}
	}
	public static void delete() {
		Suitcase mysuitcase=clockRoom.get();
		if(mysuitcase!=null) {
			clockRoom.remove();
		}
		else {
			System.out.println("Please first register your suitcase....");
		}
	}
}

class Suitcase{
	String threadid;String name;
	public Suitcase(long threadid,String name) {
		this.threadid=threadid+":"+this.hashCode()+":"+name;
	}
}