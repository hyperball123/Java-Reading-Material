package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IODemo2 {
	public static void main(String[] args)throws Exception {
		FileOutputStream fos=new FileOutputStream("copy.txt");
		int n=0;
		FileInputStream fis=new FileInputStream("config.properties");
		byte b[]=new byte[8];
		while((n=fis.read(b))!=-1) {
			fos.write(b, 0, n);
		}
		
	}
}
