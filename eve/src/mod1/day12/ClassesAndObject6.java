package mod1.day12;

public class ClassesAndObject6 {
	public static void main(String[] args) {
		TrainingRoom tr=new TrainingRoom();
		
		String s[]= {"ram","rahim","john"};
		tr.accept(s);
		
		String ss[]=new String[] {"ramu","somu"};
		tr.accept(ss);
		
		String sss[]=new String[4];
		sss[0]="hello";
		sss[1]="hai";
		sss[2]="what";
		sss[3]="when";
		
		tr.accept(sss);
	}
}

class TrainingRoom{
	public void accept(String students[]) {
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i]);
		}
		for(String s:students) {
			System.out.println(s);
		}
	}
}