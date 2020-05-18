package noorteck;

public class TestClass {
	int age;
	String name;
	String batch;

	public TestClass(int age, String name, String batch) {
		super();
		this.age = age;
		this.name = name;
		this.batch = batch;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public static void main(String[] args) {
		System.out.println("Branching practice");
		
		System.out.println("Accepted invitation");
		
		System.out.println("Waiting for others to responce....");
	}
}
