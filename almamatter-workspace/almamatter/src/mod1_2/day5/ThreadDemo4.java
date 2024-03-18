package mod1_2.day5;

public class ThreadDemo4 {
	public static void main(String[] args) {
		OnionCuttingJob ocj=new OnionCuttingJob();
		VegCuttingJob vcj=new VegCuttingJob();
		RiceBoilingJob rbj=new RiceBoilingJob();
		
//		ocj.cutOnions();
//		vcj.cutVeg();
//		rbj.boilRice();
		
		Thread onionCutter=new Thread(ocj);
		Thread vegCutter=new Thread(vcj);
		Thread riceBoiler=new Thread(rbj);
		
		onionCutter.start();
		vegCutter.start();
		riceBoiler.start();
		
		System.out.println("main thread has started all child threads....");
	}
}

class OnionCuttingJob implements Runnable{
	@Override
	public void run() {
		cutOnions();
	}
	public void cutOnions() {
		System.out.println("cutting onions...");
		for(int i=0;i<100;i++) {
			System.out.print("Onions Cut...:"+i+"\t");
			if(i==50) {
				try {Thread.sleep(10000);}catch(Exception e) {}
			}
		}
		System.out.println("onion cutting over....");
	}
}
class VegCuttingJob implements Runnable{
	@Override
	public void run() {
		cutVeg();
	}
	public void cutVeg() {
		System.out.println("cutting vegetables...");
		for(int i=0;i<100;i++) {
			System.out.print("Veg Cut...:"+i+"\t");
			if(i==50) {
				try {Thread.sleep(5000);}catch(Exception e) {}
			}
		}
		System.out.println("Veg cutting over...");
	}
}
class RiceBoilingJob implements Runnable{
	@Override
	public void run() {
		boilRice();
	}
	public void boilRice() {
		System.out.println("boiling Rice...");
		for(int i=0;i<100;i++) {
			System.out.print("Rice boiled...:"+i+"\t");
			if(i==50) {
				try {Thread.sleep(10000);}catch(Exception e) {}
			}
		}
		System.out.println("rice boiling over..");
	}
}