package mod1_2.day9;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class IODemo4 {
	public static void main(String[] args)throws Exception {
		URL url=new URL("https://www.google.com/index.html");
		
		URLConnection urlcon=url.openConnection();
		
		InputStream ins=urlcon.getInputStream();
		
		BufferedInputStream bis=new BufferedInputStream(ins);
		FileOutputStream fos=new FileOutputStream("google.html");
		
		int i=0;
		while((i=bis.read())!=-1) {
			System.out.print((char)i);
			fos.write((char)i);
		}		
	}
}
