package mod1_2.day10;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class IODemo6 {
	public static void main(String[] args)throws Exception {
		Properties prop=new Properties();
		
		//prop.put("s1", "hello");
		//prop.put("s2", "hai");
		prop.load(new FileInputStream("abc.properties"));
		
		System.out.println(prop.get("s1"));
		
		Set set=prop.entrySet();
		
		Iterator iter=set.iterator();
		while(iter.hasNext()) {
			//System.out.println(iter.next());
			Map.Entry me=(Map.Entry)iter.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}
	}
}
