package c13;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
            
public class AppendToFile {
	  /**
	   * A方法追加文件：使用RandomAccessFile
	 * @throws IOException 
	   */
	  public static void appendMethodA(String fileName, String content) throws IOException {
		  InputStream is = null;
	      DataInputStream dis = null;
	      FileOutputStream fos = null;
	      DataOutputStream dos = null;
	      String[] s = {"Hello", "World!!"};
	      
	      try{
	         // create file output stream
	         fos = new FileOutputStream("c:\test.txt");
	           
	         // create data output stream
	         dos = new DataOutputStream(fos);
	           
	         // for each  string in string buffer
	         for(String j:s)
	         {
	            // write string encoded as modified UTF-8
	            dos.writeUTF(j);
	         }
	           
	         // force data to the underlying file output stream
	         dos.flush();
	         
	         // create file input stream
	         is = new FileInputStream("c:\test.txt");
	         
	         // create new data input stream
	         dis = new DataInputStream(is);
	         
	         // available stream to be read
	         while(dis.available()>0)
	         {
	            // reads characters encoded with modified UTF-8
	            String k = dis.readUTF();
	            
	            // print
	            System.out.print(k+" ");
	         }
	      }catch(Exception e){
	         // if any error occurs
	         e.printStackTrace();
	      }finally{
	         
	         // releases all system resources from the streams
	         if(is!=null)
	            is.close();
	         if(dis!=null)
	            dis.close();
	         if(fos!=null)
	            fos.close();
	         if(dos!=null)
	            dos.close();
	      }
	  }
}
