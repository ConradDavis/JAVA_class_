package $011.inheri.f4;

public class Print implements InterfaceA, InterfaceB {

	@Override
	public void printLowercaseLetter() {
		// TODO Auto-generated method stub
		for(int i = 'a';i < 'a'+26;i++) {
			System.out.print((char)i+" ");
		}
	}
	@Override
	public void printCapitalLetter() {
		// TODO Auto-generated method stub
		for(int i = 'A';i < 'A'+26;i++) {
			System.out.print((char)i+" ");
		}
	}

}
