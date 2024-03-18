package mod1_2.day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ColDemo6 {
	public static void main(String[] args) {
		List list=new ArrayList();
//		list.add("america");
//		list.add("india");
//		list.add("srilanka");
//		list.add("bangladesh");
		list.add(new Student("ramu"));
		list.add(new Student("somu"));
		list.add(new Student("anand"));
		System.out.println(list);
		
		Collections.synchronizedList(list);
		Collections.sort(list,new MyListComparator());
		System.out.println(list);
	}
}
class MyListComparator implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		return s2.compareTo(s1);
	}
}

class Student implements Comparable{
	String name;
	public Student(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return name;
	}
	@Override
	public int compareTo(Object o) {
		Student s=(Student)o;
		return this.name.compareTo(s.name);
	}
}