package mod1.day7;

public class OperatorsDemo2 {
	public static void main(String[] args) {
		int i=10;
		int j=2;
		
		//RELATIONAL OPERATORS
		System.out.println(i==j);//this will compare i and j, and print true if they are same or else false
		System.out.println(i!=j);//this too will compare i and j, since ! this symbol is used - it is negate of ==
		//if i is not equal to j, then it returns true or else false.
		
		System.out.println(i<j);
		System.out.println(i>j);
		System.out.println(i<=j);
		System.out.println(i>=j);
		
		//LOGICAL OPERATORS
		
		// && and ||
		
		System.out.println(i<100 && i==10);//this means you are checking two conditions, if both are true, then it return true
		//&& - is equal to AND
		
		System.out.println(i<100 || i==100);//either or, even if one expression returns true, the whole expression will return true
		// || - is equal too OR
		
	}
}
