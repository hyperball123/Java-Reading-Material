package mod1.day10.lab;

public class Pyramid {
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("\t * ");
			}
			System.out.println();
		}
	}
}
