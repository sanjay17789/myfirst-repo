package Assignments;
import java.util.ArrayList;
import java.util.function.Function;

public class StudentMain {

	public static void main(String[] args) {
		ArrayList<StudentData> al=new ArrayList<StudentData>();
		al.add(new StudentData("prajwal", 79));
		al.add(new StudentData("Ankith", 81));
		al.add(new StudentData("Santhu", 59));
		al.add(new StudentData("pramod", 55));
		al.add(new StudentData("manu", 75));
		al.add(new StudentData("Ajith", 89));
		al.add(new StudentData("Shashi", 74));
		
		for (StudentData stud : al) {
		Function<ArrayList<StudentData>,Character> f=sd->{if (stud.marks<60) {return 'C';
		}
		else if (stud.marks>60&&stud.marks<75) {
			return 'B';
		}
		else if (stud.marks>75) {
			return 'A';
		}
		else
			return 'D';
		};
		System.out.println(stud+" \t"+f.apply(new ArrayList<StudentData>())+" "+"Grade");
		}
		
		
		
		
		
		

	}

}
