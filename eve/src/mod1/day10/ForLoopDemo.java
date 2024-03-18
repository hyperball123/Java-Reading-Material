package mod1.day10;

public class ForLoopDemo {
	public static void main(String[] args) {
		//for(;;) {//for(initialization;condition;incrementation/decrementation)
			
	//	}
		for(int i=0;i<10;++i) {
			System.out.println(i);
		}
		
		int arr[]= {10,30,50,23,45};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		
		//enhanced for loop - jdk5
		System.out.println();
		for(int i:arr) {
			System.out.print(i+"\t");
		}
		
		int twoarr[][]= {
				{20,40,56,67},
				{45,78,12,56},
				{12,55,77,88}
		};		
		System.out.println(twoarr.length);//the count of rows
		System.out.println(twoarr[0].length);//the count of columns of the first row
		
		//nested for loop
		for(int i=0;i<twoarr.length;i++) {
			for(int j=0;j<twoarr[i].length;j++) {
				System.out.print(twoarr[i][j]+"\t");
			}
			System.out.println();
		}		
		//nested for loop in enhanced for loop
		System.out.println();
		for(int i[]:twoarr) {
			for(int j:i) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}
}
