package io;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	ServerSocket ss;Socket s;PrintStream out;BufferedReader in,keyin;
	public Server() {
		try {
			ss=new ServerSocket(2000);
			System.out.println("Server ready to accept...");
			while(true) {
				s=ss.accept();
				out=new PrintStream(s.getOutputStream());
				keyin=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Please Enter A Message For Client..:");
				String msgForClient=keyin.readLine();
				out.println(msgForClient);
				
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				String msgFromClient=in.readLine();
				System.out.println("Message From Cient..:"+msgFromClient);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
public static void main(String[] args) {
	new Server();
}
}
