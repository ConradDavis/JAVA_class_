package $001;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Qiu {
	public static Map<String, String[]>  newStadiumfieldList(){
		Map<String, String[]> map = new HashMap<String, String[]>();
		String s1[]= {" 迼禱⑩部華2",  };
		String s2[]= {" 迼禱⑩部華2",  };
		String s3[]= {" 迼禱⑩部華2",  };
		map.put( "yu",s1);
		map.put( "yu",s2);
		map.put( "yu",s3);

		return map;
		
		
	}
	public static void getStadiumfield(Map<String, String[]> map) {
		Set<String>  set= map.keySet();
		
		System.out.println("  "+map.size());
		for(String key : set) {
			
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
