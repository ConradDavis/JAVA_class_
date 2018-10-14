package $005;

public class Graduate {
	private Role role = Role.STUDENT;//Student,Assistant,Cashier
	
	public Graduate(Role role) {
		super();
		this.role = role;
	}
	public Graduate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	public void action() {
		role.action();
/*		if(role == Role.STUDENT) {
			learn();
		}else if(role == Role.ASSISTANT) {
			assist();
		}else if(role == Role.CASHIER) {
			doCash();
		}*/
	}	
}
