package mod1.day12;

public class Leader {
	public static void main(String[] args) {
		Musicians arrehman=new Musicians();
		Dancers remos=new Dancers();
		LightMan bijli=new LightMan();
		
		//now the leader can collaborate or orchestrate the objects and plan a show
		bijli.doFocus();
		bijli.doFocus();
		arrehman.playMusic();arrehman.playMusic();arrehman.playMusic();arrehman.playMusic();
		remos.doDance();remos.doDance();remos.doDance();remos.doDance();
		
	}
}

class Musicians{
	public void playMusic() {System.out.println("music started...");}
}
class Dancers{
	public void doDance() {
		System.out.println("dancing dancing dancing...");
	}
}
class LightMan{
	public void doFocus() {
		System.out.println("light light light....");
	}
}