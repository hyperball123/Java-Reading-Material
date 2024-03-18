package mod1.day12;

public class ClassesAndObjects5 {
	public static void main(String[] args) {
		Laddu laddu=new Laddu();
		System.out.println("Before passing laddu...PBV..:"+laddu.size);
		new PBV().accept(laddu.size);
		System.out.println("After passing laddu...PBV..:"+laddu.size);
		
		System.out.println("Before passing laddu...PBR..:"+laddu.size);
		new PBR().accept(laddu);
		System.out.println("After passing laddu...PBR..:"+laddu.size);
		
	}
}
class Laddu{
	int size=10;
}
//what is Pass By Value - when a variable is passed, a copy of the value is created and that is passed
class PBV{//pass by value
	public void accept(int size) {//all primitive types are by default pass by value...
		size=size+10;
	}
}

class PBR{//passy by reference
	public void accept(Laddu laddu) {//all complex types are by default pass by reference
		laddu.size=laddu.size-10;
	}
}