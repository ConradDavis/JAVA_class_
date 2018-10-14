package $001;

import java.util.ArrayList;
import java.util.Iterator;

public class Diedaiqi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList v= new ArrayList();
		for(int i=0;i<5;i++) {
			v.add(String.valueOf(i));
		}
		Iterator i= v.iterator();
		while(i.hasNext()) {
			String s= (String)i.next();
			System.out.println(s);
		}

	}

}
