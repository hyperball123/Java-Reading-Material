package io;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;

public class IODemo5 {
	public static void main(String[] args)throws Exception {
		String str="Jack and Jill &copy; went up &cop the hill";
		
		ByteArrayInputStream bas=new ByteArrayInputStream(str.getBytes());
		
		BufferedInputStream bis=new BufferedInputStream(bas);
		
		int n=0;
		boolean mark=false;
		while((n=bis.read())!=-1) {
			switch(n) {
			case '&':{
				mark=true;
				bis.mark(30);
				break;
			}
			case ';':{
				mark=false;
				System.out.print((char)169);
				break;
			}
			case ' ':{
				if(mark) {
					bis.reset();
					mark=false;
					System.out.print("&");
				}
				else 
				{				
					System.out.print(" ");
				}
				break;
			}
			default:{
				if(!mark) {
					System.out.print((char)n);
				}
			}
			}
		}
	}
}
