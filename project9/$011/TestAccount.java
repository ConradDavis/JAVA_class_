package $011;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account b= new Account("zhangsan",1000);
		b.credit(500);
		b.dedit(1000);
		System.out.print(b.getBalance());
		b.dedit(1000);
		
	}

}
