package mod1.level2.day3;

public class CloneDemo {
	public static void main(String[] args) {
		
		Student s1=new Student();
		//s1.classRoom.space="s1 space...so s1 ojects are present.";
		ClassRoom s1ClassRoom=s1.classRoom.createClone();
		s1ClassRoom.space="s1 space...so s1 objects are present...";
		
		Student s2=new Student();
		//s2.classRoom.space="s2 space..so s2 objects are present...";
		ClassRoom s2ClassRoom=s2.classRoom.createClone();
		s2ClassRoom.space="s2 space...so s2 objects are present...";
		
		System.out.println(s1ClassRoom.space);
		System.out.println(s2ClassRoom.space);
	}
}

class Student{
	static ClassRoom classRoom=new ClassRoom();
	public Student() {
		System.out.println("student object created...");
	}
}

class ClassRoom implements Cloneable{
	static School school=new School();
	String space;
	public ClassRoom() {
		System.out.println("class room object created...");
	}
	
	public ClassRoom createClone() {
		try {
			return (ClassRoom)super.clone();
		}catch(Exception e) {
			return null;
		}
	}
}

class School{
	public School() {
		System.out.println("school object created...");
	}
}