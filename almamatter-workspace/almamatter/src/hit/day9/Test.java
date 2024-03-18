package hit.day9;

public class Test {
		static int i;                    
		static int x;
		public static int TestMet(int y) {               
			x=i+y;                                
			System.out.print(x--+"\t");
			return x;
		}
		
		public static void main(String[] args) {
			System.out.print(TestMet(4));                       
		}
}


