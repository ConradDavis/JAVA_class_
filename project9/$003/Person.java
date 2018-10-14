package $003;

public class Person {
	
	private String name;
	private   Gender  gender; 
	
	public Person(String name, Gender gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	
	public void printInfo(){
		System.out.println(name + gender);

}
}
