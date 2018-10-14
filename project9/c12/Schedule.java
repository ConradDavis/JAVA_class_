package c12;

import java.util.HashMap;
import java.util.Set;

public class Schedule {
	private HashMap<String,String> map;
	//1�� ʹ��һ��HashMap<String,String>����map��
	//����ʦ��������Ϊ��������ʦ���ڵĿγ�����Ϊֵ��
	//��ʾ�����γ̰��š�
	public Schedule() {
		map = new HashMap<String,String>();
		map.put("����", "Java");
		map.put("��ӱ", "JSP");
		map.put("����", "JSP");
		map.put("��ά", "Oracle");
	}
	//2�� ������һλ����ʦ"����"��JDBC
	public void task2() {	
		map.put("����", "JDBC");
	}
	//3�� "��ά" ��Ϊ��JSP
	public void task3() {		
		map.put("��ά", "JSP");
	}
	//4�� ��Map��keyȡ�����뵽Set�У�
	//��Set���б�����
	//������е���ʦ����ʦ���ڵĿγ�
	public void task4() {	
		/*Set set = map.keySet();
		String[] keys = (String[])(set.toArray());*/
		Object[] o = map.keySet().toArray();
		for(int i = 0;i<o.length;i++) {
			System.out.println(o[i]+" "+map.get(o[i]));
		}
	}
	//5�� ����Map��������н�JSP ����ʦ��
	public void task5() {	
		Object[] o = map.keySet().toArray();
		System.out.println("---------------------");
		for(Object key:o) {
			if(map.get((String)key).equals("JSP")) {
				System.out.println(key+" "+map.get(key));
			}
		}
	}
	public static void main(String[] args) {
		Schedule s = new Schedule();
		s.task2();
		s.task3();
		s.task4();
		s.task5();
	}
}