package $012;

import java.util.HashMap;
import java.util.Map;

public class Field {
	
	public  static  Map<String , String[ ]> newStadiumfieldList(){
		Map<String , String[ ]>    map;
		map= new HashMap<String , String[ ]> ();
		String [ ] filds1 = {  "ÓğÃ«Çò1","ÓğÃ«Çò2","ÓğÃ«Çò3","ÓğÃ«Çò4","ÓğÃ«Çò5"};
		String [ ] filds2 = {  "Æ¹ÅÒÇò1","Æ¹ÅÒÇò2","Æ¹ÅÒÇò3","Æ¹ÅÒÇò4"};
		String [ ] filds3 = {  "ÀºÇò1","ÀºÇò2","ÀºÇò3"};
		map.put("ÓğÃ«Çò", filds1);
		map.put("Æ¹ÅÒÇò", filds2);
		map.put("ÀºÇò", filds3);
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
