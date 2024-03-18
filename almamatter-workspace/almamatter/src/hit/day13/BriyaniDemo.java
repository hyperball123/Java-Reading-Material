package hit.day13;

public class BriyaniDemo {
	public static void main(String[] args) {
		Vessel vessel=new Vessel();
		Stove stove=new Stove();
		Utensils utensils=new Utensils();		
		//set up the infrastructure
		Briyani.setup(stove,vessel, utensils);
		
		Rice basmathiRice=new Rice();
		Water bisleri=new Water();
		Mutton sheep=new Mutton();
		Ingredients bigBasket=new Ingredients();				
		Briyani myBriyani=new Briyani(basmathiRice, bisleri, sheep, bigBasket);
		myBriyani.makeBriyani();
		
		System.out.println("...............................................");
		
		Rice sambaRice=new Rice();
		Water aquafina=new Water();
		Mutton chicken=new Mutton();
		Ingredients gogrocy=new Ingredients();
		Briyani mySisterBriyani=new Briyani(sambaRice, aquafina, chicken, gogrocy);
		mySisterBriyani.makeBriyani();
		
	}
}

class Stove{}
class Vessel{}
class Utensils{}

class Rice{}
class Mutton{}
class Water{}
class Ingredients{}

class Briyani{
	//infrastructural requirements
	static Stove stove;
	static Vessel vessel;
	static Utensils untensils;
	
	public static void setup(Stove stove,Vessel vessel,Utensils utensils) {
		Briyani.stove=stove;
		Briyani.vessel=vessel;
		Briyani.untensils=utensils;
	}
	//instance variables
	Rice rice;
	Water water;
	Mutton mutton;
	Ingredients ingredients;
	public Briyani(Rice rice,Water water,Mutton mutton,Ingredients ingredients) {
		this.rice=rice;
		this.water=water;
		this.mutton=mutton;
		this.ingredients=ingredients;
	}
	
	public void makeBriyani() {
		System.out.println("I use....:"+Briyani.stove);
		System.out.println("I use....:"+Briyani.untensils);
		System.out.println("I use....:"+Briyani.vessel);
		
		System.out.println("The briyani is made up of ..."+rice+":"+mutton+":"+water+":"+ingredients);
		
		System.out.println("Briyani ready..........");
	}
}