package $008.ticket;

public class TestTicket {

	
	
	public static void main(String[] args) {
		Ticket ticket4Student = new Ticket(40.0);
		ticket4Student.setDiscount(new StudentDiscount());
		System.out.println("Student :"+ticket4Student.getPrice());
		
		Ticket ticket4Children = new Ticket(40.0);
		ticket4Children.setDiscount(new ChildrenDiscount());
		System.out.println("Children :"+ticket4Children.getPrice());
		
		Ticket ticket4VIP = new Ticket(40.0);
		ticket4VIP.setDiscount(new VipDiscount());
		System.out.println("VIP :"+ticket4VIP.getPrice());

	}

}
