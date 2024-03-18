package hit.day8.revision;

public class EscapeDemo {
	public static void main(String[] args) {
		System.out.println("hello\thai\tworld");
		
		
		System.out.println("jack and jill went \"up\" the hill");
		System.out.println("jack and jill went \'up\' the hill");
		System.out.println("jack and jill went \\up\\ the hill");
		
		System.out.println("jack and jill went \n up \n the hill");
		
		System.out.println("jack and jill went \f up \f the hill");//form feed-page break
		
		System.out.println("hello\b\b\bW");
		
		int i=0;
		while(i<1000000) {
			i++;
			System.out.print(i+"\r");//carriage return 
		}
		
		
	}
}
