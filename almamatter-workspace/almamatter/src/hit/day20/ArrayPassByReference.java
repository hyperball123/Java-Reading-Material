package hit.day20;

public class ArrayPassByReference {
	public static void main(String[] args) {
		int i[]= {10,20,30,40};
		System.out.println("before passing i...:"+i[0]);
		int []copyI=new int[2];
		System.arraycopy(i, 1, copyI, 0, 2);
		//SOURCE ARRAY, STARTING POINT OF COPY, DESTINATION ARRAY, STARTING POINT OF PASTING,END POINT OF PASTING
		met(copyI);
		System.out.println("after passing i..:"+i[0]);
	}
	public static void met(int i[]) {
		i[0]=20;
	}
}
