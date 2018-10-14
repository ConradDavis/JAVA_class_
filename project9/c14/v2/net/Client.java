package c14.v2.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	private Socket socket = null;
	
	public Client() {
		try {
			socket = new Socket("127.0.0.1",8888);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int send(String username,String pwd) {
		int code = 0;
		try {						
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			
			dos.writeUTF(username+":"+pwd);	
			code = dis.readInt();
			System.out.println("Client ==== "+code);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return code;
	}

	public static void main(String[] args) {
		new Client().send("Jack", "123456");
	}

}
