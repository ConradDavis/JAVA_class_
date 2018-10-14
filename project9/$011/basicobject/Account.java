package $011.basicobject;
/*7. 定义一个名为Account的类，用于管理一个银行账户。
 * 该类有属性name表示储户姓名，balance表示余额。
 * 该类包含一个构造函数和三个方法。
 * 由于一般情况下会在开设账户后立即存钱，所以构造函数接收一个名为initialBalance的double型形参，
 * 如果这个形参大于0，才将initialBalance的值赋给属性balance，否则balance仍为0.0，
 * 即它的默认初始值。定义一个读取余额的getBalance方法。
 * 定义一个用于存款的credit方法，该方法接收一个参数表示存钱数。
 * 定义一个用于取款的debit方法，确保取款额不超过余额，如果超过了，则余额不更改，
 * 该方法打印一条消息，表明“余额不足，不能取款”。
 * 定义测试类，创建一个Account对象，姓名为张三，开户存款1000，
 * 后又存款500，然后取出1000，最后打印该储户的余额。如果取出2000，会有何现象？*/
public class Account {
	private String name;
	private double balance;
	public Account(String name, double initialBalance) {
		super();
		this.name = name;
		if(initialBalance > 0) {
			this.balance = initialBalance;
		}
	}
	public double getBalance() {
		return balance;
	}
	public void credit(double value) {
		balance += value;
	}
	public void debit(double value) {
		if(value <= balance) {
			balance -= value;
		}else {
			System.out.println("余额不足");
		}
	}
	
	
}
