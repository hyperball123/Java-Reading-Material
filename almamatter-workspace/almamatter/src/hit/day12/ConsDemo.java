package hit.day12;

public class ConsDemo {
	public static void main(String[] args) {
		Home.met();
		Home.met();Home.met();
		
//		Home myHome=new Home("european",10);
//		myHome.build();
//		
//		Home myHome2=new Home();
//		myHome.build();
//		
//		Home myHome3=new Home("european");
//		myHome.build();
//		
		
	}
}

class Home{
	String model;int size;
	static {
		System.out.println("static block called...");
	}
	Home(){//this is a constructor
		System.out.println("home empty cons called...");
	}
	
	Home(String model){
		this.model=model;
	}
	
	Home(String model,int size){
		this.model=model;
		this.size=size;
	}
	
	public void build() {
		System.out.println("Model of the home..:"+this.model);
		System.out.println("size of the home..:"+this.size);
	}
	
	public static void met() {
		System.out.println("static method called..");
	}
}