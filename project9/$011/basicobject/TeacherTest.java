package $011.basicobject;

public class TeacherTest {

	public static void main(String[] args) {
		Teacher t1,t2;
		t1 = new Teacher(96);
		t2 = new Teacher(64);
		Teacher.setIndex(1.2);
		System.out.println(t1.courseCompute());
		System.out.println(t2.courseCompute());
		System.out.println(Teacher.getNum());
		

	}

}
