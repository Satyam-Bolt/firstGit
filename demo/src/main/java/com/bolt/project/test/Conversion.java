package com.bolt.project.test;

public class Conversion {
	
	public double currency(double dollar) {
		return dollar*72.39;
		
	}
	
	public double temp(double f) {
		return ((f-32)/9)*5;
		
	}
	
	public double length(double cm) {
		return cm/2.54;
		
	}
	public int area(int m2) {
		return m2*10000;
		
	}
	
	public String decimal(String binary) {
		int decimal=Integer.parseInt(binary,2);
		String dec=String.valueOf(decimal);
		return dec;
		
	}
	
	
	

}
