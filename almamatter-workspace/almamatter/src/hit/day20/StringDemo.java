package hit.day20;

public class StringDemo {
	public static void main(String[] args) {
		String s="hello world";//this will create only one value object
		String ss=new String("hello world");//this will create one value object plus one string object
		
		/*
		 * 1. utility methods in string
		 * 2. string is a non mutable object
		 */
		//utility methods
		System.out.println(s.substring(0,7));
		System.out.println(s.charAt(7));
		
		System.out.println(s.indexOf('h'));
		System.out.println(s.replace('h','m'));
		String str=new String(new char[] {'a','b','c'});
		System.out.println(str);
		
		//non mutable - string
		String x="hello";
		String temp=x;
		x=x+" mania";//this creates a new string object
		System.out.println(x);
		System.out.println(temp);
		
		temp.replace('h','m');//this createa a new string object
		System.out.println(temp);
		
		String result=temp.replace('h','m');
		System.out.println(result);
		
		//utility method
		String t1="hello";
		String t2="hello";
		System.out.println(t1==t2);
		
		String t11=new String("hello");
		String t22=new String("hello");
		System.out.println(t11==t22);// instead of value, the object addresses are compared.
		
		System.out.println(t11.equals(t22));
		
		
	}
}
