package mod1.day9;

public class LoopingDemo1 {
	public static void main(String[] args) {
		int i=10;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		/*
		 * while - does a pre condition check.
		 * 
		 * do-while - does a post condition check
		 */
		do {
			System.out.println(i);
			i++;
		}while(i<10);
		
		while(true) {
			//infinite loop
			System.out.print(++i+"\b\r");
		}
		
	}
}
