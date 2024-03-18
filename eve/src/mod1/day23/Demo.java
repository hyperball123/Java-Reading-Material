package mod1.day23;

import java.lang.reflect.Field;

public class Demo {
	public static void main(String[] args) throws Exception{
		Test obj=new Test();
		Field f=obj.getClass().getDeclaredField("name");
		
		f.setAccessible(true);
		In in=(In)f.getAnnotation(In.class);
		System.out.println(in);
	}
}


class Test{
	@In(factoryName = "aaaaa")
	String name;
}