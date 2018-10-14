package $Snake;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class MaxTxt {
	String maxString;
	String fileName = "C:/Users/hp/Desktop/score.txt";
	File file = new File(fileName);
	//读入TXT文件 
	public String readTxt(  ){
		BufferedReader reader = null;
		try {
			if(!file.exists()) {
				file.createNewFile();
				write(0);
			}
			reader = new BufferedReader(new FileReader(file));
			String tempString = null;
			// 一次读入一行，直到读入null为文件结束N
			while ((tempString = reader.readLine()) != null) {
				maxString=tempString;
			}
			reader.close( );
		} catch (IOException e) {
		    e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
				    reader.close();
				} catch (IOException e1) {
					
				}
			}
		}
		return maxString;
	}
	public void write(int score){
		String scoreString=score+" ";
		try {  
			PrintStream ps = new PrintStream(new FileOutputStream(file));  
			ps.println("此文档为贪食 蛇游戏生成!");// 往文件里写入字符串  
			ps.append(scoreString);
			ps.close( );
		} catch (FileNotFoundException e) {  
			// TODO Auto-generated catch block  
			e.printStackTrace(  );  
		}  
	}
}
