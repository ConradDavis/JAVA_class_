package $008.ticket;

public class Ticket {
 
	private double price;	 
	private Discount discount;

	public Ticket(double price) {
		this.price = price;
	}
	public double getPrice() {
		return discount == null ? price:discount.calculate(price);
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
	 
	
}
 
