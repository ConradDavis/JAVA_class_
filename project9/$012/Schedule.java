package $012;

import java.util.HashMap;
import java.util.Set;

public class Schedule {
	private HashMap<String,String> map;

	public Schedule() {//shuxing��ʼ��
		HashMap<String,String>  map = new HashMap<String,String> ();
		map.put("����", "Java");  
		map.put("��ӱ", "Jsp");  
		map.put("����", "Jsp");  
		map.put("��λ", "Oracle");  

	}
	
public void task2() {
		map.put("guanxin", "JDBC");
		
	}
	
public void task3() {//"��ά"�޸�Ϊ"JSP"
		/*String s= map.get("��ά");
		s="JSP";*/
		//map.remove("��ά");
		map.put("��ά", "JSP");
	}
	
public void task4() {//��map��keyȡ������set����set�����������ʦ�����ܿ�
	/*Set set = map.keySet();
	String[] keys = (String[ ])(set.toArray());*/
	Object[ ] o=map.keySet().toArray();
	for(int i=0;i<o.length;i++) {
		System.out.println(o[i]+ "  "+map.get(o[i]));
	}
	
}	
	
public void task5() {	//5�� ����Map��������н�JSP ����ʦ
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
