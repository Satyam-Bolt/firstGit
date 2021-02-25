package com.bolt.project.test;

public class Model {

	public int add(int a,int b) {
		return a+b;
	}
	public boolean ifEqual(String msg) {
		boolean res=false;
		if(msg.length()<=1)
			res=false;
		else if(msg.length()==2)
			res= true;
		else {
			String s1=msg.substring(0,2);
			String s2=msg.substring(msg.length()-2);
			if(s1.equals(s2)) {
				res=true;
			}
			else res=false;
		}
		return res;
		
	}
	
	public  boolean isPalindrome(String str){  
	    StringBuilder sb=new StringBuilder(str);  
	    sb.reverse();  
	    String rev=sb.toString();  
	    if(str.equals(rev)){  
	        return true;  
	    }else{  
	        return false;  
	    }  
	}  
	
}
