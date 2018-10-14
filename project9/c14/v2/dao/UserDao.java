package c14.v2.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UserDao {
	
	public String read() {
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			fis = new FileInputStream("C:/Users/hp/Desktop/user.txt");
			dis = new DataInputStream(fis);
			String s = dis.readUTF();
			return s;
		} catch (FileNotFoundException e) {			
			e.printStackTrace(  );
		} catch (IOException e) {			
			e.printStackTrace();
		} finally {
			if(dis != null) {
				try {
					dis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
	}
	public void write(String username,String pwd) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream("C:/Users/hp/Desktop/user.txt");
			dos = new DataOutputStream(fos);
			dos.writeUTF(username+":"+pwd);
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		} finally {
			if(dos != null) {
				try {
					dos.close( );
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		UserDao userDao = new UserDao();
		userDao.write("–¥»Î","  2356");
		userDao.read( );
	}

}
