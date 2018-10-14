package $011.inheri.f5;

public class Clothing extends Goods{
	String style;

	public Clothing(double unitPrice, double account, String style) {
		super(unitPrice, account);
		this.style = style;
	}
	void show() {
		super.show();
		System.out.println("¿îÊ½ÊÇ£º"+style);
	}
	
}
