package hit.day12;

public class RevisionComplexType {
	public static void main(String[] args) {
		GoldenTouch.hit=new HaarisInfotech();
		GoldenTouch.fluvid=new Fluvid();
		
		GoldenTouch almamatter=new GoldenTouch();
		almamatter.slack=new Slack();
		
		GoldenTouch curie=new GoldenTouch();
		curie.slack=new Slack();
		
		GoldenTouch inspiron=new GoldenTouch();
		inspiron.slack=new Slack();
		
		System.out.println("tutor support of curie from..:"+GoldenTouch.hit);
		System.out.println("tutor support of almamatter from..:"+GoldenTouch.hit);
		System.out.println("tutor support of inspiron from..:"+GoldenTouch.hit);
		
		System.out.println("slack of Almamatter...:"+almamatter.slack);
		System.out.println("slack of curie...:"+curie.slack);
		System.out.println("slack of inspiron...:"+inspiron.slack);
		
		almamatter.learn(new GitHub());
		almamatter.learn(new GitHub());
		almamatter.learn(new GitHub());
		almamatter.learn(new GitHub());
		almamatter.learn(new GitHub());
				
	}
}

class GoldenTouch{
	static Fluvid fluvid;
	static HaarisInfotech hit;
	Slack slack;
	public void learn(GitHub git) {
		System.out.println(git);
	}
}

class Slack{}//instance variable
class HaarisInfotech{}//class variable
class GitHub{}//local variable
class Fluvid{}//class variable