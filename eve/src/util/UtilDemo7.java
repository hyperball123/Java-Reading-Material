package util;

import java.util.HashMap;
import java.util.WeakHashMap;

public class UtilDemo7 {
	public static void main(String[] args) {
		WeakHashMap<String,String> wm=new WeakHashMap<>();
		//HashMap<String,String> wm=new HashMap<>();
		
		String key1=new String("s1");
		String key2=new String("s2");
		
		wm.put(key1, "aaaaaaa");
		wm.put(key2, "bbbbbbbbb");
		
		System.out.println(wm);
		
		key1=null;
		System.gc();
		
		System.out.println(wm);
		
	}
}
