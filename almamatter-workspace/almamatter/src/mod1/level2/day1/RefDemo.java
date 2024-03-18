package mod1.level2.day1;

import java.util.Scanner;

public class RefDemo {
	public static void main(String[] args)throws Exception {
		//Machine machine=new Machine();
		//LatheMachine lm=new LatheMachine();
		//ForgingMachine fm=new ForgingMachine();
		
		Factory factory=new Factory();
		//factory.lm=new LatheMachine(); static way of injecting dependancies
		Scanner scan=new Scanner(System.in);
		System.out.println("Please give the machine class name");
		String machineClass=scan.next();
		//Machine mac=(Machine)Class.forName("mod1.level2.day1."+machineClass).newInstance();
		Machine mac=(Machine)Class.forName("mod1.level2.day1."+machineClass)
				.getConstructor(null).newInstance(null);
		System.out.println(mac);
		factory.lm=mac;
		System.out.println(factory.lm);
	}
}
class Factory{
	Machine lm;
}
class Machine{
	
}
class LatheMachine extends Machine{
	public LatheMachine() {}
}
class ForgingMachine extends Machine{
	public ForgingMachine() {}
}