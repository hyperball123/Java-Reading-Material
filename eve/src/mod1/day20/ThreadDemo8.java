package mod1.day20;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//one object -two threads - one task
public class ThreadDemo8 {
public static void main(String[] args) {
	ExecutorService es=Executors.newFixedThreadPool(2);
	Canon bofors=new Canon();
	es.execute(new OperateCanon(bofors,"filler"));
	es.execute(new OperateCanon(bofors, "shooter"));
	es.shutdown();
}
}
class OperateCanon implements Runnable{
	Canon canon;String name;
	public OperateCanon(Canon canon,String name) {
		this.canon=canon;
		this.name=name;
	}
	@Override
	public void run() {
		if(name.equals("filler")) {
			for(int i=0;i<5;i++) {
				canon.fill();
			}
		}
		else {
			for(int i=0;i<5;i++) {
				canon.shoot();
			}
		}
	}
}
class Canon{
	boolean flag;
	synchronized public void fill() {
		if(flag) {
			try {wait();}catch(Exception e) {}
		}
		System.out.println("fills the gun...");
		flag=true;
		notify();
	}
	
	synchronized public void shoot() {
		if(!flag) {
			try {wait();}catch(Exception e) {}
		}
		System.out.println("shoots the gun...");
		flag=false;
		notify();
	}
}