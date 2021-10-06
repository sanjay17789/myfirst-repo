package Assignments;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeMain {

	public static void main(String[] args) {
		ArrayList<Employee>a=new ArrayList<Employee>();
		a.add(new Employee("sanju","Manager",35000,"Delhi"));
		a.add(new Employee("manu","Manager",35000,"Tumkur"));
		a.add(new Employee("Chethan","Accountant",23000,"Delhi"));
		a.add(new Employee("Ravi","Analyst",26000,"Goa"));
		System.out.println(a);
		System.out.println();
		
		System.out.println("Comparrison of two objects");
		Predicate<ArrayList<Employee>> p=al->a.get(0).toString().equals(a.get(1).toString());
		if(p.test(a))
		System.out.println("objects are same");
		else 
		System.out.println("objects are different");
		
		System.out.println();
		System.out.println("display whose designation is Manager");
		//Predicate<Employee> manager=det->det.designation.equals("Manager");
		for(Employee emp : a) {
			Predicate<Employee> manager=det->det.designation.equals("Manager");
			if(manager.test(emp))
			{
				System.out.println(emp);
			}
		}
		
		
		System.out.println();
		System.out.println("Display whose city is delhi");
		Predicate<Employee> delhi=cit->cit.city.equals("Delhi");
		for(Employee emp:a) {
			if(delhi.test(emp))
			{
				System.out.println(emp);
			}
		}
		System.out.println();
		System.out.println("Display manager who city delhi");
		Predicate<Employee> manager=cit->cit.designation.equals("Manager")&& cit.city.equals("Delhi");
		for(Employee emp:a) {
			if(manager.test(emp)) {
				System.out.println(emp);
			}
		}
		
		
		
	}

}
