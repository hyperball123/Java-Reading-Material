package mod1.day18;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//Thread is a task with in a task
public class ThreadDemo1 {
	public static void main(String[] args)throws Exception {
		//Executor Service will create a thread 
				
//      **** Don't use this ********	
		//this was before jdk5
		//first way
		//class A extends Thread{} - very bad, never use this
//		Thread thread=new Thread(new ThreadJob());//- its also bad, never use this
//		thread.start();
		
		//instead use ExecutorService to create threads..
		//introduced in jdk5
		ExecutorService es=Executors.newFixedThreadPool(2);
		Thread t=Thread.currentThread();
		
		System.out.println(t);
		System.out.println("first line");
		es.execute(new ThreadJob());
		Future<String> future= es.submit(new ThreadJob2());
		System.out.println(future.get());
		es.shutdown();
	}
	public static void met() {
		
	}
}
//Runnable is never ever used to create threads,  it is a interface to define the job of the
//thread.  It provides the implementation of the job of the thread.
//the run method is automatically called when the execute method of the executorservice is called..
class ThreadJob implements Runnable{
	@Override
	public void run() {
		System.out.println("second line.started..");
		try{Thread.sleep(10000);}catch(Exception e) {}
		System.out.println("second line..ends...");
	}
}
class ThreadJob2 implements Callable<String>{
	@Override
	public String call() throws Exception {
		System.out.println("third line.started..");
		try{Thread.sleep(5000);}catch(Exception e) {}
		System.out.println("third line..ends...");
		return "third line job is over.......";
	}
}
