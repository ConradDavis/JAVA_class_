package c12;

import java.util.HashMap;
import java.util.Set;

public class Schedule {
	private HashMap<String,String> map;
	//1） 使用一个HashMap<String,String>对象map，
	//以老师的名字作为键，以老师教授的课程名作为值，
	//表示上述课程安排。
	public Schedule() {
		map = new HashMap<String,String>();
		map.put("张明", "Java");
		map.put("赵颖", "JSP");
		map.put("刘恒", "JSP");
		map.put("王维", "Oracle");
	}
	//2） 增加了一位新老师"关鑫"教JDBC
	public void task2() {	
		map.put("关鑫", "JDBC");
	}
	//3） "王维" 改为教JSP
	public void task3() {		
		map.put("王维", "JSP");
	}
	//4） 把Map的key取出放入到Set中，
	//对Set进行遍历，
	//输出所有的老师及老师教授的课程
	public void task4() {	
		/*Set set = map.keySet();
		String[] keys = (String[])(set.toArray());*/
		Object[] o = map.keySet().toArray();
		for(int i = 0;i<o.length;i++) {
			System.out.println(o[i]+" "+map.get(o[i]));
		}
	}
	//5） 利用Map，输出所有教JSP 的老师。
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