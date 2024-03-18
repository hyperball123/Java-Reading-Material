package hit.day13;

import java.util.Scanner;

public class PBVPBRDemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of laddu to create...");
		int size=scan.nextInt();
		Laddu laddu=new Laddu(size);
		
		PBR_LadduGame pbr=new PBR_LadduGame();
		System.out.println("Size of laddu before passing...:"+laddu.size);
		pbr.accept(laddu);
		System.out.println("Size of laddu after passing....:"+laddu.size);
		
		System.out.println("Please now enter a word...:");
		String myWord=scan.next();
		PBV_WhisperGame pbv=new PBV_WhisperGame();
		System.out.println("Before Passing............:"+myWord);
		pbv.accept(myWord);
		System.out.println("After passing.............:"+myWord);
	}
}


class PBV_WhisperGame{
	public void accept(String myWord) {
		System.out.println("Word received............:"+myWord);
		myWord="kuppuswamy";
		System.out.println("Word Perceived..............:"+myWord);
	}
}

class Laddu{
	int size;
	public Laddu(int size) {
		this.size=size;
	}
}
class PBR_LadduGame{
	public void accept(Laddu laddu)
	{
		System.out.println("Original laddu size when I received..:"+laddu.size);
		laddu.size=laddu.size-5;
		System.out.println("Actual laddu size when I pass........:"+laddu.size);
	}
}