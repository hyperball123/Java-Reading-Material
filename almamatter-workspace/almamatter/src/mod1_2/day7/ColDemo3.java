package mod1_2.day7;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ColDemo3 {
	public static void main(String[] args) {
		Queue queue=new LinkedList();
		
		queue.add("ram");
		queue.add("rahim");
		queue.add("john");
		queue.add("singh");
		
		System.out.println(queue);
		
		//queue.remove(); //this removes the peek object
		//queue.remove("john"); //this just removes the object
		
		System.out.println(queue.poll());//it returns as well as remove
		System.out.println(queue);
		
		System.out.println(queue.peek());//it return but does not remove 
		System.out.println(queue);
		
		Iterator iter=queue.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println(queue);
		
		//we dont have a list iterator in queue
		for(Object o:queue) {
			System.out.println(o);
		}

}
}
