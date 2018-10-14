package $011.basicobject;
/*2������һ��ͼ����Book��Ҫ�����£�
��a�����԰���������name��String���ͣ�������author��String���ͣ���
����price��double���ͣ�������amount��int���ͣ���������������Ϊ˽�С�
��b���ṩһ��Ϊ����name������author������price������amountָ����ֵ�Ĺ��췽����
��c��Ϊ˽�������ṩ��������������Ҫ������������һ����ʼ�����ܸ��ġ�
��d���ṩ����ͼ���ܼ۵ķ���totalPrice������ͼ���ܼۣ����ۡ�����
���������BookTest������main�����д���һ������Ϊ��Java����
����Ϊ��������������Ϊ30������Ϊ2000��ͼ�顣�����������ͼ����ܼۡ�*/

public class Book {
	private String name,author;
	private double price;
	private int amount;
	public Book(String name, String author, double price, int amount) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.amount = amount;
	}
	public double totalPrice() {
		return amount*price;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	
}
