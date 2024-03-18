package eve;

public class ArrayS {

	public static void main(String[] args) {
	int i[]= {22,34,56,78};
		
		int []j= {34,56,78,89,78,90};
		
		System.out.println(i.length);//this will return the length of the array i
		System.out.println(j.length);//this will return the length of the array j
		
		System.out.println(i[2]);
		System.out.println(j[1]);
		
		//System.out.println(j[6]);
		
		//non initialized array
		int k[]=new int[5];//the default value will be initialized - which is zero incase of int
		int []z=new int[3];
		
		k[0]=1000;
		k[2]=4000;
		
		System.out.println("k[0] value...:"+k[0]);
		System.out.println("k[1] vaue....:"+k[1]);
		
		int n=0;
		while(n<k.length) {
			System.out.println(k[n]);
			n++;
		}

		
	}

}
