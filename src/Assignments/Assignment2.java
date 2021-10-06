package Assignments;
import java.util.function.Supplier;


public class Assignment2 {

	public static void main(String[] args) {
		
		

				Supplier<Integer> s=()->{Integer[] i= {1,2,3,4,5,6,7,8,9,0};

				int otp=(int) (Math.random()*10);
				return i[otp];};

				System.out.println("OTP Generated Sucessfully)");
				for (int i = 0; i < 6; i++) {
					System.out.print(s.get());
				}

			}
		

	}


