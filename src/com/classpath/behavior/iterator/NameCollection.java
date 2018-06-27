package com.classpath.behavior.iterator;


public class NameCollection implements Collection<String> {

	 public String name[]={"Pradeep", "Praveen","Krishna","Kiran","Vinay"}; 
		
	@Override
	public Iterator<String> iterator() {
		
		return new NameIterator<String>(name) ;
	}
	
	
	
}


