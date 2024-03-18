package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UtilDemo8 {
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		
		list.add(new Employee("aaaaa"));
		list.add(new Employee("ccccc"));
		list.add(new Employee("dddd"));
		list.add(new Employee("bbbb"));
		
		Collections.sort(list,new MyEmpComparator());
		System.out.println(list);
	}
}
class MyEmpComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}
}
class Employee implements Comparable<Employee>{
	private String name;
	public Employee(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	@Override
	public String toString() {
		return name;
	}
}
