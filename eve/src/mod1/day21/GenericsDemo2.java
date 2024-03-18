package mod1.day21;

public class GenericsDemo2 {
	public static void main(String[] args) {
		Bag<Bottle> bag=new Bag<>();
		bag.setObj(new Bottle());
		Bottle b=bag.getObj();
	}
}


class Bag<T>{
	T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
}

class Bottle{
	
}

class Vegetable{
	
}

class OilCan{
	Oil oil;
}
abstract class Oil{}
class SeasameOil extends Oil{
	
}
class GingellyOil extends Oil{}