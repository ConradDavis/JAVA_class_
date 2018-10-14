package $011;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArravList {

	public static void showAll1(ArrayList<String>list) {
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		for(String s:list) {
			System.out.println(s);
		}
		System.out.println("                       show1                               ");
	}
public static void delete(String delS , ArrayList<String>list) {
	for(int i=0;i<list.size();i++) {
		if(delS.equals(list.get(i))) {
			list.remove(i);
		}
		
	}
	//list.remove(delS);
	System.out.println("                       show2                              ");
	}
public static void showAll2(ArrayList<String>list) {
	Iterator iter= (Iterator) list.iterator();
	
	
	
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new  ArrayList<String>();
          String s1,s2,s3;
		 s1="001";
		s2="002";
		
		
		list.add(s1);
		list.add(s2);
		list.add(s3="003");
		 showAll1(list);
		 delete(s1,list);
		 showAll2(list);
		
			
	}

}
