package com.aop;

import java.io.DataOutputStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("192.168.0.106", 5025);
			DataOutputStream dos = new DataOutputStream(
					socket.getOutputStream());
			dos.writeUTF("hi!!How are u");
			dos.flush();
			dos.close();
			socket.close();
		} catch (Exception e) {
			System.out.println(e);

		}
	}
}
