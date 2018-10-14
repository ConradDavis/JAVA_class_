package c12;

import java.util.HashMap;
import java.util.Map;

public class Field {

	public static  Map<String, String[]> newStadiumfieldList() {
		Map<String, String[]> map;
		map = new HashMap<String, String[]>(); 
		String[] fields1 = {"��ë�򳡵�1" ,"��ë�򳡵�2" ,"��ë�򳡵�3","��ë�򳡵�4","��ë�򳡵�5"};
		String[] fields2 = {"ƹ���򳡵�1" ,"ƹ���򳡵�2" ,"ƹ���򳡵�3","ƹ���򳡵�4"};
		String[] fields3 = {"���򳡵�1" ,"���򳡵�2" ,"���򳡵�3"};
		map.put("��ë��",fields1 );
		map.put("ƹ����",fields2 );
		map.put("����",fields3 );
		
		return map;		
	}
	public static void getStadiumfield(Map<String, String[]> map){
		System.out.println("The size of map is "+map.size());
		Object[] o = map.entrySet().toArray();
		Map.Entry<String, String[]> x;
		for(int i=0;i<map.size();i++) {
			x = (Map.Entry<String, String[]>)o[i];
			System.out.print(x.getKey()+"\t");
			String[] fields = x.getValue();
			for(String f:fields) {
				System.out.print(f+"\t");
			}
			System.out.print("\n");
		}
	}
	public static void main(String[] args) {
		//getStadiumfield(newStadiumfieldList());
		 Map<String, String[]> map =  newStadiumfieldList();
		 getStadiumfield(map);
	}

}
