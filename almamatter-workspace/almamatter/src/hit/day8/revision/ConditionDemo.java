package hit.day8.revision;

public class ConditionDemo {
	public static void main(String[] args) {
		int x=10;//value 10 is assigned to x
		x=x+10;//this will increment x by 10
		boolean boo=x>10;//this will return a boolean
		//a relational operator always returns a boolean
		
		if(boo) {
			System.out.println("true true true.....");
		}
		else {
			System.out.println("false false false....");
		}
		
		//ternary also accepts boolean
		String s=(boo)?"tttttttttttttt":"ffffffffffffffffffff";
		System.out.println(s);
		
		//switch case
		//this does not accept a boolean, rather it accepts a char/int/string/enum
		int n=x%2;//an arithmetic evaluation which returns a value othern than boolean
		
		switch(n) {
			case 0:{
				System.out.println("zero value....");
				break;
			}
			case 1:{
				System.out.println("one value....");
			}
			System.out.println("after case");
		}//on break - it comes out here...
		System.out.println("after switch...");
		
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
