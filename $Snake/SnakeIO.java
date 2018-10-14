package $Snake;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SnakeIO {

	Snake m= new Snake( );
	ScorePanel panel=new ScorePanel(  );
	 
	  public String read() {
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			fis = new FileInputStream("C:/Users/hp/Desktop/snake.txt");
			dis = new DataInputStream(fis);
			String s = dis.readUTF( );
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
	public void write(String scorePanel) {
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream("C:/Users/hp/Desktop/snake.txt");
			dos = new DataOutputStream(fos);
			dos.writeUTF(scorePanel+ ":");
		} catch (FileNotFoundException e) {			
			e.printStackTrace( );
		} catch (IOException e) {			
			e.printStackTrace( );
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
}
