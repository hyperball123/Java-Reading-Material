package hit.day6;

public class LoopingDemo {
	public static void main(String[] args) {
		int x=10;
		
		System.out.println((x%2==0)?"i am for true":"i am for false");
		
		while(x>0) {// pre condition check...
			if(x%2==0) {
				System.out.println("Even number......."+x);
			}
			else {
				System.out.println("odd number.........................."+x);
			}
			--x;
		}
		
		x=10;// re initializing the value of x to 10 again
		
		do {//post condition check...
			//String s=(true)?"Even Number..."+x:"Odd Number....."+x;
			
			--x;
		}while(x>0);
	}
}
