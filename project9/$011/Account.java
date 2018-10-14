package $011;

public class Account {
	
	private String  name;
	private  double initialBalance,balance=0;
	
	public Account(String name, double initialBalance) {
		super();
		this.name = name;
		if(initialBalance>0)
		this.initialBalance = initialBalance;
	}
	public double getBalance() {
		return balance;
	}
	public  void credit(double value) {
		
		balance+=value;
	}
	
public  void dedit(double value) {
		if(value <=balance)
		balance-=value;
		else
		System.out.println("Óà¶î²»×ã");
	}

	
	

}
