package util;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class UtilDemo3 {
	public static void main(String[] args) {
		Vector<String> list=new Vector<>();
		
		list.add("aaaaaa");
		list.add("bbbbb");
		//list.add(new Suitcase(12,"34344"));
		
		Iterator<String> iter=list.iterator();
		
		while(iter.hasNext()) {
			String s=(String)iter.next();
			System.out.println(s);
		}
		
		Enumeration<String> e= list.elements();
		list.add("ccccc");
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
