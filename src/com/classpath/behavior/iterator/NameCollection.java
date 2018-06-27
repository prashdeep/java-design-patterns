package com.classpath.behavior.iterator;


public class NameCollection implements Collection {

	 public String name[]={"Pradeep", "Praveen","Krishna","Kiran","Vinay"}; 
		
	@Override
	public Iterator iterator() {
		
		return new NameIterator(name) ;
	}
	
	
	
}


