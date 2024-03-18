package eve;

public class Whileloop {
  public static void main(String[] args) {
	int i = 1;
    
	while(i<10) {
	   System.out.println(i);
	    i++;
}
	/*
	 * while loop - does a pre condition check.
	 * 
	 * do-while loop - does a post condition check.
	 */
  
	do {
	   System.out.println(i);
       i++;
   }while(i<10);
       
	
	
	while(true) {
		//infinite loop
		System.out.println(++i+"\b\r");
	}
  }
}