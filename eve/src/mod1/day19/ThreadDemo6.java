package mod1.day19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo6 {
	public static void main(String[] args) {
		CounsellingHall hall=new CounsellingHall();
		ExecutorService es=Executors.newFixedThreadPool(3);
		es.execute(new CounsellingJob(hall,"blue"));
		es.execute(new CounsellingJob(hall,"red"));
		es.execute(new CounsellingJob(hall,"green"));
	
		
		es.shutdown();
	}
}
class CounsellingJob implements Runnable{
	CounsellingHall hall;String name;
	public CounsellingJob(CounsellingHall hall,String name) {
		this.hall=hall;
		this.name=name;
	}
	 @Override
	public void run() {
		Thread.currentThread().setName(name);
		if(name.equals("red")) {
			hall.water();
			hall.table1();
			hall.table2();
			hall.table3();
		}else {
			hall.table1();
			hall.table2();
			hall.table3();
		}
	}
}
class CounsellingHall{
	synchronized public void table1() {
		String name=Thread.currentThread().getName();
		System.out.println("table 1 job started..."+name);
		//try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println("table 1 job completed.."+name);
	}
	synchronized public void table2() {
		String name=Thread.currentThread().getName();
		System.out.println("table 2 job started..."+name);
		//try {Thread.sleep(3000);}catch(Exception e) {}
		System.out.println("table 2 job completed.."+name);
	}
	synchronized public void table3() {
		String name=Thread.currentThread().getName();
		System.out.println("table 3 job started..."+name);
		try {Thread.sleep(4000);}catch(Exception e) {}
		System.out.println("table 3 job completed.."+name);
	}
	public void water() {
		String name=Thread.currentThread().getName();
		System.out.println("drinking water....."+name);		
	}
}