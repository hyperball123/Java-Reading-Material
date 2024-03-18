package mod1_2.day7;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class ColDemo5 {
public static void main(String[] args) {
	//vector methods are by default synchronized
	//there by a monitor gets created when vector is used...because of this, it is thread safe
	Vector v=new Vector();	
	v.add("hello");
	v.add("hai");
	v.add("joy");
	
	Iterator iter=v.iterator();
	//v.add("boy");
	while(iter.hasNext()) {
		System.out.println(iter.next());
	}
	
	Enumeration e=v.elements();
	v.add("boy");
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
	
}
}
