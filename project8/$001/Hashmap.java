package $001;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		map.put("张明", "Java");
		map.put("赵颖", "JSP");
		map.put("刘恒", "JSP");
		map.put("王维", "Oracle");
	    map.put("关鑫", "JDBC");
		map.remove("王维");
		map.put("王维", "JSP");
		Set <String> set = map.keySet();
		for (String key : set) {
			System.out.println(key+"  "+  map.get(key));
		}
		for (String str : set) {
			if (map.get(str).equals("JSP")) {
				System.out.println("教JSP的老师有：" + str);
			}
		}


	}

}
