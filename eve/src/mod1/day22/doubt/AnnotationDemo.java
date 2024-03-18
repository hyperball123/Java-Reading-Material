package mod1.day22.doubt;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.util.Scanner;


public class AnnotationDemo {
	public static void main(String[] args) throws Exception{
		Builder builder=new Builder();
		
		Kitchen kitchen=builder.createKitchen();
		System.out.println(kitchen.hashCode());
		System.out.println(kitchen);
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Waiting....................");
		scan.next();
		
		Builder builder2=new Builder();
		Kitchen kitchen2=builder2.createKitchen();
		System.out.println(kitchen2.hashCode());
		System.out.println(kitchen2);
		
	}
}




