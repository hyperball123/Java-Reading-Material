package eve;

public class Forloop {
public static void main(String[] args) {
	//for(;;){//for(initialization;condition;incre/decreament)
	
	for(int i=0;i<10;i++) {
		System.out.println(i);
	}
     int arr[]= {
    		 10,20,30,40,40
     };
      for(int i = 0;i<arr.length;i++){
    	  System.out.print(arr[i]+"\t");
    	  
      }
      
      //enhanced for loop
      System.out.println();
      for(int i:arr) {
    	  System.out.print(i+"\t");
      }
      
      int twoarr[][]= {
    		  {20,30,40,50},
    		  {32,35,12,43},
    		  {32,1,12,343}
      };
      
      System.out.println(twoarr.length);
      System.out.println(twoarr[0].length);
      
      //nested for loop
      for(int i =0;i<twoarr.length;i++) {
    	  for(int j=0;j<twoarr.length;j++) {
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
