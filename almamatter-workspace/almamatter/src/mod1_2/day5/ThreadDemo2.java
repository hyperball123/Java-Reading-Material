package mod1_2.day5;

public class ThreadDemo2 {
	public static void main(String[] args) {
		Thread t=new Thread(new MyJob());
		t.start();
		try {Thread.sleep(1000);}catch(Exception e) {}
		System.out.println("main thread....");
	}
}

class MyJob implements Runnable{
	@Override
	public void run() {
		System.out.println("child thread called...");
	}
}