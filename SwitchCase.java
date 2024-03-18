package eve;

public class SwitchCase {
public static void main(String[] args) {
	//SWITCH CASE  WORKS ON THE PRINCIPLE OF VALUE NOT ON EXPRESSIONS OR BOOLEAN
	
	/*
	 * IT ACCEPTS ONLY
	 * INT,CHAR,STRING AND ENUM
	 * 
	 */
	
	
    int i = 400;
    char c ='a';
    String s = "ramu";
    Myenum e = Myenum.apple;

    
    switch(i) {
    case 10:{
    	System.out.println("10 is identified....");
    	break;
    	//Break is also called as jumping  statement
    }
    case 20:{
    	System.out.println("20 is identified...");
    	break;
    }
    case 30:{
    	System.out.println("30 is identified.....");
    	break;
    }
    default:{
    	System.out.println("default block executed...");;
    }
    }
   /////////////////////////////////////////////////////////////////////////
    switch(c) {
    case 'a':{
    	System.out.println("a for apple...");
    	break;
    }
    case 'b':{
    	System.out.println("b for ball...");
    	break;
    }
    default:{
    	System.out.println("no solution as of now");
    }
    }
    ///////////////////////////////////////////////////////////////////////////
    
    switch(s) {
    case "ramu":{
    	System.out.println("Ramu is called....");
    	break;
    }
    case "somu":{
    	System.out.println("Somu is called....");
    	break;
    	
    }
    default:{
    	System.out.println("default is called");
    }
    }
    ///////////////////////////////////////////////////////////////////////////
    switch(e) {
    case apple:{
    	System.out.println("enum apple found...");
    	break;
    }
    case bat:{
    	System.out.println("enum bat found....");
    	break;
    }
    default:{
    	System.out.println("default...");
    }
    }
}

}