package $005;

public class TestGraduate {

	public static void main(String[] args) {
		
		Graduate graduate = new Graduate();
		graduate.action();
		
		graduate.setRole(Role.ASSISTANT);
		graduate.action();
		
		graduate.setRole(Role.CASHIER);
		graduate.action();
		
		graduate.setRole(Role.CAPTAIN);
		graduate.action();

	}

}
