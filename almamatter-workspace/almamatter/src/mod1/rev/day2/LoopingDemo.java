package mod1.rev.day2;

public class LoopingDemo {
	public static void main(String[] args) {
		//while, do-while, for
		//while - pre checking loop and do-while - post checking loop and for - iterative loop
		
		int i=10;
		
		while(i<10) {//pre condition check
			System.out.println("while loop...:"+i);
			i++;
		}
		
		i=10;
		do {//post condition check
			System.out.println("do while loop...:"+i);
			i++;
		}while(i<10);
		
		//while(true) {}//infinite loop
		//do {}while(true);//infinite loop
		//for(;;);//infinite loop
		//for(intialization(1-only once);condition check(2);increment or decrement(4)){(3)}
		
		for(int n=0;n<10;n++) {
			System.out.println(n);
		}
	}
}
