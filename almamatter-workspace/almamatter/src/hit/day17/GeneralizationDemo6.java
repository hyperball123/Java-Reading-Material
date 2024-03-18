package hit.day17;
//abstract class can extend another abstract class
public class GeneralizationDemo6 {

}
/*
 * when you extend another abstract class, then you don't need to override the abstract methods
 * of the super class
 */
abstract class Pizza{
	abstract void makePizza();
}

abstract class VegPizza extends Pizza{
	abstract void addVegetables();
}

class DominoPizza extends VegPizza{

	@Override
	void addVegetables() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void makePizza() {
		// TODO Auto-generated method stub
		
	}
	
}