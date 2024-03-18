package mod1.level2.day2;

public class LambdaDemo1 {
	public static void main(String[] args) {
		MyInter my=new MyInterImpl();
		System.out.println(my.add(20,40));
		
		//this is lambda way - a extension of anonymous inner classes
		my=(int i,int j)->{return i+j;};
		
		System.out.println(my.add(10,20));
	}
}
class MyInterImpl implements MyInter{
	@Override
	public int add(int i, int j) {
		return i+j;
	}
}
@FunctionalInterface
interface MyInter{
	public int add(int i,int j);
	
}