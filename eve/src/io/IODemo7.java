package io;

import java.io.File;
import java.io.FilenameFilter;

public class IODemo7 {
	public static void main(String[] args) {
		File file=new File("E:\\SHOIAB\\STUDYMATERIAL\\javappt");
		
		System.out.println(file.isDirectory());
		
		String s[]=file.list();//new MyFilter());
		
		for(String ss:s) {
			file=new File(ss);
			System.out.println(file.getName());
			System.out.println(file.getAbsolutePath());
		}
	}
}

class MyFilter implements FilenameFilter{
	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return name.endsWith(".gif");
	}
}