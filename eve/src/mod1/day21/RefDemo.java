package mod1.day21;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class RefDemo {
	public static void main(String[] args)throws Exception {
		CommonMan cm=new CommonMan();
		Politician pol=new Politician();
		PoliceStation p1=new PoliceStation();
		
		p1.arrest(pol);
	} 
	
}
class PoliceStation{
	public void arrest(Object obj) throws Exception{
		//introspection
		Class c=obj.getClass();
		Field ff[]=c.getDeclaredFields();
		
		for(Field field:ff) {
			field.setAccessible(true);
			System.out.println(field.getName());
		}
		Method mm[]=c.getDeclaredMethods();
		for(Method method:mm) {
			method.setAccessible(true);
			System.out.println(method.getName());
		}
//		Field f= c.getField("name");
//		System.out.println(f.get(obj));
//		
//		Method m=c.getMethod("service");
//		m.invoke(obj);
//		//torture room
//		
//		f=c.getDeclaredField("secretName");
//		f.setAccessible(true);
//		System.out.println(f.get(obj));
//		
//		m=c.getDeclaredMethod("secretService",String.class,int.class);
//		m.setAccessible(true);
//		m.invoke(obj,"badpolitician",10101010);		
	}
}
class CommonMan{
	public String name;
	public void service() {
		System.out.println("All common men and women are good by nature....");
	}
}
class Politician{
	public String name="I am a good holy man.....";
	private String secretName="#$%$#%$#%$#%$%^%&%^&*%^&@#@#$@@$#";
	
	public void service() {
		System.out.println("I do all good servie...i am the God of good.....");
	}
	
	private void secretService() {
		System.out.println("%#%$#%&&^%(*&(*&(&(*&@#@#$#@$#@*&*");
	}
	
	private void secretService(String name,int money) {
		System.out.println("%#%$#%&&^%(*&(*&(&(*&@#@#$#@$#@*&*"+name+":"+money);
	}
	
}