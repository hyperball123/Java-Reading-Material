package util;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class UtilDemo4 {
	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		
		set=new TreeSet<String>(new MyComparator());
		
		set.add("aaaa");
		set.add("zzzz");
		set.add("cccc");
		set.add("bbbb");
		set.add("aaaa");
		
		System.out.println(set);
		
		Iterator<String> iter= set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
class MyComparator implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
}