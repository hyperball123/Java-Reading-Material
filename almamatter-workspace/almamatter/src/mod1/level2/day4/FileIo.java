package mod1.level2.day4;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIo {
	public static void main(String[] args) throws Exception{
		FileOutputStream fos=new FileOutputStream("copy.txt");
		fos.write(169);
		
		FileInputStream fis=new FileInputStream("copy.txt");
		System.out.println((char)fis.read());
		
	}
}
