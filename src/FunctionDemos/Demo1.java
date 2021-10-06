package FunctionDemos;

import java.util.function.Function;

public class Demo1 {
//one input one output
	public static void main(String[] args) {
		Function<String,Integer>f=s->s.length();
		System.out.println(f.apply("Sanju"));
		System.out.println(f.apply("Pushpak"));
		
		
		Function<String,Character>f1=s->s.charAt(2);
		System.out.println(f1.apply("hemanth"));
		System.out.println(f1.apply("prethi"));
		
		
		Function<Integer,Integer>f2=i->i*i;
		System.out.println(f2.apply(3));
		System.out.println(f2.apply(5));

	}

}
