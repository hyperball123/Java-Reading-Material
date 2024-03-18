package mod1_2.day8;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ColDemo8 {
	public static void main(String[] args) {
		Set set=new HashSet();
		set=new TreeSet(new MyComparator());//by default sorted
		set.add("hello");
		set.add("joy");
		set.add("boy");
		set.add("joy");
		
		System.out.println(set);
		System.out.println(set.contains("boy"));
				
		Iterator iter=set.iterator();
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