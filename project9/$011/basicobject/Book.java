package $011.basicobject;
/*2、定义一个图书类Book，要求如下：
（a）属性包括：书名name（String类型）、作者author（String类型），
单价price（double类型），数量amount（int类型），并且所有属性为私有。
（b）提供一个为书名name、作者author、单价price和数量amount指定初值的构造方法。
（c）为私有属性提供访问器方法，但要求书名和作者一旦初始化后不能更改。
（d）提供计算图书总价的方法totalPrice方法，图书总价＝单价×数量
定义测试类BookTest，在其main方法中创建一个书名为“Java”、
作者为“张三”，单价为30，数量为2000的图书。并计算输出该图书的总价。*/

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
