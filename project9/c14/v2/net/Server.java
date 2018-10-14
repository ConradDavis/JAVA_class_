package c14.v2.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import c14.v2.bl.UserBL;
public class Server {
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(8888);
			System.out.println("Server is running......");
			Socket socket = serverSocket.accept();
			System.out.println("An client is connected!");
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			while(true) {
				String s = dis.readUTF();
				System.out.println("Server ==== "+s);
				String[] userinfo = s.split(":");
				UserBL userbl = new UserBL();
				int code = userbl.verify(userinfo[0], userinfo[1]);
				dos.writeInt(code);
				dos.flush();
			}			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
