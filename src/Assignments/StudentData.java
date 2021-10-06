package Assignments;

public class StudentData {
	String name;
	int marks;
	
	public StudentData(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "StudentData [name=" + name + ", marks=" + marks + "]";
	}

}
