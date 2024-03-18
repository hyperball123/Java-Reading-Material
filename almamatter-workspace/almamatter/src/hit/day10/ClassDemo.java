package hit.day10;

public class ClassDemo {
	public static void main(String[] args) {
		new Human().work();//This is equivalent to KUN - anonymous object
		new Human().giveMoney();
		
		//named object
		Human shoiab=new Human();//allocating the human type object to a variable/reference/pointer by name
		//shoiab which is of type Human
		
		shoiab.work();
		int value=shoiab.giveMoney();
		System.out.println(value);
		
		Human sho=null;
		//System.out.println(sho.work());
		
		value=shoiab.giveChange(90);
		System.out.println(value);
	}
}

class Human{
	void work() {
		System.out.println("work method called...");
	}
	
	int giveMoney() {
		return 100;
	}
	
	int giveChange(int money) {
		if(money>=100) {
			return money-50;
		}
		else {
			return money;
		}
	}
}