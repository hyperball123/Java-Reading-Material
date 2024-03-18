package mod1.day8;

public class ConditionDemo3 {
	public static void main(String[] args) {
		//ternary operator -?
		
		//syntax - (expression)?"aaaaaaaaaaaa":'bbbbbbbbbbb";
		//if the expression returns true, then the first text will be the result or 
		//if the expression return false, then the second text after  colon will be the result
		
		int age=17;
		
		System.out.println(age>=18);
		System.out.println((age>=18)?"yes you can VOTE...":"No you cannot vote...");
		
	}
}
