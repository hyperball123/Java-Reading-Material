package hit.day7.revision;

public class OperatorDemo {
	public static void main(String[] args) {
		//assignment =
		//comparison ==
		
		int x=11;//assigning value 10 to x
		System.out.println(x!=10);//checking whether x is equal to 10
		
		System.out.println(x/2); //- this returns quotient - 5
		System.out.println(x%2); //- this returns reminder - 0
		
		//x=x+5;
		System.out.println(x);
		x+=5;
		System.out.println(x);
		
		boolean result=(x<=20 && x>=50);//and
		System.out.println("Result..:"+result);
		
		boolean result2=(x<=20 || x>=50);//either or
		System.out.println("Result..:"+result2);
		
		boolean boo=(x%2==0);//returning false because x value is 16
		System.out.println(boo);
		if(boo) {
			System.out.println("even number.........");
		}
		else {
			System.out.println("odd number.............");
		}
		
		String r=(boo)?"Even Number..":"Odd Number...";
		System.out.println(r);
		
		int ii=x%2;
		switch(ii) {
		case 0:{
			System.out.println("evennnnnnnnnnnnnnnnnnnnnnnnnnn");
			//break;
		}
		case 1:{
			System.out.println("odddddddddddddddddddddddddddddddddd");
		}
		}//on encountering break, the java cursor will be here...
		
		
		for(int i=0;i<10;i++) {
			if(i%2!=0) {
				//continue;//continue will continue the loop
				break;//break from the loop
			}			
			System.out.println("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee....:"+i);			
		}
	}
}
