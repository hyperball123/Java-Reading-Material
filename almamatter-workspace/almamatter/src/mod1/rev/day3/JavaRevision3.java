package mod1.rev.day3;
/*
 * inheritance
 * overriding
 * code reusability
 * object reusability
 * abstract class
 * interface - in a simple way
 */
public class JavaRevision3 {
	public static void main(String[] args) {
		Parent p=new Child();
		/*
		 * child can replace the parent, thereby making the using object/class reusable
		 * code reusability
		 */
		PartyHall ph=new PartyHall();
		ph.bp=new BirthDayParty();
		//ph.bp=new MarriageParty();
		
		GeneralPartyHall gp=new GeneralPartyHall();
		gp.party=new BirthDayParty();
		gp.party=new MarriageParty();
		
		Parent parent=new Parent();
		System.out.println(parent.i);
		parent.met();
		
		Child child=new Child();
		System.out.println(child.i);
		child.met();
		
		AnotherChild anotherChild=new AnotherChild();
		System.out.println(anotherChild.i);
		child.met();
	}
}
class PartyHall{
	BirthDayParty bp;
}
class GeneralPartyHall{
	Party party;
}
class Party{
	
}
class BirthDayParty extends Party{
	
}
class MarriageParty extends Party{
	
}

class Parent{
	int i=100;
	public void met() {
		System.out.println("parent method met called...");
	}
}

class Child extends Parent{
	
}

class AnotherChild extends Parent{
	
}