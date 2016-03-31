package com.aop;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class MyClient {

	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("192.168.0.106", 3617);
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		System.out.println(dis.readUTF());

		dis.close();
		socket.close();

	}

}
