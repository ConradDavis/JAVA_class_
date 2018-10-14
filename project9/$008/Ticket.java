package $008;

public class Ticket {
 
	private double price;	 
	private Discount discount;
	 
	public Ticket (double Price) {
		this.price= price;
		
	}
	 
	public double set(Discount discount) {
		this.discount= discount;
		return 0;
	}
	 
	public double getPrice() {
		
		
		return discount == null ? price:discount.calcutete(price);
	}
	 
}
 
