package $011.basicobject;
/*7. ����һ����ΪAccount���࣬���ڹ���һ�������˻���
 * ����������name��ʾ����������balance��ʾ��
 * �������һ�����캯��������������
 * ����һ������»��ڿ����˻���������Ǯ�����Թ��캯������һ����ΪinitialBalance��double���βΣ�
 * �������βδ���0���Ž�initialBalance��ֵ��������balance������balance��Ϊ0.0��
 * ������Ĭ�ϳ�ʼֵ������һ����ȡ����getBalance������
 * ����һ�����ڴ���credit�������÷�������һ��������ʾ��Ǯ����
 * ����һ������ȡ���debit������ȷ��ȡ����������������ˣ��������ģ�
 * �÷�����ӡһ����Ϣ�����������㣬����ȡ���
 * ��������࣬����һ��Account��������Ϊ�������������1000��
 * ���ִ��500��Ȼ��ȡ��1000������ӡ�ô����������ȡ��2000�����к�����*/
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
			System.out.println("����");
		}
	}
	
	
}
