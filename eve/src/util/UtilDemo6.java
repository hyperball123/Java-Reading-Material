package util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class UtilDemo6 {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		map=new TreeMap<>(new MyComparator());
		map.put("a1", "aaaaaaaaaaaaaa");
		map.put("c1", "ccccccccccccccc");
		map.put("b1", "bbbbbbbbbbbbbbbb");
		
		System.out.println(map);
		System.out.println(map.get("a1"));
		
		
		Set set= map.entrySet();
		
		Iterator iter=set.iterator();
		
		while(iter.hasNext()) {
			Map.Entry<String,String> me=(Map.Entry<String, String>)iter.next();
			System.out.println(me.getKey()+":"+me.getValue());
		}
	}
}
