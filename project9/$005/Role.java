package $005;

public  interface Role {//父子实例方法相同，父方法覆盖
	public static final Role STUDENT = new StudentRole();//public  abstract   class Role     abstract 修饰的role 为抽象类，不可实例化
	public static final Role ASSISTANT = new AssistantRole();
	public static final Role CASHIER = new CashierRole();
	public static final Role CAPTAIN = new CaptainRole();
	//STUDENT,ASSISTANT,CASHIER;
	public  abstract   void action( ); //如果写被覆盖
}
