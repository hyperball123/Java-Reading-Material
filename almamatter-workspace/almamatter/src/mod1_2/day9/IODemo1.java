package mod1_2.day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IODemo1 {
	public static void main(String[] args) throws Exception{
		FileInputStream fis=new FileInputStream("data.txt");
		FileOutputStream fos=new FileOutputStream("copydata.txt");
		byte b[]=new byte[8];
		int i=0;
		while((i=fis.read(b))!=-1) {
			String s=new String(b,0,i);
			System.out.println(i);
			System.out.println(s);
			fos.write(b, 0, i);
		}
		
	}
}
