package mod1.day17;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		Dogg doggi=new Dogg();
		
		try {
			doggi.play("stick");
		}catch(DogBiteException de) {
			System.out.println(de);
		}catch(DogBarkException dr) {
			System.out.println(dr);
		}
	}
}
class DogBiteException extends Exception{
	
}
class DogBarkException extends Exception{
	
}
class Dogg{
	public void play(String item)throws DogBiteException,DogBarkException {
		if(item.equals("stick")) {
			throw new DogBiteException();
		}
		else if(item.equals("stone")) {
			throw new DogBarkException();
		}
	}
}