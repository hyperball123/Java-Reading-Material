package mod1_2.day7;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class ColDemo4 {
	public static void main(String[] args) {
		//LAST IN FIRST OUT
		Stack stack=new Stack();
				
		stack.add("ram");
		stack.add("rahim");
		stack.add("john");
		stack.push("hello");
		stack.add("singh");
		
		System.out.println(stack);
		System.out.println(stack.lastElement());
		System.out.println(stack.firstElement());

		System.out.println(stack);
//		stack.remove(0);
//		stack.remove("john");
		
		System.out.println(stack.pop());//it has given the last one and removed it
		System.out.println(stack);
		
		System.out.println(stack.peek());//it given the last one and did not removed..
		System.out.println(stack);
		
		for(Object o:stack) {
			System.out.println(o);
		}
		
		Iterator iter=stack.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		ListIterator liter=stack.listIterator();
		while(liter.hasNext()) {
			System.out.println(liter.next());
		}
		while(liter.hasPrevious()) {
			System.out.println(liter.previous());
		}
		
	}
}
