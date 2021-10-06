package Assignments;

public class Employee {
	String name;
	String designation;
	int sal;
	String city;
	
	
	public Employee(String name, String designation, int sal, String city) {
		super();
		this.name = name;
		this.designation = designation;
		this.sal = sal;
		this.city = city;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", sal=" + sal + ", city=" + city + "]";
	}
	
	
	
	

}
