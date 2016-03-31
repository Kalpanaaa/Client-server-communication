package com.aop;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		try {
			ServerSocket ss = new ServerSocket(5025);
			Socket socket = ss.accept();
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String str = (String) dis.readUTF();
			System.out.println("Receive message=" + str);
			socket.close();
			ss.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}