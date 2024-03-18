package mod1.level2.day3;

public class CloneDemo2 {
	public static void main(String[] args) {
		Sheep mothersheep=new Sheep();
		mothersheep.name="iam the mothersheep";
		Sheep dolly=mothersheep.createClone();
		dolly.name="iam the clone dolly..";
		
		System.out.println(mothersheep.name);
		System.out.println(dolly.name);		
	}
}

class Sheep implements Cloneable{
	String name;
	public Sheep() {
		System.out.println("sheep object created...");
	}
	public Sheep createClone() {
		try {
			return (Sheep)super.clone();
		}catch(Exception e) {
			return null;
		}
	}
}