package mod1.day17;
//throw and throws

/*
 * throw - is for explicitly throwing an exception
 * throws - does two things 1. Can convey to the user of the method that this method is capable of throwing an exception
 * 2. It skips the compilation check for checked exception
 */
public class ExceptionDemo2 {
	public static void main(String[] args) {
		Dog dog=new Dog();
		LBoard lBoard=new LBoard();
		try {
			dog.play("fkdjafljds");
			lBoard.driving("aaa");
			
		}catch(Exception e) {
		}
		
		
	}
	public void met() {
		try {
			wait();
		}catch(Exception e) {}
		
		//wait();
	}
}


class Dog{
	public void play(String item)throws Exception {
		if(item.equals("stick")) {
			
				throw new Exception();
			
		}
	}
}

class LBoard{
	public void driving(String road)throws Exception {
		if(road.equals("slope")) {
			throw new Exception();
		}
	}
}