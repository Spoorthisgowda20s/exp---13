package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator cal = new Calculator();
	
	@Test
	public void testAdd() {
		assertEquals(6, cal.add(4, 2));
	}
	
	@Test
	public void testSubtract() {
		assertEquals(6, cal.subtract(8, 2));
	}
	
	@Test
	public void testMultiply() {
		assertEquals(6, cal.multiply(3, 2));
	}
	
	@Test
	public void testDivide() {
		assertEquals(1, cal.divide(3, 2));
	}
	
	@Test
	void testDivisionByZero() {
		assertThrows(ArithmeticException.class, () -> {
			cal.divide(10, 0);
		});
	}
}