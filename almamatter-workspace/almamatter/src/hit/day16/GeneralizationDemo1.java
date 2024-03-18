package hit.day16;

public class GeneralizationDemo1 {
	public static void main(String[] args) {
		
		//subclass can replace the superclass
		SuperClass sc1=new SubClass1();
		SuperClass sc2=new SubClass2();
		GeneralizationDemo1.met(new SubClass1());
		
		Employee emp1=new Engineer();
		Employee emp2=new Attender();
		
		Engineer engineerRamu=new Engineer();
		Attender attendarRamu=new Attender();
		
		GeneralizationDemo1.meetEmployee(attendarRamu);
		
		//GeneralizationDemo1.meetEngineer(attendarRamu);
		GeneralizationDemo1.meetEngineer(engineerRamu);
	}
	
	public static void met(SuperClass sc) {
		
	}
	public static void meetEmployee(Employee e) {
		
	}
	public static void meetEngineer(Engineer eng) {
		
	}
}

class SuperClass{
	
}

class SubClass1 extends SuperClass{//subclass is a kind of superclass
	
}
class SubClass2 extends SuperClass{
	
}
class Employee{
	
}

class Engineer extends Employee{
	
}

class Attender extends Employee{
	
}