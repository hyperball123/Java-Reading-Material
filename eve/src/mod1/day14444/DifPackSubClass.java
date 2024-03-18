package mod1.day14444;

import mod1.day14.ClassesAndObjects16;

public class DifPackSubClass extends ClassesAndObjects16{
	public void met() {
		System.out.println(pri);//private is class scope - not accessible outside the class
		System.out.println(nomod);//no modifier is not available - because no modifier is package scope
		System.out.println(pro);
		System.out.println(pub);
	}

}

class DifPackNonChild {//no modifier and protected are by default package scope
	public void met() {
		ClassesAndObjects16 obj=new ClassesAndObjects16();
		System.out.println(obj.pri);//private is class scope - not accessible outside the class
		System.out.println(obj.nomod);//no modifier is not available - because no modifier is package scope
		System.out.println(obj.pro);//protected is not available - because protected is relation scope
		System.out.println(obj.pub);//public is global scope - available in all places
	}
}