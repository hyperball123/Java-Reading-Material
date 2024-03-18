package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class IODemo6 {
	public static void main(String[] args) throws Exception{
		Laddu laddu=new Laddu();
		
			ObjectOutputStream oos1=new ObjectOutputStream(new FileOutputStream("laddu1.dat"));
			oos1.writeObject(laddu);
		
		System.out.println("The initial size of laddu is..:"+ laddu.size);
		laddu.size=laddu.size-1;
			ObjectOutputStream oos2=new ObjectOutputStream(new FileOutputStream("laddu2.dat"));
			oos2.writeObject(laddu);
		
		System.out.println("The next size of laddu is..:"+ laddu.size);
		laddu.size=laddu.size-1;
		System.out.println("The next size of laddu is..:"+ laddu.size);
		laddu.size=laddu.size-1;
		System.out.println("The next size of laddu is..:"+ laddu.size);
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("laddu2.dat"));
		Laddu laddu2=(Laddu)ois.readObject();
		
		System.out.println(laddu2.size);
		
	}
}

class Laddu implements Serializable{
	int size=10;
}