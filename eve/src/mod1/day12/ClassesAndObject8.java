package mod1.day12;
//pass by reference - arrays
public class ClassesAndObject8 {
	public static void main(String[] args) {
		
		//int n;//local variables are not initialized by default
		//System.out.println(n);
		
		int i[]=new int[5];//Arrays are always initialized - even if they are locally declared
		for(int n:i) {
			System.out.println(n);
		}
		
		//Arrays are always pass by reference...even though they may be primitive type
		
		ClassesAndObject8 obj=new ClassesAndObject8();
		System.out.println("Before Passing array...:"+i[0]);
		obj.met(i);
		
		System.out.println("After Passing array...:"+i[0]);
	}
	
	public void met(int arr[]) {
		arr[0]=10101202;
	}
}
