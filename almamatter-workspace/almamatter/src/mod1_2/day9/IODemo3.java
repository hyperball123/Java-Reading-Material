package mod1_2.day9;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;

public class IODemo3 {
	public static void main(String[] args)throws Exception {
		String str="jack &copy; and &cop jill went up the hill..";
		
		ByteArrayInputStream bis=new ByteArrayInputStream(str.getBytes());
		BufferedInputStream in=new BufferedInputStream(bis);
		
		int i=0;boolean mark=false;
		while((i=in.read())!=-1) {
			switch((char)i) {
			case '&':{
				mark=true;
				in.mark(30);
				break;
			}
			case ';':{
				System.out.print((char)169);
				mark=false;
				break;
			}
			case ' ':{
				if(mark) {
					mark=false;
					in.reset();
					System.out.print("&");
				}
				else {
					System.out.print(" ");
				}
				break;
			}
			default:{
				if(!mark) {
					System.out.print((char)i);
				}
			}
			}
			
		}
	}
}
