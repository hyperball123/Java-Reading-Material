package io;

import java.io.FileInputStream;

public class IODemo1 {
	public static void main(String[] args)throws Exception {
		FileInputStream fis=new FileInputStream("config.properties");
		
		int n=fis.read();
		
		System.out.println((char)n);
		System.out.println((char)fis.read());
		System.out.println((char)fis.read());
		System.out.println((char)fis.read());
		System.out.println((char)fis.read());
		System.out.println((char)fis.read());
		System.out.println((char)fis.read());
		System.out.println((char)fis.read());
		System.out.println((char)fis.read());
		System.out.println((char)fis.read());
		System.out.println(fis.read());//-1 represents EOF in JAVA
		
		fis=new FileInputStream("config.properties");
		while((n=fis.read())!=-1) {
			System.out.println("loop running...");
			System.out.println((char)n);
		}
		
		fis=new FileInputStream("config.properties");
		System.out.println("File size...:"+fis.available());
		byte b[]=new byte[8];
		while((n=fis.read(b))!=-1) {
			System.out.println("loop running in byte array loop");
			System.out.println("No of bytes read...:"+n);
			String str=new String(b,0,n);
			System.out.println(str);
		}
	}
}
