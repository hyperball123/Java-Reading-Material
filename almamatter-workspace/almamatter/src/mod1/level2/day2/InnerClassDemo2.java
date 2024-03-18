package mod1.level2.day2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InnerClassDemo2 {
	public InnerClassDemo2() {
		System.out.println("calling this constructor logic in place of run method....");
	}
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(1);
		
//		es.execute(new MyThreadJob());
		
//		es.execute(new Runnable() {			
//			@Override
//			public void run() {
//				System.out.println("child thread called...");
//			}
//		});
		Runnable r=null;
		
	//	r=InnerClassDemo2::myThreadJob;//Method Referencing...
		
	//	r=new InnerClassDemo2()::myThreadJob2;//method referencing non static method
		
	//	r=InnerClassDemo2::new;
		
		r=()->{System.out.println("child thread logic called from lambdas....");};
		
		es.execute(r);
		
		
		
		System.out.println("main thread working....");
		
		es.shutdown();
	}
	
	public static void myThreadJob() {
		System.out.println("Child thread called.from method referencing..");
	}
	public void myThreadJob2() {
		System.out.println("non static child thread called from method referencing...");
	}
}

//class MyThreadJob implements Runnable{
//	@Override
//	public void run() {
//		System.out.println("child thread called..");
//	}
//}
