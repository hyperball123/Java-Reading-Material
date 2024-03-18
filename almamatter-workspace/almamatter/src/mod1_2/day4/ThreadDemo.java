package mod1_2.day4;

public class ThreadDemo {
	public static void main(String[] args)throws Exception {
		Thread t=Thread.currentThread();
		System.out.println(t);
		t.setName("my thread...");
		t.setPriority(10);
		System.out.println(t);
		
		for(int i=0;i<10;i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
}
