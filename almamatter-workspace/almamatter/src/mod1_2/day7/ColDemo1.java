package mod1_2.day7;

import java.util.ArrayList;
import java.util.List;

public class ColDemo1 {
	public static void main(String[] args) {
		List list=new ArrayList();
		System.out.println(list.size());
		list.add("hello");
		list.add(123);
		list.add(new Dabba());
		System.out.println(list.size());
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		System.out.println(list.size());
		list.add("hai");
		list.add("johny..");
		
		System.out.println(list.get(1));
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		for(Object o:list) {
			System.out.println(o);
		}
	}
}
class Dabba{}