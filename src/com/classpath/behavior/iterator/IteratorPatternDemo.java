package com.classpath.behavior.iterator;

public class IteratorPatternDemo {
	public static void main(String[] args) {
		NameCollection cmpnyRepository = new NameCollection();
	      
	      Iterator it = cmpnyRepository.iterator();
	      
	      while(it .hasNext()) {
	          String name = (String)it.next();
	          System.out.println("Name : " + name);
	       } 	
	      
	}
}
