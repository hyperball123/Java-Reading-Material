package hit.day12;

public class Revision {
	public static void main(String[] args) {
		TrainingRoom.toilet="Western Toilet...";
		
		TrainingRoom gandhi=new TrainingRoom();
		gandhi.projector="sanyo..";
		
		TrainingRoom nehru=new TrainingRoom();
		TrainingRoom tagore=new TrainingRoom();
		
		System.out.println("Projector in gandhi room..:"+gandhi.projector);
		System.out.println("Projector in nehru room...:"+nehru.projector);
		System.out.println("Projector in tagore room..:"+tagore.projector);
		
		System.out.println("Toilet for Gandhi room..:"+TrainingRoom.toilet);
		System.out.println("Toilet for Nehru room..:"+TrainingRoom.toilet);
		System.out.println("Toilet for Tagore room..:"+TrainingRoom.toilet);
	}
}

//instance,class,local variables
class TrainingRoom{
	String projector;//INSTANCE VARIABLE
	static String toilet;//CLASS VARIABLE
}