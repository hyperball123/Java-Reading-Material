package hit.day16;

//overriding and multiple inheritance
public class GeneralizationDemo5 {

}

abstract class HaarisInfotech{
	final public void process() {
		System.out.println("my formula to successs.............");
	}
	public abstract void payForFranchise();
	//any class which has an abstract method, then the class has to be declared abstract 
}

class ImranInfoTech extends HaarisInfotech{
	@Override
	public void payForFranchise() {
		System.out.println("imran writes the logic of payment...to HaarisInfotech");
	}	
}