package mod1_2.day8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ColDemo9 {
	public static void main(String[] args) {
		Map map=new HashMap();
		map=new TreeMap(new MyComparator());
		map.put("s1", "hello");
		map.put("s3", "hai");
		map.put("s2", "joy");
		
		System.out.println(map.get("s2"));
		
		Set s= map.entrySet();
		Iterator iter=s.iterator();
		while(iter.hasNext()) {
			//System.out.println(iter.next());
			Map.Entry me=(Map.Entry)iter.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}
	}
}
