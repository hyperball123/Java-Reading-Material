package mod1_2.day7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ColDemo2 {
	public static void main(String[] args) {
		List list=new LinkedList();
		
		System.out.println(list.size());
		list.add("hello");
		list.add("hai");		
		list.add("joy");
		System.out.println(list.size());
		list.remove(0);
		System.out.println(list.size());
		
		System.out.println(list.get(1));
		
		for(Object o:list) {
			System.out.println(o);
		}
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		Iterator iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("....................................");
		//iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		ListIterator liter=list.listIterator();
		while(liter.hasNext()) {
			System.out.println(liter.next());
		}
		while(liter.hasPrevious()) {
			System.out.println(liter.previous());
		}
	}
}
