package mod1_2.day5;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadDemo5 {
	public static void main(String[] args)throws Exception {
		ExecutorService es=Executors.newFixedThreadPool(1);
		
		es.execute(new MyJob3());
		System.out.println("main thread running...");
		
		Future f=es.submit(new MyJob4());
		System.out.println(f.get());
		es.shutdown();
	}
}

class MyJob4 implements Callable{//fire and wait
	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		return "Hello World";
	}
}

class MyJob3 implements Runnable{//fire and forget
	@Override
	public void run() {
		System.out.println("child thread called...");
	}
}