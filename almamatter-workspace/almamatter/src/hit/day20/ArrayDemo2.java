package hit.day20;

public class ArrayDemo2 {
	public static void main(String[] args) {
		int twod[][]=new int[3][4];//3 rows and 4 columns
		
		twod[0][3]=1010;
		//enhanced for loop - which was introduced in jdk5
		
		for(int i[]:twod)
		{
			for(int j:i) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		System.out.println("......................................");
		int twod2[][]=new int[3][];
		twod2[0]=new int[4];
		twod2[1]=new int[8];
		twod2[2]=new int[2];
		
		for(int i[]:twod2)
		{
			for(int j:i) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		
	}
}
