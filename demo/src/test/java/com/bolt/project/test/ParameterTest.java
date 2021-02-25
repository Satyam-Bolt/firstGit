package com.bolt.project.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterTest {
	
	Parameter p=new Parameter();
	
	String inputs;
	String outputs;
	

	public ParameterTest(String inputs, String outputs) {
		this.inputs = inputs;
		this.outputs = outputs;
	}

	@Parameters
	public static Collection testCond() {
		
		String expected[][]={{"SYNOPSIS","SYIS"},{"ELEMENTRY","ELRY"},{"Education","Edon"}};
		return Arrays.asList(expected);
		
	}

	@Test
	public void test() {
		assertEquals(outputs,p.fun1(inputs));
	}

}
