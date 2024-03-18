package mod1.day9;

public class EscapeSequenceDemo {
	public static void main(String[] args) {
		System.out.println("hello\nWorld \"GoldenTouch\" \f \tand\t \'HaarisInfotch\' c:\\\\");
		int i=0;
		while(i<10) {
			System.out.print(i+"\r");
			i++;
		}
	}
}
