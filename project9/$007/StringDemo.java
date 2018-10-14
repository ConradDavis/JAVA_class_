package $007;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "IBM";
		String s1_old   =   s1;
		String s2= new String("IBM");//µÚ¶þÖÖString s2= "IBM"; // String s2= new String("ibm");
		s1 = s1+"    coperation";
		System.out.println(" s1_old = "+s1_old);
		System.out.println("s1=  "+ s1);
		System.out.println(s1== s1_old);
		System.out.println("s1==s2    "+  (s1==s2));
		System.out.println("s1.equals(s2)    "+  (s1.equals(s2)));
		System.out.println("s1.equalsIgnoreCase(s2)    "+  (s1.equalsIgnoreCase(s2)));
		
	
		
	}

}
