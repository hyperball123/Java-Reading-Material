package hit.day20;

public class ArrayDemo {
	public static void main(String[] args) {
		int twod[][]= {
				{10,20,30},
				{100,200,300},
				{100,200,300}
		};
		
		for(int i=0;i<twod.length;i++) {//no of rows
			for(int j=0;j<twod[i].length;j++) {//no of columns
				System.out.print(twod[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("..............................................");
		//uneven multi dimensional array
		int twod2[][]= {
				{10,20,30},
				{100,200,300,400,300},
				{100,200}
		};

		for(int i=0;i<twod2.length;i++) {//no of rows
			for(int j=0;j<twod2[i].length;j++) {//no of columns
				System.out.print(twod2[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}
}
