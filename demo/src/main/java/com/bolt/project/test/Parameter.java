package com.bolt.project.test;

public  class Parameter {
	
	public static String fun1(String s) {
		String s1=s.substring(0,2);
		String s2=s.substring(s.length()-2);
		
		return s1.concat(s2);
	}
	

}
