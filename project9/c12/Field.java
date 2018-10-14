package c12;

import java.util.HashMap;
import java.util.Map;

public class Field {

	public static  Map<String, String[]> newStadiumfieldList() {
		Map<String, String[]> map;
		map = new HashMap<String, String[]>(); 
		String[] fields1 = {"迼禱⑩部華1" ,"迼禱⑩部華2" ,"迼禱⑩部華3","迼禱⑩部華4","迼禱⑩部華5"};
		String[] fields2 = {"さ籤⑩部華1" ,"さ籤⑩部華2" ,"さ籤⑩部華3","さ籤⑩部華4"};
		String[] fields3 = {"擎⑩部華1" ,"擎⑩部華2" ,"擎⑩部華3"};
		map.put("迼禱⑩",fields1 );
		map.put("さ籤⑩",fields2 );
		map.put("擎⑩",fields3 );
		
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
