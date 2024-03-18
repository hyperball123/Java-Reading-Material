package mod1.rev.day2;

public class ArraysDemo {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40};//single dimensional array
		
		System.out.println(arr[2]);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
		//enhanced for loop
		System.out.println("enhanced for loop.....");
		for(int i:arr) {
			System.out.print(i+"\t");
		}
		
		System.out.println();
		
		//int [][]arrtwo=new int[3][4];//3 rows 4 columns
		int [][]arrtwo= {
				{10,20,30},
				{30,50,34,23,56},
				{1,23,56,89,90,34,23},
				{12,23}
		};
		for(int row=0;row<arrtwo.length;row++) {//arrtwo.length will return count of rows
			for(int col=0;col<arrtwo[row].length;col++) {//arrtwo[row].length will return count of columns
				System.out.print(arrtwo[row][col]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("enhanced for loop...............");
		for(int x[]:arrtwo) {
			for(int y:x) {
				System.out.print(y+"\t");
			}
			System.out.println();
		}
	}
}
