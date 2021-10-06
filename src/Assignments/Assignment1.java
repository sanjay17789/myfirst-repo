package Assignments;//write a pgrm of arraylist <String>where length greater then 5 using filter method
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Assignment1 {

	public static void main(String[] args) {
		
		
				
				ArrayList<String> al=new ArrayList<String>();
				
				//1.FindLengthGraterThan5UsingStream
				al.add("sanjay");
				al.add("kishan");
				al.add("manu");
				al.add("likitha");
				al.add("harish");
				al.add("vinodkumar");
				
				ArrayList<String> l=(ArrayList<String>) al.stream().filter(len->len.length()>5).collect(Collectors.toList());
				System.out.println("String Whose Length is GraterThan 5");
				System.out.println(l);
				

	}

}
