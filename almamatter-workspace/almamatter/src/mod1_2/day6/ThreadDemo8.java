package mod1_2.day6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * Inter Thread Communication in this example
 * Scenario - One object, two threads, one task
 * Operating a GUN...(Two threads filler and shooter operate a gun for a 
 * single task which is to hit the enemy
 * 
 */
public class ThreadDemo8 {
	public static void main(String[] args) {
		Gun bofors=new Gun();
		ExecutorService es=Executors.newFixedThreadPool(2);
		
		es.execute(new OperateGunJob(bofors,"ram"));
		es.execute(new OperateGunJob(bofors,"shyam"));
		es.shutdown();
	}
}

class OperateGunJob implements Runnable {
	Gun gun;String name;
	public OperateGunJob(Gun gun,String name) {
		this.gun=gun;
		this.name=name;
	}
	@Override
	public void run() {
		Thread.currentThread().setName(name);
		for(int i=0;i<10;i++) {
			if(name.equals("ram")) {
				gun.fillGun();
			}
			else {
				gun.shootGun();
			}
		}
	}
}
/*
 * Remember if a thread is waiting inside a monitor, then another thread can enter the monitor
 * but this is not the case with thread sleeping inside a monitor
 */
class Gun{
	boolean gunLoadedFlag;
	synchronized public void fillGun() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		if(gunLoadedFlag) {
			try {wait();}catch(Exception e) {}
		}
		else {
			System.out.println("Filling the gun..."+name);
			gunLoadedFlag=true;
			notify();
		}
	}
	
	synchronized public void shootGun() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		if(!gunLoadedFlag) {
			try {wait();}catch(Exception e) {}
		}
		else {
			System.out.println("Shooting the gun..."+name);
			gunLoadedFlag=false;
			notify();
		}
	}
}