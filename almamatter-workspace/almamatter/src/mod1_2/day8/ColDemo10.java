package mod1_2.day8;

import java.util.HashMap;
import java.util.WeakHashMap;

public class ColDemo10 {
	public static void main(String[] args) {
		WeakHashMap wm=new WeakHashMap();
		//HashMap wm=new HashMap();
		String s1=new String("s100");
		String s2=new String("s200");
		
		wm.put(s1, "hello");
		wm.put(s2, "hai");
		
		System.out.println(wm);
		
		s1=null;
		System.gc();
		
		System.out.println(wm);
	}
}
