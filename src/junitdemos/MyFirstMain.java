package junitdemos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyFirstMain {

	@Test
	void addtest() {
		MyfirstClass junit=new MyfirstClass();
		int result=junit.add(15, 20);
		assertEquals(35, result);
	}

}
