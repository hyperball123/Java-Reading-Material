package mod1.rev.day3;
/*
 * class
 * Object
 * new
 * static keyword
 * instanceof
 * instance variable
 * class variable
 * main method
 * command line arguments
 * local variable
 * constructor
 * this
 * constructor overloading
 * methods - void
 * methods - return
 * method overloading
 *
 */
public class JavaRevision1 {
	public static void main(String[] args) {
		System.out.println(args[0]+":"+args[1]);
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		System.out.println(n1+n2);
		
		Employee emp=new Employee();//named object created
		new Employee();//anonymous object created
		Employee empObj;//declaring a variable by name empObj of type Employee - no object created only reference is created
		
		Employee e1=new Employee();
		System.out.println(e1.i);
		System.out.println(Employee.s);
		e1.i=50505;
		Employee.s=99999;
		System.out.println(e1.i);
		System.out.println(Employee.s);
		
		System.out.println(".......................................");
		Employee e2=new Employee();
		System.out.println(e2.i);
		System.out.println(Employee.s);
		Dept ss1=new Dept();
		System.out.println(e2 instanceof Employee);
		if(e2 instanceof Employee) {
			
		}
		System.out.println();
	
	}
}
class Dept{}
class Employee{
	int i=10;//instance variable
	static int s=10;//class variable
	
}