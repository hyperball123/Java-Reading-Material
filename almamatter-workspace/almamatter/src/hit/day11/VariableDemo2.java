package hit.day11;

public class VariableDemo2 {
	public static void main(String[] args) {
		TrainingRoom.toi=new Toilet();
		
		TrainingRoom gandhi=new TrainingRoom();
		gandhi.pro=new Projector();
		gandhi.learn(new NotePad());gandhi.learn(new NotePad());gandhi.learn(new NotePad());
		System.out.println(gandhi.pro+":"+gandhi.toi);
		System.out.println("..............................................");
		
		TrainingRoom tagore=new TrainingRoom();
		tagore.pro=new Projector();
		tagore.learn(new NotePad());gandhi.learn(new NotePad());gandhi.learn(new NotePad());
		System.out.println(tagore.pro+":"+tagore.toi);
		System.out.println("..............................................");
		
		TrainingRoom nehru=new TrainingRoom();
		nehru.pro=new Projector();
		nehru.learn(new NotePad());gandhi.learn(new NotePad());gandhi.learn(new NotePad());
		System.out.println(nehru.pro+":"+nehru.toi);
	}
}
class TrainingRoom{
	Projector pro;
	static Toilet toi;
	public void learn(NotePad n) {
		System.out.println(n);
	}
}

class Projector{
	
}

class Toilet{
	
}

class NotePad{
	
}