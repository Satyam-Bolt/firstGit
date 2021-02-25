package com.bolt.project.test;

import static org.junit.Assume.assumeTrue;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.TestCase;

public class ModelTest extends TestCase {
	
	@Test
	public void test1() {
		Model model=new Model();
	
		assumeTrue(model.isPalindrome("abcba"));
		
		
	}
	
	@Test
	public void test2() {
		Model model=new Model();
	
		
		assertEquals(30,model.add(10, 20));
		
	}
	
	
	
}
