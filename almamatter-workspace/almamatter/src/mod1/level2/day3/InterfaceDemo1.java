package mod1.level2.day3;

public class InterfaceDemo1 {
	public static void main(String[] args) {
		Dominos.advertisement();
		Dominos almaD=new AlmaDominos();
		Dominos curieD=new CuriePizza();
		
		almaD.getOrder();almaD.makeDelivery();
		curieD.getOrder();curieD.makeDelivery();
	}
}

interface Dominos{
	static void advertisement() {
		System.out.println("common advertisement for all franchisees...");
	}
	default void makePizza() {//template method
		makeDough();
		makeIngredients();
		bakePizza();
		packPizza();
	}
	default void makeDough() {
		System.out.println("make dough as per dominos standards....");
	}
	default void makeIngredients() {
		System.out.println("make ingredients as per dominos standards...");
	}
	default void bakePizza() {
		System.out.println("bake pizza as per dominos standards...");
	}
	default void packPizza() {
		System.out.println("pizza packed as per dominos standards...");
	}
	public void getOrder();
	public void makeDelivery();
}

class AlmaDominos implements Dominos{
	@Override
	public void getOrder() {
		System.out.println("get order and payment...");
		makePizza();
	}
	
	@Override
	public void makeDelivery() {
		System.out.println("delivered as per my region....");
	}
}
class CuriePizza implements Dominos{
	@Override
	public void getOrder() {
		System.out.println("get order and payment..by curie franchisee.");
		makePizza();
	}
	@Override
	public void makeDelivery() {
		System.out.println("delivered as per curie standards...");
	}
}