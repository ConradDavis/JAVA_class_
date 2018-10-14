package $011.collections;

import java.util.ArrayList;
import java.util.Iterator;

/*��ArrayList����Ҫ�������Ŀ��д��
1������ArrayList����list��
��������ַ�������s1��s2��s3��
�ַ�����ֵ�ֱ�Ϊ001��002��003
2�� ͨ��forѭ����list���б��������ȫ���ַ���
3�� �����Ƿ����s1��������ڣ�ɾ��
4������������it ��ʹ�õ�������list���б�����
���ȫ���ַ���*/

public class ArrayListTest {
	public static void showAll1(ArrayList<String> list) {
		System.out.println("-------show1-----");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));			
		}
		for(String s:list) {
			System.out.println(s);			
		}
		System.out.println("-------show1-----");
	}
	public static void delete(String delS,ArrayList<String> list) {
		for(int i=0;i<list.size();i++) {
			if(delS.equals(list.get(i))) {
				list.remove(i);
			}
		}
		//list.remove(delS);
	}
	public static void showAll2(ArrayList<String> list) {
		System.out.println("-------show2-----");
		Iterator iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("-------show2-----");
	}
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		String s1,s2,s3;
		s1 = "001";
		s2 = "002";
		list.add(s1);
		list.add(s2);
		list.add(s3 = "003");
		showAll1(list);
		delete(s1,list);
		showAll2(list);

	}

}
