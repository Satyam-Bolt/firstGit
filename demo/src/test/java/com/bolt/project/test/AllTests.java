package com.bolt.project.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ConversionTest.class, ModelTest.class, ParameterTest.class })
public class AllTests {

}
