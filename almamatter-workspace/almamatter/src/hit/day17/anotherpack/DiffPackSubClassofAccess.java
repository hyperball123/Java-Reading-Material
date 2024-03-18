package hit.day17.anotherpack;

import hit.day17.AccessDemo;

public class DiffPackSubClassofAccess extends AccessDemo {
	public void met() {
		System.out.println(pri);
		System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
	}
}
/*
 * private - class scope
 * nomod- package scope
 * protected - relation scope
 * public - global scope
 */
class DiffPackNonSubClass {
	public void met() {
		AccessDemo obj=new AccessDemo();
		System.out.println(obj.pri);
		System.out.println(obj.nomod);
		System.out.println(obj.pro);
		System.out.println(obj.pub);
	}
}