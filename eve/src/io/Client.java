package io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Client {
	Socket s;BufferedReader in,keyin;PrintStream out;
	public Client() {
		try {
			while(true) {
			s=new Socket("localhost",2000);
			in=new BufferedReader(new InputStreamReader(s.getInputStream()));
			String msgFromServer=in.readLine();
			System.out.println("Message From Server..:"+msgFromServer);
			out=new PrintStream(s.getOutputStream());
			
			keyin=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please Enter A Message For Server..:");
			String msgForServer=keyin.readLine();
			out.println(msgForServer);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Client();
	}
}
