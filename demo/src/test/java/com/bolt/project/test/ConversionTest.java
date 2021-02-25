package com.bolt.project.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ConversionTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("SUBC");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("TDAC");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("SU");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("TD");
	}

	Conversion c=new Conversion();
	
	@Test
	public void testTemp() {
		assertEquals(37, c.temp(98.6),37-c.temp(98.6));
	}
	
	@Test
	public void testDecimal() {
	
		assertEquals("10",c.decimal("1010"));
	}
	
	
	@Test
	public void testCurrency() {
		assertEquals(72.39, c.currency(1),72.39-c.currency(1));
	}
	
	@Test
	public void testLength() {
		assertEquals(1, c.length(2.54),1-c.length(2.54));
		
	}
	@Test(timeout = 001)
	public void testArea() {
		assertEquals(10000, c.area(1));
		
	}
	

}
