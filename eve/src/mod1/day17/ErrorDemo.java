package mod1.day17;

public class ErrorDemo {
	public static void main(String[] args) {
		ErrorDemo obj=new ErrorDemo();
		//obj.met();
		obj.met2();
	}
	int i=0;
	public void met() {		
		System.out.println(i%2==0?"Even.."+i:"Odd.."+i);		
		i++;
		if(i<1000) {
			met();
		}
	}
	public void met2() {
		String s;
		while(true) {
			s=new String("hello..........");
		}
	}
}
