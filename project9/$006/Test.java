package $006;

import $005.AssistantRole;
import $005.Role;
import $005.StudentRole;

public class Test {

	public static void main(String[] args) {
		AssistantRole aRole = new AssistantRole();
		StudentRole sRole = new StudentRole();
		System.out.println("aRole = "+aRole);
		int i = 1;
		System.out.println("i = "+i);
		/*Role role = sRole;
		
		if(role instanceof AssistantRole) {
			System.out.println("role 持有的是AssistantRole对象");
		}else if(role instanceof StudentRole) {
			System.out.println("role 持有的是StudentRole对象");
		}*/

	}

}
