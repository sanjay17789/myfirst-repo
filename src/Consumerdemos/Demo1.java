package Consumerdemos;

import java.util.function.Consumer;

public class Demo1 {
//one input no output
	public static void main(String[] args) {
		Consumer<String>c=s->System.out.println("Hello"+s);
		c.accept("Raju");

		
	   Consumer<Integer>c1=s->System.out.println(s);
	   c1.accept(4);
	}

}
//http://tutorials.jenkov.com/java-functional-programming/functional-composition.html#andthen