package hit.day5;

public class RelationalOperatorDemo {
	public static void main(String[] args) {
		int i=10;
		int j=20;
		
		boolean result=i==j;
		System.out.println("the result is...:"+result);
		
		System.out.println(i==j);//false
		System.out.println(i<j);//true
		System.out.println(i>j);//false
		System.out.println(i<=j);//true
		System.out.println(i>=j);//false
		System.out.println(i!=j);//true
		
		//logical operators - && and ||
		
		boolean b=i<j && i!=10;  // i should be lesser than 20 and i should be equal to 10, then return true
		System.out.println(b);//only if both the conditions are satisfied..
		
		boolean bb=i<j || i!=10;  // i should be lesser than 20 or i should be equal to 10, then return true
		System.out.println(bb);//if any of condition is satisfied..it return true
		
		
	}
}
