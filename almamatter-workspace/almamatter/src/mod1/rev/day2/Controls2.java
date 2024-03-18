package mod1.rev.day2;

public class Controls2 {
	public static void main(String[] args) {
		//switch case
		//switch case works on values rather than boolean
		
		int i=78;
		char c='f';
		String s="blabla";
		//enum - which I will cover later
		
		switch(i) {
		case 10:{
			System.out.println("the value selected is 10");
			break;
		}
		case 20:{
			System.out.println("the value selected is 20");
			break;
		}
		case 30:{
			System.out.println("the value selected is 30");
			break;
		}
		default:{
			System.out.println("you did not selected 10 or 20 or 30");
			break;
		}
		case 40:{
			System.out.println("the value selected is 40");
		}
		}
		
		switch(c) {
		case 'a':{
			System.out.println("the value selected is a");
			break;
		}
		case 'b':{
			System.out.println("the value selected is b");
			break;
		}
		case 'c':{
			System.out.println("the value selected is c");
			break;
		}
		default:{
			System.out.println("you did not selected a or b or c or d");
			break;
		}
		case 'd':{
			System.out.println("the value selected is d");
		}
		}
		
		switch(s) {
		case "ram":{
			System.out.println("the value selected is ram");
			break;
		}
		case "rahim":{
			System.out.println("the value selected is rahim");
			break;
		}
		case "sikh":{
			System.out.println("the value selected is sikh");
			break;
		}
		default:{
			System.out.println("you did not selected ram or rahim or sikh or john");
			break;
		}
		case "john":{
			System.out.println("the value selected is john");
		}
		}
		
	}
}
