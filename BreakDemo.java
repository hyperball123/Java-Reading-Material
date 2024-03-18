package eve;

public class BreakDemo {

	public static void main(String[] args) {
        //break is also called as jumping statement.    
		int i =0;
            while (i<10) {
            	i++;
            	if(i==5) {
            		break;
            		
            	}
            	System.out.println(i);
            }
            System.out.println("beak has terminated the flow and now the cursor of the program is here...");
           
            //i cannot use break just like that it has to be given some conditions
            //break can also be used to come out of loop as well as a block
            
            //This are know as labels|
            india:{
            	 srilanka:{
            		 nepal:{
            			 if(i==5) {
            			 break india;
            		 }
            		 }
            		 System.out.println("break has come out of nepal...");
            	 }
            	 System.out.println("out of srilanka.....");
             }
             System.out.println("out of india...");
	}
	}


