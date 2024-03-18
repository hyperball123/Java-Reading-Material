package eve;

public class ContinueDemo {

	public static void main(String[] args) {
            //continue should be in a loop 
		
		int i = 0;
		while (i<10) {
			i++;
			if(i%2==0) {
				continue;//it means i am telling to jump into the loop once again
			}
			System.out.println(i);
		}
	}

}
