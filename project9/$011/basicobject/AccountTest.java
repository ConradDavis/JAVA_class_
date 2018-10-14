package $011.basicobject;

public class AccountTest {

	public static void main(String[] args) {
		Account a = new Account("уехЩ",1000);
		
		a.credit(500);
		a.debit(1000);
		System.out.println("balance = "+a.getBalance());
		a.debit(1000);
	}

}
