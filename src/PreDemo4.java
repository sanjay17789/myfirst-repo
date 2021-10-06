import java.util.function.Predicate;

public class PreDemo4 {
	
		public static void main(String[] args) {

			String names[]={"Nikhil","Nirmal","Kavya","Shree Ganesh"};
			Predicate<String> s=s1->s1.charAt(0)=='K';
			for (String s2:names) {
				if(s.test(s2))
					System.out.println(s2);
			}
		}

}
