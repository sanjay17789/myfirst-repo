import java.util.function.Predicate;

public class PreDemo2 {
	
		public static void main(String[] args) {
			
				String s="Hi Dad";
				Predicate<String> ps=str->str.length()>4;
				System.out.println(ps.test(s));
		}

}
