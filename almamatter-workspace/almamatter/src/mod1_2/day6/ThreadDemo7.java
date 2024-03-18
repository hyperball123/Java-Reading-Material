package mod1_2.day6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo7 {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(3);
		CounsellingHall hall=new CounsellingHall();
		es.execute(new CounselingJob(hall, "ram"));
		es.execute(new CounselingJob(hall, "rahim"));
		es.execute(new CounselingJob(hall, "john"));
		
		es.shutdown();
	}
}
class CounselingJob implements Runnable{
	CounsellingHall hall;String name;
	public CounselingJob(CounsellingHall hall,String name) {
		this.hall=hall;this.name=name;
	}
	@Override
	public void run() {
		Thread.currentThread().setName(name);;
		synchronized (hall) {					
		if(name.equals("rahim")) {
			hall.water();
			hall.checkCredentials();
			hall.doAdmission();
		}
		else {
			hall.checkCredentials();
			hall.doAdmission();
		}
		}
	}
}
class CounsellingHall{
	 public void checkCredentials() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("Credential check Process ..:"+name);
	}
	 public void doAdmission() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("Admission  Process ..:"+name);
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println("Admission over...."+name);
	}
	
	public void water() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("Drinking water ..:"+name);
	}
}