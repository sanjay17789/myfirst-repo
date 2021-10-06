package Assignments;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentData1 {
	


		String name;
		int marks;
		
		public StudentData1(String name, int marks) {
			super();
			this.name = name;
			this.marks = marks;
		}
		
		public StudentData1() {
		}

		public void populate(ArrayList<StudentData> s) {
			
			s.add(new StudentData("koushik", 78));
			s.add(new StudentData("Harika", 81));
			s.add(new StudentData("Ajith", 74));
			s.add(new StudentData("Praju", 62));
			s.add(new StudentData("Abhi", 55));
			
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getMarks() {
			return marks;
		}
		public void setMarks(int marks) {
			this.marks = marks;
		}

		@Override
		public String toString() {
			return  name + "\t\t\t "+ marks;
		}
		
		
	}



