package $012;

import java.util.HashMap;
import java.util.Set;

public class Schedule {
	private HashMap<String,String> map;

	public Schedule() {//shuxing初始化
		HashMap<String,String>  map = new HashMap<String,String> ();
		map.put("张明", "Java");  
		map.put("赵颖", "Jsp");  
		map.put("刘恒", "Jsp");  
		map.put("张位", "Oracle");  

	}
	
public void task2() {
		map.put("guanxin", "JDBC");
		
	}
	
public void task3() {//"王维"修改为"JSP"
		/*String s= map.get("王维");
		s="JSP";*/
		//map.remove("王维");
		map.put("王维", "JSP");
	}
	
public void task4() {//把map的key取出放入set，对set遍历，输出老师及所受课
	/*Set set = map.keySet();
	String[] keys = (String[ ])(set.toArray());*/
	Object[ ] o=map.keySet().toArray();
	for(int i=0;i<o.length;i++) {
		System.out.println(o[i]+ "  "+map.get(o[i]));
	}
	
}	
	
public void task5() {	//5） 利用Map，输出所有教JSP 的老师
	Object[] o = map.keySet().toArray();
	System.out.println("---------------------");
	for(Object key:o) {
		if(map.get((String)key).equals("JSP")) {
			System.out.println(key+" "+map.get(key));
		}
	}
}
	public static void main(String[] args) {
		Schedule s=new Schedule();
		s.task2();
		s.task3();
		s.task4();
		s.task5();

	}
	

}
