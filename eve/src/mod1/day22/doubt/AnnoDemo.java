package mod1.day22.doubt;

import java.util.Scanner;

import mod1.day22.doubt.In;

import mod1.day22.doubt.Test;
public class AnnoDemo {
	public static void main(String[] args)throws Exception {		
		new AnnoDemo().met();
		Scanner scan=new Scanner(System.in);
		System.out.println("Waiting...");
		scan.next();
		new AnnoDemo().met2();		
	}
	public  void met() throws Exception{
		System.out.println(Test.class.getClassLoader());
		In in=Test.class.getField("name").getAnnotation(In.class);
		Test obj=new Test();
		if(in!=null) {			
			obj.name="this is my first name....";
			System.out.println("true...:"+obj);
		}
		else {
			System.out.println(obj);
		}	
	}
	public void met2()throws Exception{
		System.out.println(Test.class.getClassLoader());
		Test obj=new Test();
		In in=Test.class.getField("name2").getAnnotation(In.class);
		System.out.println(in);
		if(in!=null) {
			
			obj.name2="this is my second name....";
			System.out.println("true....:"+obj);
		}
		else {
			System.out.println(obj);
		}
	}
}

