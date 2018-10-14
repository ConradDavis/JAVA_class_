package $008.ticket;

public class ChildrenDiscount implements Discount {
 
	public double calculate(double price) {
		return price*0.5;
	}
	 
}
 
