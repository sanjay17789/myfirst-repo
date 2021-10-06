package Assignments;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class StudentMain1 {

	public static void main(String[] args) {
		

		

				ArrayList<StudentData> sdata=new ArrayList<StudentData>();

				StudentData1 sd=new StudentData1();
				sd.populate(sdata);

				System.out.println("A.Student whose marks is grater than 60");
				System.out.println("Student Name \t\t Marks>60");
				System.out.println("--------------------------------");
				for (StudentData stu : sdata) {
					Predicate<ArrayList<StudentData>> marksgtr60=mgt->stu.marks>60;
					if (marksgtr60.test(sdata)) {
						System.out.println(stu);
					}
				}
				System.out.println();
				System.out.println("B.Display Students Grade Based on Marks using Functional Interface");
				System.out.println("Student Name \t\t Marks \t\t Grade");
				System.out.println("--------------------------------"+"\t"+"*********");
				for (StudentData stud : sdata) {
					Function<ArrayList<StudentData>,Character> calgrade=sdgrade->{if (stud.marks<60) {return 'C';
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
					System.out.println(stud+" \t\t"+calgrade.apply(new ArrayList<StudentData>())+" "+"Grade");
				}

				System.out.println();
				System.out.println("C.Display Students Grade Based on Marks using Consumer Interface");
				System.out.println("Student Name \t\t Marks \t\t Grade");
				System.out.println("--------------------------------"+"\t"+"*********");
				for (StudentData st : sdata) {
					Consumer<ArrayList<StudentData>> stugrade=grade->{if (st.marks<60) {System.out.println("C grade");;
					}
					else if (st.marks>60&&st.marks<75) {
						System.out.println("B grade");
					}
					else if (st.marks>75) {
						System.out.println("A grade");;
					}
					else
						System.out.println("D grade");;
					};
					
					System.out.print(st+"\t\t");
					stugrade.accept(sdata);
				}
			}
		


	}


