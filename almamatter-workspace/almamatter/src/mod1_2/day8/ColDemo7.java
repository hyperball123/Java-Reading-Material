package mod1_2.day8;

import java.util.Vector;

public class ColDemo7 {
	public static void main(String[] args) {
		Vector<Bottle> v=new Vector<>();
		
		v.add(new Bottle());
		v.add(new Bottle());
		v.add(new Bottle());
		
		Bottle b=v.get(0);
		b.met();
		
	}
}

class Bottle{
	public void met() {
		System.out.println("bottle method called...");
	}
}