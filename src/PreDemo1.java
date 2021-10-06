import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PreDemo1 {
		public static void main(String[] args) {
			
			ArrayList a=new ArrayList();
			a.add(10);
			
			Predicate<Collection> pc=c->c.isEmpty();
			System.out.println(pc.test(a));
		}
	}


