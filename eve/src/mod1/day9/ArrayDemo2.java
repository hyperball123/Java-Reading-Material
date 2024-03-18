package mod1.day9;

public class ArrayDemo2 {
	public static void main(String[] args) {
		int i[][]= {{2,3,4,5},{7,80,900,1}};
		
		//int [][]j=
		
		System.out.println(i[1][2]);
		
		System.out.println(i.length);//this will return the number of rows, 
		
		System.out.println(i[0].length);//this will return the number of columns in first row...
		
		int k[][]=new int[3][4];
		
		k[0][0]=10;
		
		System.out.println(k[0][1]);
		
		int n=0;
		int m=0;
		
		while(n<k.length) {//outer while loop will run 3 times
			while(m<k[n].length) {//inner while loop will run 4 times in every loop of n
				System.out.print(k[n][m]+"\t");
				m++;
			}
			System.out.println();
			m=0;
			n++;
		}
	}
}
