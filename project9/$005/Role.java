package $005;

public  interface Role {//����ʵ��������ͬ������������
	public static final Role STUDENT = new StudentRole();//public  abstract   class Role     abstract ���ε�role Ϊ�����࣬����ʵ����
	public static final Role ASSISTANT = new AssistantRole();
	public static final Role CASHIER = new CashierRole();
	public static final Role CAPTAIN = new CaptainRole();
	//STUDENT,ASSISTANT,CASHIER;
	public  abstract   void action( ); //���д������
}
