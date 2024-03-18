package hit.day8.revision;

public class LoopingDemo {
	public static void main(String[] args) {
		//while - pre-condition check is done...
		//do-while - post condition check is done...
		
		int x=5;
		boolean boo=x<10;
		while(x==10) {// precondition check....
			System.out.println("while loop.........:"+x);
			x++;
		}
		
		do {
			System.out.println("do while called..............");
		}while(x==10);//post condition check.....
		
		//nested for loop
		for(int i=0;i<5;i++) {//runs 5 times
			for(int j=0;j<5;j++) {//runs 25 times
				System.out.print("*"+"\t");
			}
			System.out.println();
		}
		
		for(int z=0;z<10;++z) {
			System.out.println("for looppppppppppppp....:"+z);//first condition, then printing, then  increment
			
		}
	}
}
