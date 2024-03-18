package mod1_2.day10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class IODemo5 {
	public static void main(String[] args) throws Exception{
		Moments moments=new Moments();
		
		System.out.println("State of mind...:"+moments.mentalState);
		
		System.out.println("some good news come....my state changes..");
		
		moments.mentalState="very happy state.....";
		
		System.out.println("I would like to capture this moment and save it....");
		
		FileOutputStream fos=new FileOutputStream("photoalbum.dat");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(moments);
		
		moments.mentalState="ordinary";
		System.out.println("State of mind..:"+moments.mentalState);
		
		System.out.println("After some time...if I want I can open the photoalbum.dat and get back my happiness");
		FileInputStream fis=new FileInputStream("photoalbum.dat");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		//Moments oldMoments=(Moments)ois.readObject();
		moments=(Moments)ois.readObject();
		System.out.println("Memories make....:"+moments.mentalState);
	}
}


class Moments implements Serializable{
	 String mentalState="normal";
	
	//transient variables are not stored,  they are not saved
}


