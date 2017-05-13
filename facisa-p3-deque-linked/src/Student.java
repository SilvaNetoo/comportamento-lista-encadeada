
public class Student {

	private String name;
	private int age;
	private Student student;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student getNext() {
		return student;
	}

	public void setNext(Student student) {
		this.student = student;
	}
}
