package $011.inheri.f4;

public class E {
	public static void main(String[] args) {
		InterfaceA ia = new Print();
		InterfaceB ib = new Print();
		
		ia.printCapitalLetter();
		System.out.print("\n");
		ib.printLowercaseLetter();
		
	}
}
