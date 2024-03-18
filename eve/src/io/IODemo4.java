package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;

public class IODemo4 {
	public static void main(String[] args)throws Exception {
		String myurl="https://www.google.com/index.html";
		
		URL url=new URL(myurl);
		
		URLConnection urlcon=url.openConnection();
		
		BufferedInputStream bis=new BufferedInputStream(urlcon.getInputStream());
		
		FileOutputStream fos=new FileOutputStream("google.html");
		int n=0;
		
		byte b[]=new byte[8];
		while((n=bis.read(b))!=-1) {
			String str=new String(b,0,n);
			System.out.print(str);
			fos.write(b,0,n);
		}
	}
}
