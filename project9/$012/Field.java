package $012;

import java.util.HashMap;
import java.util.Map;

public class Field {
	
	public  static  Map<String , String[ ]> newStadiumfieldList(){
		Map<String , String[ ]>    map;
		map= new HashMap<String , String[ ]> ();
		String [ ] filds1 = {  "��ë��1","��ë��2","��ë��3","��ë��4","��ë��5"};
		String [ ] filds2 = {  "ƹ����1","ƹ����2","ƹ����3","ƹ����4"};
		String [ ] filds3 = {  "����1","����2","����3"};
		map.put("��ë��", filds1);
		map.put("ƹ����", filds2);
		map.put("����", filds3);
		return null;
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
		// TODO Auto-generated method stub
		Map<String, String[]> map =  newStadiumfieldList();
		 getStadiumfield(map);
	}

}
