package $001;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		map.put("����", "Java");
		map.put("��ӱ", "JSP");
		map.put("����", "JSP");
		map.put("��ά", "Oracle");
	    map.put("����", "JDBC");
		map.remove("��ά");
		map.put("��ά", "JSP");
		Set <String> set = map.keySet();
		for (String key : set) {
			System.out.println(key+"  "+  map.get(key));
		}
		for (String str : set) {
			if (map.get(str).equals("JSP")) {
				System.out.println("��JSP����ʦ�У�" + str);
			}
		}


	}

}
