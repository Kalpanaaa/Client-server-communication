package com.aop;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

class Server1 extends Thread{
	 static ArrayList<Socket> socket=new ArrayList<Socket>();
	public void run(){
		try {

			ServerSocket ss=new ServerSocket(7777);
			while(true){
				Socket s=ss.accept();
				socket.add(s);
				ServerResponse sr=new ServerResponse();
				sr.start();
				for(int i=0;i<socket.size();i++){
					System.out.println(socket.get(i));
				}
				
			}
		} catch (IOException e) {
						e.printStackTrace();
		}
	}

public static void main(String args[]){
	Server1 s1=new Server1();
	s1.start();
}
}