package $003;

public class Adam {

	private String name;
	private Gender gender;
	private static Adam anInstance;

	private Adam() {

	}

	public void eatApple() {

	}

	public static Adam getAnInstance() {
		// TODO Auto-generated method stub
		if (anInstance == null)
			anInstance = new Adam();

		return anInstance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

}
