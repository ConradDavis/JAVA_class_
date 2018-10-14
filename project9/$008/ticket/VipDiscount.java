package $008.ticket;

public class VipDiscount implements Discount {
 
	public double calculate(double price) {
		System.out.println("A big gift for you!");
		return price*0.7;
	}
	 
}
 
