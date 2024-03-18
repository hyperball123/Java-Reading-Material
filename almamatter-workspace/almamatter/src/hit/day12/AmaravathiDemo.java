package hit.day12;

public class AmaravathiDemo {
	public static void main(String[] args) {
		Roads singaporeRoads=new Roads();
		BusStand dubaiBusStand=new BusStand();
		Water nileRiverWater=new Water();
		Drainage newYorkDrainage=new Drainage();
		
		AmaravathyHome.buildInfra(singaporeRoads,dubaiBusStand,nileRiverWater,newYorkDrainage);
		
		AmaravathyHome amaravathyDreamCity=new AmaravathyHome();
		amaravathyDreamCity.buildHome();
	}
}

class AmaravathyHome{
	static Roads roads;
	static BusStand busStand;
	static Water water;
	static Drainage drainage;
	
	public static void buildInfra(Roads roads,BusStand busStand,Water water,Drainage drainage) {
		AmaravathyHome.roads=roads;
		AmaravathyHome.busStand=busStand;
		AmaravathyHome.water=water;
		AmaravathyHome.drainage=drainage;
	}
	
	public void buildHome() {
		System.out.println("using roads to transport people and material...."+roads);
		System.out.println("using busstand to make people come ...:"+busStand);
		System.out.println("using water provision for survival...:"+water);
		System.out.println("using drainage connection.....:"+drainage);
		System.out.println("homes are built....");
	}
}

//basic infrastructural needs like roti, kapda and makan
class Roads{}
class BusStand{}
class Water{}
class Drainage{}

//extra needs
class PoliceStation{}
class Secretariat{}