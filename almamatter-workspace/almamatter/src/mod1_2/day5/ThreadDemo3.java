package mod1_2.day5;

public class ThreadDemo3 {
	public ThreadDemo3() {
		Thread t=new Thread(new MyJob2());
		t.start();
	}
	public static void main(String[] args) {
		new ThreadDemo3();
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}

class MyJob2 implements Runnable{
	@Override
	public void run() {
		System.out.println("child thread called...");
	}
}