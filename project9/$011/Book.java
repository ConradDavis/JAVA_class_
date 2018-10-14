package $011;

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
	
public String getName() {
	return name;
}

public String getAuthor() {
	return author;
}

public void setPrice(double price) {
	this.price = price;
}

public void setAmount(int amount) {
	this.amount = amount;
}

public double totalPrice() {
	 return price*amount;
	
	
}


	
	
	
	
	
	
	
	
	
}
