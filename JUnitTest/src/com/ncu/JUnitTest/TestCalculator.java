package com.ncu.JUnitTest;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.ncu.JUnit.Calculator;

public class TestCalculator {
	private Calculator cal = new Calculator();
	
	@Before
	public void setUp() throws Exception {
		cal.clear();
	}

	@After
	public void tearDown() throws Exception {
		cal.clear();
	}

	@Test
	public void testAdd() {
		cal.add(2);
		cal.add(3);
		assertEquals(5, cal.getResult(), 0.0);
	}

	@Test(timeout=1000)
	public void testSubstract() {
		cal.add(10);
		cal.substract(2);
		assertEquals(13, cal.getResult(), 0.0);
	}

	@Ignore("testMultiply() Not Implement")
	@Test
	public void testMultiply() {
	}

	@Test(expected=ArithmeticException.class)
	public void testDivide() {
		cal.add(8);
		cal.divide(0);
		assertEquals(4,cal.getResult(), 0.0);
	}

}
