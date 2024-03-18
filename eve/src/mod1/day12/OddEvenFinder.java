package mod1.day12;

public class OddEvenFinder {
	public static void main(String[] args) {
		OddEvenFinder obj=new OddEvenFinder();
		obj.checkNumber(10);
		System.out.println(obj.checkNumber2(13));
		String result=obj.checkNumber2(11);
		System.out.println("Result..:"+result);
		
	}
	public void checkNumber(int n) {
		if(n%2==0) {
			System.out.println("Even Number....");
		}
		else {
			System.out.println("Odd Number......");
		}
	}
	
	public String checkNumber2(int n) {
		if(n%2==0) {
			return "Even Number...";
		}
		else {
			return "Odd Number...";
		}
	}
}

class House{
	public void enterRoom() {}
}