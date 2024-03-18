package mod1.day16;

public class ClassesAndObjects21 {
	public static void main(String[] args) {
		Dominos laxmi=new LaxmiDomino();
		laxmi.collectMoney();
		laxmi.makingPizza();
		laxmi.delivery();
	}
}

abstract class Dominos{
	final public void makeDough() {
		System.out.println("dough making as per dominos...");
	}
	final public void mixIngredients() {
		System.out.println("mix ingredients as per dominos...");
	}
	final public void bake() {
		System.out.println("baking piza as per dominos...");
	}
	final public void packing() {
		System.out.println("packing pizza as per dominos...");
	}
	final public void makingPizza() {//template method
		makeDough();
		mixIngredients();
		bake();
		packing();
	}
	public abstract void collectMoney();
	public abstract void delivery();
}

class LaxmiDomino extends Dominos{
	@Override
	public void collectMoney() {
		System.out.println("collect money the way I like...");
	}
	@Override
	public void delivery() {
		System.out.println("deliver pizza the way I like...");
	}
}