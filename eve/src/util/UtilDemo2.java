package util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class UtilDemo2 {
	public static void main(String[] args) {
		List list=new Vector();
		
		list.add("hello");
		list.add(123);
		list.add(new Suitcase(12,"aa"));
		
		System.out.println(list.get(1));
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//enhanced loop
		
		for(Object o:list) {
			System.out.println(o);
		}
		
		Iterator iter=list.iterator();
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
