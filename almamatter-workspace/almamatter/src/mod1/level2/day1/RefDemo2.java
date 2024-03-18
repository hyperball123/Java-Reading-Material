package mod1.level2.day1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class RefDemo2 {
	public static void main(String[] args)throws Exception {
		Politician ramu=new Politician();
		PoliceStation p1=new PoliceStation();
		
		p1.arrest(ramu);
	}
}

class PoliceStation{
	public void arrest(Object obj)throws Exception {
		//I can do introspection to find out the details..
		
//		Field f[]=obj.getClass().getFields();
//		for(Field ff:f) {
//			System.out.println(ff.getName());
//		}
//		
//		Method m[]=obj.getClass().getMethods();
//		for(Method mm:m) {
//			System.out.println(mm.getName());
//		}
		Field f=obj.getClass().getField("name");
		System.out.println(f.get(obj));
		

		Method m=obj.getClass().getMethod("service");
		m.invoke(obj);
		
		m=obj.getClass().getMethod("service",String.class);
		m.invoke(obj, "myoverloaded service method");
		
		m=obj.getClass().getMethod("service",String.class,int.class);
		m.invoke(obj, "myoverloaded service method",1000);
		
		//interrogation method will vary... they will send him to torture room
		
		f=obj.getClass().getDeclaredField("secretName");
		f.setAccessible(true);
		System.out.println(f.get(obj));
		
		m=obj.getClass().getDeclaredMethod("secretService");
		m.setAccessible(true);
		m.invoke(obj);
	}
}

class Politician{
	public String name="holy man";
	private String secretName="I am gunda...";
	
	public void service() {
		System.out.println("I am for people and I serve them....");
	}
	
	public void service(String n) {
		System.out.println("over loaded service method called...:"+n);
	}
	public void service(String n,int num) {
		System.out.println("over loaded service method called...:"+n+"............:"+num);
	}
	private void secretService() {
		System.out.println("I destroy there livelihoods.....");
	}
}