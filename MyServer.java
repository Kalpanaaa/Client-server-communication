package com.aop;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(3617);
		Socket socket = ss.accept();
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		dos.writeUTF("hi client");
		dos.close();
		socket.close();
		ss.close();
	}

}
