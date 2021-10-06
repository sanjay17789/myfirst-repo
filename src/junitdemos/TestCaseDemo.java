package junitdemos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class TestCaseDemo extends TestCase {

	Calculator calc;
		
	public TestCaseDemo() {
		super();
	}

	public TestCaseDemo(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		calc=new Calculator();
	}

	protected void tearDown() throws Exception {
		calc=null;
	}

	public void testAddForTwoPositiveValues() {
		assertEquals(9,calc.add(5,4));
		
	}

	public void testAddForTwoNegativeValues() {
		assertEquals(-9,calc.add(-5,-4));
		
	}
	
	public void testMultiply() {
		assertEquals(100,calc.multiply(10,10));
	} 
	
	/*public void testMultiplyForOneZeroValue() {
		
		assertEquals("Number must be non-zero please....",calc.multiply(10,0));
	}*/

	public void testDivide() {
		 assertEquals(3.0,calc.divide(15,5));
	}
	
	/*public void testDivideForZeroDenominator() {
		assertEquals("Denominator must be positive number please....", calc.divide(15,0));
	}*/
}
