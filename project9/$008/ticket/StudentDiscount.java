package $008.ticket;

public class StudentDiscount implements Discount {
 
	public double calculate(double price) {
		return price*0.8;
	}
	 
}
 
