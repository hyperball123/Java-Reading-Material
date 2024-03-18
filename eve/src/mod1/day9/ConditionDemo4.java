package mod1.day9;

public class ConditionDemo4 {
	public static void main(String[] args) {
		/*
		 * switch-case
		 * work on values
		 * 
		 */
		//The below are the four possible values you can take for switch case
		int i=40;
		char c='a';
		String s="ramu";//jdk 7
		MyEnum e=MyEnum.apple;//jdk 5
		
		switch(i) {
		case 10:{
			System.out.println("no 10 is identified....");
			break;
		}
		case 20:{
			System.out.println("no 20 is identified...");
			break;
		}
		default:{
			System.out.println("default block executed...");
			break;
		}
		case 30:{
			System.out.println("no 30 is identified");
			break;
		}
		
		}
		
		
	}
}

