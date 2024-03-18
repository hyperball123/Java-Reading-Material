package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class IODemo3 {
	public static void main(String[] args)throws Exception {
		FileWriter fos=new FileWriter("copy.txt");
		int n=0;
		FileReader fis=new FileReader("config.properties");
		char c[]=new char[8];
		while((n=fis.read(c))!=-1) {
			fos.write(c, 0, n);
		}
		fos.close();
	}
}
